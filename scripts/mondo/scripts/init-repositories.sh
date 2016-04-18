#!/bin/bash

function help {
  echo "Usage: $(basename $0) (--apache2 | --apache) [--delete-gold]"
  echo " -dg | --delete-gold: Delete the gold repository if it already exist"
  echo " --apache | --apache2: Decide the username of Apache. For Apache: apache.apache, For Apache2: www-data:www-data"
  exit
}

if [ "$1" == "--help" -o "$1" == "-h" ]; then
  help
fi
set -e

if [ "$1" == "--apache" ]; then
  APACHE_USER="apache.apache"
elif [ "$1" == "--apache2" ]; then
  APACHE_USER="www-data:www-data"
else
  help
fi

DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

# Load config file
. $DIR/../config/config.properties

# Check parameter
if [ "$2" == "--delete-gold" ]; then
  # Delete if exists
  if [ -d $SVN_PATH_OS/$GOLD_REPO_NAME ]; then
    echo "Delete existing gold repository in $SVN_PATH_OS/$GOLD_REPO_NAME"
    rm -rf $SVN_PATH_OS/$GOLD_REPO_NAME
  fi
fi

if [ ! -d $SVN_PATH_OS/$GOLD_REPO_NAME ]; then
  echo "Create Gold Repository: $SVN_PATH_OS/$GOLD_REPO_NAME"
  svnadmin create $SVN_PATH_OS/$GOLD_REPO_NAME
else
  echo "Gold Repository already exists: $SVN_PATH_OS/$GOLD_REPO_NAME"
fi

if [ -z $APACHE_USER ]; then
  echo "Apache username:"
  APACHE_USER=$(cat)
fi
chown -R $APACHE_USER /$SVN_PATH_OS/$GOLD_REPO_NAME

echo "#!/bin/sh" > $SVN_PATH_OS/$GOLD_REPO_NAME/hooks/pre-commit
echo "set -e" >> $SVN_PATH_OS/$GOLD_REPO_NAME/hooks/pre-commit
echo "$DIR/../hooks/gold-pre-commit.sh \$1 \$2 " >> $SVN_PATH_OS/$GOLD_REPO_NAME/hooks/pre-commit
chmod 755 $SVN_PATH_OS/$GOLD_REPO_NAME/hooks/pre-commit
chown -R $APACHE_USER $SVN_PATH_OS/$GOLD_REPO_NAME/hooks/pre-commit
echo "Create Post-Commit hook"

if [ -f $DIR/../config/gen/user_front.properties ]; then
  echo "User-Front mapping exists in $DIR/../config/gen/user_front.properties"
  USER_FRONT_MAPPING=$(cat $DIR/../config/gen/user_front.properties)
  for entry in $USER_FRONT_MAPPING; do
    oldIFS=$IFS
    IFS='='
    set x $entry
    USER=$2
    REPO=$3

    $DIR/../scripts/add-front-repository.sh $REPO $USER $APACHE_USER
  done
fi
