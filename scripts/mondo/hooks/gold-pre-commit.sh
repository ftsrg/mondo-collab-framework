#!/bin/bash

# Post-commit script is responsible for execute the "get" method of our lens when commit occurs on the gold repository.
# This hook has to be placed into the hooks directory of the gold repository.
# For the configuration, set the following variables:

# 1. Clear the WORKSPACEorary Additional Front repository folder
# 2. Clear the WORKSPACEorary Gold repository folder
# 3. Checkout Gold reposiroty to $WORKSPACE_GOLD
# 4. Check that the rule and query files exists in $WORKSPACE_GOLD
#     if not, we don't have to run lens transformation
# 5. Get the changes from the front repository
# 6. Iterate over the front list
# 6.1 Check the trigger repository
#     If this is the specific repository that triggered the execution, we don't have to do anything
# 6.2 Iterate over the changes
# 6.3 Get committer name
# 6.4 Get the commit message
# 6.5 Add all changes in the front repository
# 6.6 Commit the changes to the front repository in the name of admin

set -e # Exit from the script if any subcommand or pipeline returns an error.

# Get the current directory
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

ROOT=$3

# Load the configuration files
. $DIR/../config/global-config.properties
. $DIR/../config/$3/config.properties
. $DIR/../config/global-config.properties

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

LOCK_FILE=$DIR/../lock/.lock-gold
WORKSPACE=$DIR/../workspace

GOLD_REPOS="$1"                                                                          # Gold repository
GOLD_REPOS_URL=$(concate_path_parts $URL $GOLD_REPOS)                                    # URL of the gold repository
WORKSPACE_GOLD=$(concate_path_parts $WORKSPACE "WORKSPACE_GOLD_POSTCOMMIT" $GOLD_REPOS)  # Gold repository WORKSPACEorary folder
WORKSPACE_FRONTS=$(concate_path_parts $WORKSPACE "WORKSPACE_FRONT" "Additional")         # WORKSPACEorary folder for all the front reposiroties
WORKSPACE_CURRENT=$(concate_path_parts $WORKSPACE "WORKSPACE_FRONT" "CURRENT")           # WORKSPACEorary folder of the current "committer" front repository
REV="$2"                                                                                 # Revision number
LOG="$DIR/../log/gold-pre-commit${GOLD_REPOS//\//-}.log"                                                           # Log file
touch $LOG

log "======================================================="
log "Executing Gold Pre-commit on $GOLD_REPOS"
log $GOLD_REPOS


# Check for a lock file
if [ -f $LOCK_FILE ]; then
  log "File exists, we have to reject your commit".
  echo "MONDO Error: Another commit is under execution. Please wait until it finishes." 1>&2
  exit 1
else
  touch $LOCK_FILE
fi

log "Step 1: clear WORKSPACE_FRONTS - $WORKSPACE_FRONTS"
rm -rf $WORKSPACE_FRONTS

log "Step 2: clear WORKSPACE Gold folder - $WORKSPACE_GOLD"
rm -rf "$WORKSPACE_GOLD"

 log "Step 3: checkout lens related files from $GOLD_REPOS_URL to $WORKSPACE_GOLD"
svn checkout "$GOLD_REPOS_URL" "$WORKSPACE_GOLD" --username $ADMIN_USER --password $ADMIN_PWD

mkdir -p "$(dirname "$WORKSPACE_GOLD/$PATH_TO_ACCESS_CONTROL_RULES_FROM_REPOSITORY_ROOT")" && svnlook cat -t $REV $GOLD_REPOS $PATH_TO_ACCESS_CONTROL_RULES_FROM_REPOSITORY_ROOT > "$WORKSPACE_GOLD/$PATH_TO_ACCESS_CONTROL_RULES_FROM_REPOSITORY_ROOT"
mkdir -p "$(dirname "$WORKSPACE_GOLD/$PATH_TO_ACCESS_CONTROL_AND_LOCK_QUERIES_FROM_REPOSITORY_ROOT")" && svnlook cat -t $REV $GOLD_REPOS $PATH_TO_ACCESS_CONTROL_AND_LOCK_QUERIES_FROM_REPOSITORY_ROOT > "$WORKSPACE_GOLD/$PATH_TO_ACCESS_CONTROL_AND_LOCK_QUERIES_FROM_REPOSITORY_ROOT"


