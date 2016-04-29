#!/bin/bash

# Pre-commit script is responsible for execute the "put back" method of our lens when a client commits changes to a front repository.
# This hook has to be placed into the hooks directory of every front repository.
# For the configuration, set the following variables:

# - If $ADMIN is the committer, we don't have to do anything here.
# - If $LOCK_FILE exists, we have to reject the commit request.

# 1. Clear WORKSPACE folder
# 2. Checkout gold to $WORKSPACE_GOLD
# 3. Get the changes from the front repository
# 4. Get the commit message
# 5. Create the WORKSPACE folder for the current front repository $WORKSPACE_FRONT
# 6. Check that the rule and query files exists in $WORKSPACE_GOLD
#     if not, we don't have to run lens transformation
# 7. Start iterating over the changes
# 8. Step into the $WORKSPACE_GOLD
# 9. Add all changes to svn
#10. Store multi-line commit message
#11. Execute commit on the gold repository
#12. Remove lock file

set -e # Exit from the script if any subcommand or pipeline returns an error.

# Get the current directory
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

# Load the configuration files
. $DIR/../config/$3/config.properties

function known_model_extension {
  contains=false

  IFS_OLD_SUB=$IFS
  IFS=","
  for extension in $MODEL_EXTENSIONS
  do
    if [[ $1 =~ .${extension}$ ]]; then
      contains=true
    fi
  done
  IFS=$IFS_OLD_SUB

  echo "$contains"
}

# Replace from $2 to $3 in $1
function replace {
    echo "${1/$2/$3}"
}

# Default functions for logging
function timestamp {
  # returns the current time
  date +"%Y-%m-%d_%H-%M-%S"
}

# logger function
function log {
  # append the current time and $1 arg to the log file
  echo "$(timestamp) $1" 1>>$LOG
}

# concate path parts and includes a slash "/" if necessary
function concate_path_parts {
  result=$1
  for part in "$@"
  do
      if [ "$part" != "$result" ]; then
        if [[ $part == \/* ]]; then
          part_updated=${part:1}
        else
          part_updated=$part
        fi
        case "$result" in
        */)
            result=$result$part_updated
            ;;
        *)
            result=$result/$part_updated
            ;;
        esac
      fi
  done
  echo $result
}

# Setting the parameters

LOCK_FILE=$DIR/../lock/.lock-front
WORKSPACE=$DIR/../workspace

CURRENT_FRONT_REPOS="$1"                                                                          #Current front repository
CURRENT_FRONT_REPOS_URL=$(concate_path_parts $URL $CURRENT_FRONT_REPOS)                           #URL of current front repository
GOLD_REPOS_URL=$(concate_path_parts $URL $SVN_URL_PATH $GOLD_REPO_NAME)	                          #URL of the gold repository
WORKSPACE_GOLD=$(concate_path_parts $WORKSPACE "WORKSPACE_GOLD_PRECOMMIT" $SVN_PATH_OS $GOLD_REPO_NAME)        #Gold repository WORKSPACE folder
WORKSPACE_FRONT=$(concate_path_parts $WORKSPACE "WORKSPACE_FRONT" "CURRENT" $CURRENT_FRONT_REPOS) #Front repository WORKSPACE folder
TXN="$2"                                                                                          #TXN number of commit
FRONT_USER=$(svnlook author -t $TXN $CURRENT_FRONT_REPOS)                                         #Current user
CURRENT_FRONT_REPOS_NAME=$(replace $CURRENT_FRONT_REPOS "/$SVN_PATH_URL" "")                      #Remove SVN_PATH from repository

LOG="$DIR/../log/front-pre-commit${CURRENT_FRONT_REPOS//\//-}.log"                                                                     #Log file

log "======================================================="
log "Executing Front-side Pre-commit on $CURRENT_FRONT_REPOS"

if [ "$FRONT_USER" = "$ADMIN_USER" ]; then
  log "Admin was the committer. Nothing to do right now"
  log "-------------------------------------------------------"
  exit 0
fi

# Check for a lock file
if [ -f $LOCK_FILE ]; then
  log "File exists, we have to reject your commit".
  echo "MONDO Error: Another commit is under execution. Please wait until it finishes." 1>&2
  exit 1
else
  touch $LOCK_FILE
fi

