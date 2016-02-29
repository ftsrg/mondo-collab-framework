#!/bin/bash

if [ $# -lt 1 -o "$1" == "--help" -o "$1" == "-h" -o "$1" == ""]; then
  echo "Usage: $(basename $0) <repository name> <user name>"
  echo " - repository name: the name of the new front repository"
  echo " - user name: the name of the user who has access to the new front repository"
  exit
fi

set -e

FRONT_REPO_NAME=$1
USER_NAME=$2


DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

# Load config file using the source command
. $DIR/../config/config.properties

SVN_FRONT_REPO_FULL_PATH=$SVN_PATH_OS/$FRONT_REPO_NAME

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
 # If it is a repository, go on
fi

set +e
IS_PERMISSION_DENIED=$(svnadmin create $SVN_FRONT_REPO_FULL_PATH 2>&1 | grep "Permission denied")
set -e
if [ -n "$IS_PERMISSION_DENIED" ]; then
  echo "$IS_PERMISSION_DENIED"
fi

echo "#!/bin/sh" >> $SVN_FRONT_REPO_FULL_PATH/hooks/pre-commit
echo "set -e" >> $SVN_FRONT_REPO_FULL_PATH/hooks/pre-commit
echo "$DIR/../hooks/pre-commit \$1 \$2 " >> $SVN_FRONT_REPO_FULL_PATH/hooks/pre-commit
chmod +x $SVN_FRONT_REPO_FULL_PATH/hooks/pre-commit
echo "Create Pre-Commit hook"



set +e
IS_CONFIG_FILE_EXIST=$(cat $DIR/../config/gen/user_front.properties 1>/dev/null 2>&1)
RETURN_VALUE=$?
set -e

if [ 0 -ne $RETURN_VALUE ]; then
  echo "$USER_NAME=$FRONT_REPO" > $DIR/../config/gen/user_front.properties
else
  IS_USER_IN_CONFIG=$(cat $DIR/../config/gen/user_front.properties | grep $USER_NAME)
  if [ -z "$IS_USER_IN_CONFIG" ]; then
    echo "$USER_NAME=$FRONT_REPO" >> $DIR/../config/gen/user_front.properties
  elif [[ $IS_USER_IN_CONFIG != "$USER_NAME=$FRONT_REPO" ]]; then
    echo "Error: inconsistent user_front.properties file. Entry to be added: $USER_NAME=$FRONT_REPO; existing: $IS_USER_IN_CONFIG"
    exit 3
  fi
fi


#SVN checkouts
# gold
GOLD_REPO_URL=$URL/$SVN_PATH_URL/$GOLD_REPO_NAME
# * Checkout gold to $DIR/../workspace/add-front-repository/$USER_NAME/gold
$WORKSPACE_GOLD=$DIR/../workspace/add-front-repository/$USER_NAME/gold
svn checkout "$GOLD_REPO_URL" "$WORKSPACE_GOLD" -r $REV --username $ADMIN_USER --password $ADMIN_PWD

# front
FRONT_REPO_URL=$URL/$SVN_PATH_URL/$FRONT_REPO
# * Checkout front to $DIR/../workspace/add-front-repository/$USER_NAME/front
$WORKSPACE_FRONT=$DIR/../workspace/add-front-repository/$USER_NAME/front
svn checkout "$FRONT_REPO_URL" "$WORKSPACE_FRONT" --username $ADMIN_USER --password $ADMIN_PWD --quiet --non-interactive

# Create the --exclude parameter for rsync to ignore the .svn folder and the model files
EXCLUDES="--exclude=\".svn\""

IFS_OLD=$IFS
IFS=","
for EXTENSION in $MODEL_EXTENSIONS; do
  EXCLUDES=$EXCLUDES" --exclude=*.$EXTENSION"
done
IFS=IFS_OLD

rsync -av $EXCLUDES $WORKSPACE_GOLD/ $WORKSPACE_FRONT

# Execute lens for every model file
OBFUSCATOR_SEED="seed_$FRONT_REPO_NAME"
OBFUSCATOR_SALT="salt_$FRONT_REPO_NAME"
OBFUSCATOR_PREFIX="mondo"

IFS_OLD=$IFS
IFS=","
for EXTENSION in $MODEL_EXTENSIONS; do
  IFS=$IFS_OLD
  for FILE_NAME in $(find $WORKSPACE_GOLD -name "*.EXTENSION"); do # TODO test if it works properly
    MODEL_FILE=$(basename FILE_NAME ".$EXTENSION")
    $DIR/../invoker/invoker.sh $USER_NAME $WORKSPACE_GOLD/$MODEL_FILE $WORKSPACE_FRONT/$MODEL_FILE -performGet $DIR/../workspace $OBFUSCATOR_SALT $OBFUSCATOR_SEED $OBFUSCATOR_PREFIX "$WORKSPACE_GOLD/$PATH_TO_ACCESS_CONTROL_RULES_FROM_REPOSITORY_ROOT" "$WORKSPACE_GOLD/$PATH_TO_ACCESS_CONTROL_QUERIES_FROM_REPOSITORY_ROOT"
  done
  IFS=","
done
IFS=$IFS_OLD_1
