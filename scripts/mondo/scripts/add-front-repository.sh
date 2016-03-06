#!/bin/bash

if [ $# -lt 2 -o "$1" == "--help" -o "$1" == "-h" -o "$1" == "" ]; then
  echo "Usage: $(basename $0) <repository name> <user name> (<apache_user> | --apache | --apache2)"
  echo " - repository name: the name of the new front repository"
  echo " - user name: the name of the user who has access to the new front repository"
  echo " - apache_user: the user name of Apache"
  echo " --apache: apache_user=\"apache.apache\" "
  echo " --apache2: apache_user=\"www-data.www-data\" "
  exit
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

set -e

FRONT_REPO_NAME=$1
USER_NAME=$2

if [ "$3" == "--apache" ]; then
  APACHE_USER="apache.apache"
elif [ "$3" == "--apache2" ]; then
  APACHE_USER="www-data:www-data"
else
  APACHE_USER="$3"
fi

DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

# Load config file using the source command
. $DIR/../config/config.properties

SVN_FRONT_REPO_FULL_PATH=$SVN_PATH_OS/$FRONT_REPO_NAME

echo $SVN_FRONT_REPO_FULL_PATH

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
chown -R $APACHE_USER $SVN_FRONT_REPO_FULL_PATH

echo "#!/bin/sh" >> $SVN_FRONT_REPO_FULL_PATH/hooks/pre-commit
echo "set -e" >> $SVN_FRONT_REPO_FULL_PATH/hooks/pre-commit
echo "$DIR/../hooks/front-pre-commit.sh \$1 \$2 " >> $SVN_FRONT_REPO_FULL_PATH/hooks/pre-commit
chmod 755 $SVN_FRONT_REPO_FULL_PATH/hooks/pre-commit
chown -R $APACHE_USER $SVN_FRONT_REPO_FULL_PATH/hooks/pre-commit

echo "Create Pre-Commit hook"

set +e
IS_CONFIG_FILE_EXIST=$(cat $DIR/../config/gen/user_front.properties 1>/dev/null 2>&1)
RETURN_VALUE=$?
set -e

if [ 0 -ne $RETURN_VALUE ]; then
  echo "User-Front mapping does not exist."
  echo "$USER_NAME=$FRONT_REPO_NAME" > $DIR/../config/gen/user_front.properties
else
  echo "User-Front mapping exists."
  set +e
  IS_USER_IN_CONFIG=$(cat $DIR/../config/gen/user_front.properties | grep "$USER_NAME=")
  set -e
  if [ -z "$IS_USER_IN_CONFIG" ]; then
    echo "User is not in the config."
    echo "$USER_NAME=$FRONT_REPO_NAME" >> $DIR/../config/gen/user_front.properties
  elif [[ $IS_USER_IN_CONFIG != "$USER_NAME=$FRONT_REPO_NAME" ]]; then
    echo "Error: inconsistent user_front.properties file. Entry to be added: $USER_NAME=$FRONT_REPO_NAME; existing: $IS_USER_IN_CONFIG"
    exit 3
  fi
fi


#SVN checkouts
# gold
GOLD_REPO_URL=$(concate_path_parts $URL $SVN_URL_PATH $GOLD_REPO_NAME)
# * Checkout gold to $DIR/../workspace/add-front-repository/$USER_NAME/gold
WORKSPACE_GOLD=$DIR/../workspace/add-front-repository/$USER_NAME/gold
mkdir -p  $WORKSPACE_GOLD
rm -rf $WORKSPACE_GOLD
svn checkout "$GOLD_REPO_URL" "$WORKSPACE_GOLD" --username $ADMIN_USER --password $ADMIN_PWD 1>/dev/null
set +e
COMMIT_MSG=$(svn log -q -v --xml --with-all-revprops $WORKSPACE_GOLD --username $ADMIN_USER --password $ADMIN_PWD | grep msg | sed -e "s/<msg>\([^<]*\)<\/msg>/\1/g")
RETURN_VALUE=$?
if [ 0 -ne $RETURN_VALUE ]; then
  echo "Exited"
  exit 0
fi
set -e
if [ "$COMMIT_MSG" == "" ]; then
  echo "Exited"
  exit 0
fi

# front
FRONT_REPO_URL=$(concate_path_parts $URL $SVN_URL_PATH $FRONT_REPO_NAME)
# * Checkout front to $DIR/../workspace/add-front-repository/$USER_NAME/front
WORKSPACE_FRONT=$DIR/../workspace/add-front-repository/$USER_NAME/front
mkdir -p  $WORKSPACE_FRONT
rm -rf $WORKSPACE_FRONT
svn checkout "$FRONT_REPO_URL" "$WORKSPACE_FRONT" --username $ADMIN_USER --password $ADMIN_PWD --quiet --non-interactive 1>/dev/null

# Create the --exclude parameter for rsync to ignore the .svn folder and the model files
EXCLUDES="--exclude=\".svn\""

#IFS_OLD=$IFS
#IFS=","
#for EXTENSION in $MODEL_EXTENSIONS; do
#  EXCLUDES="$EXCLUDES --exclude=*.$EXTENSION"
#done
#IFS=IFS_OLD

cp -r $WORKSPACE_GOLD/* $WORKSPACE_FRONT/

# Execute lens for every model file
OBFUSCATOR_SEED="seed_$FRONT_REPO_NAME"
OBFUSCATOR_SALT="salt_$FRONT_REPO_NAME"
OBFUSCATOR_PREFIX="mondo"

LENS_DIR="$DIR/../invoker/invoker.sh"
WORKSPACE="$DIR/../workspace"

IFS_OLD=$IFS
IFS=","
for EXTENSION in $MODEL_EXTENSIONS; do
  IFS=$IFS_OLD
  for FILE_NAME in $(find $WORKSPACE_GOLD -name "*.$EXTENSION"); do # TODO test if it works properly
    MODEL_FILE=$(replace $FILE_NAME $WORKSPACE_GOLD "")
    echo "Executing lens for $MODEL_FILE"
    chmod oa+rw $(concate_path_parts $WORKSPACE_GOLD $MODEL_FILE)
    chmod oa+rw $(concate_path_parts $WORKSPACE_FRONT $MODEL_FILE)
    $LENS_DIR $USER_NAME $(concate_path_parts $WORKSPACE_GOLD $MODEL_FILE) $(concate_path_parts $WORKSPACE_FRONT $MODEL_FILE) "-performGet" $WORKSPACE "$OBFUSCATOR_SALT" "$OBFUSCATOR_SEED" "$OBFUSCATOR_PREFIX" "$WORKSPACE_GOLD/$PATH_TO_ACCESS_CONTROL_RULES_FROM_REPOSITORY_ROOT" "$WORKSPACE_GOLD/$PATH_TO_ACCESS_CONTROL_QUERIES_FROM_REPOSITORY_ROOT"
  done
  IFS=","
done
IFS=$IFS_OLD

cd $WORKSPACE_FRONT
svn add --force * --auto-props --parents --depth infinity -q
echo "$COMMIT_MSG" 1>"svn-commit.tmp"
svn commit -F svn-commit.tmp --username $ADMIN_USER --password $ADMIN_PWD --quiet --non-interactive

rm -rf $DIR/../workspace/add-front-repository