log "Step 4: check that the rule, query and lock files exist"
LENS_CAN_EXECUTE=false;
if [ -f $(concate_path_parts $WORKSPACE_GOLD $PATH_TO_ACCESS_CONTROL_RULES_FROM_REPOSITORY_ROOT) ]
then
  if [ -f $(concate_path_parts $WORKSPACE_GOLD $PATH_TO_ACCESS_CONTROL_AND_LOCK_QUERIES_FROM_REPOSITORY_ROOT) ]
  then
    LENS_CAN_EXECUTE=true;
    log "* Both files exist"
  else
    log "* Rule file exists but Query does not"
  fi
else
  log "* Files don't exist"
fi

log "Step 5: get change list"
changes=$(svnlook changed -t $REV $GOLD_REPOS)

LENS_DIR="$DIR/../invoker/invoker.sh"

log "Step 6: iterate over the front list"
USER_FRONT_MAPPING=$(cat $DIR/../config/$3/gen/user_front.properties)
for entry in $USER_FRONT_MAPPING; do
  oldIFS=$IFS
  IFS='='
  set x $entry
  FRONT_USER="$2" # Username for the lens, stored in front_list.properties file
  FRONT_REPOS="$3" # Front repository, stored in front_list.properties file
  CURRENT_REPO=$(concate_path_parts $WORKSPACE_FRONTS $FRONT_REPOS) # WORKSPACEorary folder the current front repository
  CURRENT_REPO_URL=$(concate_path_parts $URL $SVN_URL_PATH $FRONT_REPOS) # URL of the current front repository
  TRIGGER_REPO=$(concate_path_parts $WORKSPACE_CURRENT $SVN_URL_PATH $FRONT_REPOS) # Possible trigger repository folder to test
  log "* processing: $FRONT_REPOS in the name of $FRONT_USER"
  # If this is not the current repo
  if [ ! -d  $TRIGGER_REPO ]; then
    log "* Note: Another front repo triggered the process - $TRIGGER_REPO not exists"
    log "* checkout the repository - from $CURRENT_REPO_URL to $CURRENT_REPO"
    svn checkout "$CURRENT_REPO_URL" "$CURRENT_REPO" --username $ADMIN_USER --password $ADMIN_PWD --quiet --non-interactive
    # log "* synchronizing the source tree $WORKSPACE_GOLD/ $CURRENT_REPO"
    # log "* rsync -av --exclude='.svn' $WORKSPACE_GOLD/ $CURRENT_REPO"
    # rsync -av --exclude=".svn" $WORKSPACE_GOLD/ $CURRENT_REPO
    IFS=$'\n'
    log "* start iterating over the changes"
    counter=0
    for line in $changes; do
       nextType=${line:0:1}
       nextChange=${line:4}
        log "     -> Change: $nextType $nextChange"
      	if [[ "$nextType" == "A" ]] || [[ "$nextType" == "U" ]] || [[ "$nextType" == "UU" ]]
      	then
      	   case $nextChange in
           		*/)
              log "     -> Action: Create Dir $CURRENT_REPO/$nextChange"
              mkdir -p "$CURRENT_REPO/$nextChange"
              ;;
           		*)
              log "     -> Action: Copy Content $CURRENT_REPO/$nextChange"
              DIR="$CURRENT_REPO/$nextChange"
              BASEDIR=$(dirname "${DIR}")
              if [ ! -d $BASEDIR ]
              then
                mkdir -p $BASEDIR
              fi

    	      EXTENSION=`echo "$nextChange" | cut -d'.' -f2`

              svnlook cat -t $REV $GOLD_REPOS $nextChange > "$CURRENT_REPO/$nextChange.$EXTENSION"
              chmod oa+rw $CURRENT_REPO/$nextChange.$EXTENSION

              if [[ "$(known_model_extension $nextChange)" == "true" ]]
              then
                if [[ "$LENS_CAN_EXECUTE" == "true" ]]
                then
                  log "     -> Action: Execute lens $CURRENT_REPO/$nextChange"


                  OBFUSCATOR_SEED="seed_$CURRENT_REPO"
                  OBFUSCATOR_SALT="salt_$CURRENT_REPO"
                  OBFUSCATOR_PREFIX="mondo"

                  log " access rules: $WORKSPACE_GOLD/$PATH_TO_ACCESS_CONTROL_RULES_FROM_REPOSITORY_ROOT $WORKSPACE_GOLD/$PATH_TO_ACCESS_CONTROL_AND_LOCK_QUERIES_FROM_REPOSITORY_ROOT"
                  $LENS_DIR $FRONT_USER $CURRENT_REPO/$nextChange.$EXTENSION $CURRENT_REPO/$nextChange -performGet $WORKSPACE $OBFUSCATOR_SALT $OBFUSCATOR_SEED $OBFUSCATOR_PREFIX $WORKSPACE_GOLD/$PATH_TO_ACCESS_CONTROL_RULES_FROM_REPOSITORY_ROOT $WORKSPACE_GOLD/$PATH_TO_ACCESS_CONTROL_AND_LOCK_QUERIES_FROM_REPOSITORY_ROOT "" $ROOT
                  rm $CURRENT_REPO/$nextChange.$EXTENSION
		else
                  log "     -> Action: Cannot execute lens. Copy to gold $CURRENT_REPO/$nextChange"
		  mv $CURRENT_REPO/$nextChange.$EXTENSION $CURRENT_REPO/$nextChange
                fi
              else
                log "     -> Action: Copy to gold"
		mv $CURRENT_REPO/$nextChange.$EXTENSION $CURRENT_REPO/$nextChange  
              fi
              ;;
      	   esac
        fi
      	if [ $nextType == "D" ]
      	then
          log "     -> Action: Delete $CURRENT_REPO/$nextChange"
          rm -rf "$CURRENT_REPO/$nextChange"
        fi
    done
    IFS="$oldIFS"

    log "Step 6.3: get commit message"
    log "svn log -q -v --xml --with-all-revprops $WORKSPACE_GOLD"
    MSG=$(svn log -q -v --xml --with-all-revprops $WORKSPACE_GOLD --username $ADMIN_USER --password $ADMIN_PWD | grep msg | sed -e "s/<msg>\([^<]*\)<\/msg>/\1/g")
    log "* commit message is: $MSG"
    log "Step 6.4: get author name"
    AUTHOR=$(svnlook log -t $REV  $GOLD_REPOS | grep -E '\|' | cut -f2 -d'|' | sort | uniq)
    log "* author name is: $AUTHOR"
    log "* step into the current folder - $CURRENT_REPO"
    cd $CURRENT_REPO

    log "Step 6.5 add all modifications to svn"
    svn add --force * --auto-props --parents --depth infinity -q

    log "Step 6.6 store message into a WORKSPACE file"
    echo "$MSG" 1>"svn-commit.tmp"

    log "Step 6.7 execute commit"
    svn commit -F svn-commit.tmp --username $ADMIN_USER --password $ADMIN_PWD --quiet --non-interactive
  else
    log "* Skipping this repo: $FRONT_USER is the current committer"
  fi
done

log "Step 12: Remove lock file"
rm $LOCK_FILE

rm -rf $WORKSPACE_GOLD
rm -rf $WORKSPACE_FRONTS

log "Post-commit finished successfully"
log "-------------------------------------------------------"
exit 0