log "Step 1: clear WORKSPACE folder - $WORKSPACE"
rm -rf $WORKSPACE/*

log "Step 2: checkout gold - from $GOLD_REPOS_URL to $WORKSPACE_GOLD"
svn checkout $GOLD_REPOS_URL $WORKSPACE_GOLD -q --username $ADMIN_USER --password $ADMIN_PWD --quiet --non-interactive

log "Step 3: get change list"
changes=$(svnlook changed -t $TXN $CURRENT_FRONT_REPOS)

log "Step 4: get commit message"
MSG=$(svnlook log -t $TXN $CURRENT_FRONT_REPOS)

log "Step 5: create WORKSPACE front folder: $WORKSPACE_FRONT"
mkdir -p $WORKSPACE_FRONT

log "Step 6: check that the rules and queries files exist"
LENS_CAN_EXECUTE=false;
LENS_EXECUTE_WITH_LOCK=false;
if [ -f $(concate_path_parts $WORKSPACE_GOLD $PATH_TO_ACCESS_CONTROL_RULES_FROM_REPOSITORY_ROOT) ]
then
  if [ -f $(concate_path_parts $WORKSPACE_GOLD $PATH_TO_ACCESS_CONTROL_AND_LOCK_QUERIES_FROM_REPOSITORY_ROOT) ]
  then
    LENS_CAN_EXECUTE=true;
    log "* Both files exist"

    OBFUSCATOR_SEED="seed_$CURRENT_FRONT_REPOS_NAME"
    OBFUSCATOR_SALT="salt_$CURRENT_FRONT_REPOS_NAME"
    OBFUSCATOR_PREFIX="mondo"
    if [ -f $(concate_path_parts $WORKSPACE_GOLD $PATH_TO_LOCK_RULES_FROM_REPOSITORY_ROOT) ]
    then
      LENS_EXECUTE_WITH_LOCK=true;
      log "* Lock file exists"
    fi
  fi
else
  log "* Files don't exist"
fi

LENS_DIR="$DIR/../invoker/invoker.sh"
log "Step 7: Start iterating over the changes"
counter=0
for line in $changes; do
   val=$(($counter % 2))
   if [ $val = 0 ]
   then
       nextType=$line
   fi
   if [ $val = 1 ]
   then
   	nextChange=$line
    log "     -> Change: $nextType $nextChange"
  	if [ $nextType = "A" ] || [ $nextType = "U" ] || [ $nextType = "UU" ]
  	then
  	   case $nextChange in
       		*/)
          log "     -> Action: Create Dir $WORKSPACE_GOLD/$nextChange"
          mkdir -p "$WORKSPACE_GOLD/$nextChange"
          ;;
       		*)
          log "     -> Action: Copy Content $WORKSPACE_FRONT/$nextChange"
          DIR="$WORKSPACE_FRONT/$nextChange"
          BASEDIR=$(dirname "${DIR}")
          if [ ! -d $BASEDIR ]
          then
            mkdir -p $BASEDIR
          fi
          svnlook cat -t $TXN $CURRENT_FRONT_REPOS $nextChange > "$WORKSPACE_FRONT/$nextChange"
          if [ $(known_model_extension $nextChange) = true ]
          then
            if [ $LENS_CAN_EXECUTE = true ]
            then
              log "     -> Action: Execute lens $WORKSPACE_FRONT/$nextChange"
              chmod oa+rw $WORKSPACE_GOLD/$nextChange
              chmod oa+rw $WORKSPACE_FRONT/$nextChange
              if [ $LENS_EXECUTE_WITH_LOCK = true ]
              then
                log "     -> Lens is using locking feature"
                $LENS_DIR $FRONT_USER $WORKSPACE_GOLD/$nextChange $WORKSPACE_FRONT/$nextChange -performPutback $WORKSPACE $OBFUSCATOR_SALT $OBFUSCATOR_SEED $OBFUSCATOR_PREFIX $WORKSPACE_GOLD/$PATH_TO_ACCESS_CONTROL_RULES_FROM_REPOSITORY_ROOT $WORKSPACE_GOLD/$PATH_TO_ACCESS_CONTROL_AND_LOCK_QUERIES_FROM_REPOSITORY_ROOT $WORKSPACE_GOLD/$PATH_TO_LOCK_RULES_FROM_REPOSITORY_ROOT
              else
                log "     -> Only Access Control rules will be used"
                $LENS_DIR $FRONT_USER $WORKSPACE_GOLD/$nextChange $WORKSPACE_FRONT/$nextChange -performPutback $WORKSPACE $OBFUSCATOR_SALT $OBFUSCATOR_SEED $OBFUSCATOR_PREFIX $WORKSPACE_GOLD/$PATH_TO_ACCESS_CONTROL_RULES_FROM_REPOSITORY_ROOT $WORKSPACE_GOLD/$PATH_TO_ACCESS_CONTROL_AND_LOCK_QUERIES_FROM_REPOSITORY_ROOT
              fi
            else
              log "     -> Action: Have to be copied to gold $WORKSPACE_FRONT/$nextChange"
              cp -rf $WORKSPACE_FRONT/$nextChange $WORKSPACE_GOLD/$nextChange
            fi
          else
            log "     -> Action: Copy to gold $WORKSPACE_FRONT/$nextChange"
            cp -rf $WORKSPACE_FRONT/$nextChange $WORKSPACE_GOLD/$nextChange
          fi
          ;;
  	   esac
    fi

  	if [ $nextType = "D" ]
  	then
      log "     -> Action: Delete $WORKSPACE_GOLD/$nextChange"
      rm -rf "$WORKSPACE_GOLD/$nextChange"
    fi
   fi
   counter=$((counter+1))
done

log "Step 8: Step into the gold folder"
cd $WORKSPACE_GOLD

log "Step 9: Add changes to SVN"
svn add --force * --auto-props --parents --depth infinity -q

log "Step 10: Store commit message"
echo "$MSG" 1>"svn-commit.tmp"

log "Step 11: Commit changes to the gold"
svn commit -F svn-commit.tmp --username $ADMIN_USER --password $ADMIN_PWD --quiet --non-interactive

#log "Step 12: Remove WORKSPACEorary files"
#rm -rf $WORKSPACE/*

log "Step 12: Remove lock file"
rm -r $LOCK_FILE

rm -rf $WORKSPACE_GOLD
rm -rf $WORKSPACE_FRONT

log "Pre-commit finished successfully"
log "-------------------------------------------------------"
exit 0
