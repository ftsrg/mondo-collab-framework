#!/bin/bash

# Help text

if [ $# -lt 2 -o "$1" == "--help" -o "$1" == "-h" -o "$1" == "" ]; then
	echo "This script resets a front repository for a given user by iterating over all revisions in the gold repository and applying the transformation for the different versions of the models."
	echo "Usage: $(basename $0) <gold_repository_name> <username>"
	echo "    gold_repository_name: the name of the gold repository"
	echo "    username: the name of the user whose front repository should be reset"
	exit 0
fi

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

# Replace from $2 to $3 in $1
function replace {
    echo "${1/$2/$3}"
}

# do not stop at errors
set -e


DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

GOLD_REPO_NAME=$1

GOLD_REPO_URL=$(concate_path_parts $URL $SVN_URL_PATH $GOLD_REPO_NAME)

# Load config file using the source command
. $DIR/../config/global-config.properties
. $DIR/../config/$GOLD_REPO_NAME/config.properties


# Delete locks
# TODO delete only the locks that belong to the given user
echo "Removing rule based locks:"
find "$DIR/../lock/" -mindepth 1 -depth -print0 | grep -vEzZ '(\.git(/|$)|/\.gitignore$)' | xargs -0 echo rm -rvf
find "$DIR/../lock/" -mindepth 1 -depth -print0 | grep -vEzZ '(\.git(/|$)|/\.gitignore$)' | xargs -0 rm -rvf >/dev/null

USER_NAME=$2

echo "Resetting for user $USER_NAME..."

USER_FOUND=false

while IFS='' read -r LINE || [[ -n "$LINE" ]]; do
	
	CONFIG_USER_NAME=$(echo $LINE | cut -d'=' -f 1)
	FRONT_REPO_NAME=$(echo $LINE | cut -d'=' -f 2)

	# echo $CONFIG_USER_NAME
	# echo $FRONT_REPO_NAME

	if [ "$USER_NAME" == "$CONFIG_USER_NAME" ]; then
		# echo "equal $USER_NAME"
		USER_FOUND=true
		break
	fi

done < "$DIR/../config/$GOLD_REPO_NAME/gen/user_front.properties"

# exit if user was not found
if [ "$USER_FOUND" = false ] ; then
    echo "Exiting, because user \"$USER_NAME\" was not found in the config file, assumingly this user has no front repository"
    exit 10
fi


# Regenerating front repository
GOLD_REPO_URL=$(concate_path_parts $URL $SVN_URL_PATH $GOLD_REPO_NAME)

SVN_FRONT_REPO_FULL_PATH=$SVN_PATH_OS/$FRONT_REPO_NAME
#echo front repo path: $SVN_FRONT_REPO_FULL_PATH


# Step 0: (re)create the front repository 

# Check if the folder exists
if [ -e $SVN_FRONT_REPO_FULL_PATH ]; then
	set +e
	svnlook info $SVN_FRONT_REPO_FULL_PATH > /dev/null 2>&1
	# The value in $RETURN_VALUE is 1 if it is not a repository
	RETURN_VALUE=$?
	set -e
	
	if [ 0 -ne $RETURN_VALUE ]; then
	  echo "Could not create front repo \"$SVN_FRONT_REPO_FULL_PATH\", because that name is already used in that folder for a non-svn repository"
	  exit 2
	fi
	# If it is a repository, go on and delete it
	rm -rf $SVN_FRONT_REPO_FULL_PATH
fi


set +e
IS_PERMISSION_DENIED=$(svnadmin create $SVN_FRONT_REPO_FULL_PATH 2>&1 | grep "Permission denied")
set -e
if [ -n "$IS_PERMISSION_DENIED" ]; then
	echo "$IS_PERMISSION_DENIED"
fi

chown -R $APACHE_USER $SVN_FRONT_REPO_FULL_PATH

WORKSPACE="$DIR/../workspace"

LAST_REVISION=`svn info $GOLD_REPO_URL --username $ADMIN_USER --password $ADMIN_PWD |grep '^Revision:' | sed -e 's/^Revision: //'`
REVISION="1"

################################################################################################################################################

while [ $REVISION -le "$LAST_REVISION" ]; do

	# Step 1: checkout the newly created front repository
	FRONT_REPO_URL=$(concate_path_parts $URL $SVN_URL_PATH $FRONT_REPO_NAME)
	# checkout front to folder under $DIR/../workspace/add-front-repository/$USER_NAME/front
	WORKSPACE_FRONT=$DIR/../workspace/add-front-repository/$USER_NAME/front
	# create the folders when needed
	mkdir -p  $WORKSPACE_FRONT 
	rm -rf $WORKSPACE_FRONT

	svn checkout "$FRONT_REPO_URL" "$WORKSPACE_FRONT" --username $ADMIN_USER --password $ADMIN_PWD --quiet --non-interactive 1>/dev/null

	# Step 2: checkout gold repository
	GOLD_REPO_URL=$(concate_path_parts $URL $SVN_URL_PATH $GOLD_REPO_NAME)
	# checkout gold to $DIR/../workspace/add-front-repository/$USER_NAME/gold
	WORKSPACE_GOLD=$DIR/../workspace/add-front-repository/$USER_NAME/gold
	mkdir -p  $WORKSPACE_GOLD
	rm -rf $WORKSPACE_GOLD
	svn checkout -r $REVISION "$GOLD_REPO_URL" "$WORKSPACE_GOLD" --username $ADMIN_USER --password $ADMIN_PWD 1>/dev/null
	set +e

	# Step 3: call rsync to copy files to the working copy
	# Create the --exclude parameter for rsync to ignore the .svn folder and the model files
	EXCLUDES="--exclude=.svn*"
	rsync -r $WORKSPACE_GOLD"/" $WORKSPACE_FRONT $EXCLUDES


	# Step 4: apply the transformation for the models
	LENS_DIR="$DIR/../invoker/invoker.sh"
	WORKSPACE="$DIR/../workspace"

	echo "Processing models for user $USER_NAME at revision $REVISION..."

	# this cycle may encounter issues if the user was not present in a certain revision of the macl file
	IFS_OLD=$IFS
	IFS=","
	for EXTENSION in $MODEL_EXTENSIONS; do
		IFS=$IFS_OLD
		for FILE_NAME in $(find $WORKSPACE_FRONT -name "*.$EXTENSION"); do 
			MODEL_FILE=$(replace $FILE_NAME $WORKSPACE_GOLD "")
			# echo "###########################"
			# echo $MODEL_FILE
			# echo "###########################"
			echo "Executing lens for $MODEL_FILE"
			echo "$WORKSPACE_GOLD/$PATH_TO_ACCESS_CONTROL_AND_LOCK_QUERIES_FROM_REPOSITORY_ROOT"
			#chmod oa+rw $(concate_path_parts $WORKSPACE_GOLD $MODEL_FILE)
			chmod oa+rw $MODEL_FILE
			$LENS_DIR $USER_NAME $MODEL_FILE $MODEL_FILE "-performGet" $WORKSPACE "$OBFUSCATOR_SALT" "$OBFUSCATOR_SEED" "$OBFUSCATOR_PREFIX" "$WORKSPACE_GOLD/$PATH_TO_ACCESS_CONTROL_RULES_FROM_REPOSITORY_ROOT"     "$WORKSPACE_GOLD/$PATH_TO_ACCESS_CONTROL_AND_LOCK_QUERIES_FROM_REPOSITORY_ROOT" "$WORKSPACE_GOLD/$PATH_TO_LOCK_RULES_FROM_REPOSITORY_ROOT" "$GOLD_REPO_NAME"
	  done
	  IFS=","
	done
	IFS=$IFS_OLD

	echo "Models available in gold revision $REVISION transformed for user $USER_NAME."


	# Step 5 force add all files
	svn add --force $WORKSPACE_FRONT"/"* --auto-props --parents --depth infinity -q

	# Step 6 commit the files
	# get the commit message
	COMMIT_MSG=$(svn log -q -r$REVISION -v --xml --with-all-revprops $WORKSPACE_GOLD --username $ADMIN_USER --password $ADMIN_PWD | grep msg | sed -e "s/<msg>\([^<]*\)<\/msg>/\1/g")
	RETURN_VALUE=$?
	# error handling branches
	if [ 0 -ne $RETURN_VALUE ]; then
	  echo "Exited"
	  exit 0
	fi
	set -e
	if [ "$COMMIT_MSG" == "" ]; then
	  echo "Exited"
	  exit 0
	fi
	echo "$COMMIT_MSG" 1>$WORKSPACE_FRONT"/svn-commit.tmp"

	CURRENT_DIR=`pwd`
	cd $WORKSPACE_FRONT
	svn update >>/dev/null
	# the actual commit
	svn commit -F $WORKSPACE_FRONT"/"svn-commit.tmp --username $ADMIN_USER --password $ADMIN_PWD --quiet --non-interactive
	cd $CURRENT_DIR

	REVISION=$(($REVISION + 1))

done

# repository was reset, so remove working copies
rm -rf $DIR/../workspace/add-front-repository/


echo "Resetting front repository of $USER_NAME finished successfully."
exit 0
