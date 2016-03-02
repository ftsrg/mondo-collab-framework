#!/bin/bash

if [ "$1" == "--help" -o "$1" == "-h" ]; then
  echo "Usage: $(basename $0) [--delete] [--apache2 | --apache]"
  echo " -dg | --delete-gold: Delete the gold repository if it already exist"
  echo " --apache | --apache2: Decide the username of Apache. For Apache: apache.apache, For Apache2: www-data:www-data"
  exit
fi

set -e

DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

# Load config file
. $DIR/../config/config.properties

# Check parameter
if [ "$1" == "--delete-gold" -o "$2" == "--delete-gold" ]; then
  # Delete if exists
  if [ -d $SVN_PATH_OS/$GOLD_REPO_NAME ]; then
    echo "Delete existing gold repository in $SVN_PATH_OS/$GOLD_REPO_NAME"
    rm -rf $SVN_PATH_OS/$GOLD_REPO_NAME
  fi
fi

if [ "$1" == "--apache" -o "$2" == "--apache" ]; then
  APACHE_USER="apache.apache"
fi
if [ "$1" == "--apache2" -o "$2" == "--apache2" ]; then
  APACHE_USER="www-data:www-data"
fi

if [ ! -d $SVN_PATH_OS/$GOLD_REPO_NAME ]; then
  echo "Create Gold Repository: $SVN_PATH_OS/$GOLD_REPO_NAME"
  svnadmin create $SVN_PATH_OS/$GOLD_REPO_NAME
  if [ -z $APACHE_USER ]; then
    echo "Apache username:"
    APACHE_USER=$(cat)
  fi
  chown -R $APACHE_USER /$SVN_PATH_OS/$GOLD_REPO_NAME
else
  echo "Gold Repository already exists: $SVN_PATH_OS/$GOLD_REPO_NAME"
fi

echo "#!/bin/sh" >> $SVN_PATH_OS/$GOLD_REPO_NAME/hooks/post-commit
echo "set -e" >> $SVN_PATH_OS/$GOLD_REPO_NAME/hooks/post-commit
echo "$DIR/../hooks/post-commit \$1 \$2 " >> $SVN_PATH_OS/$GOLD_REPO_NAME/hooks/post-commit
chmod 755 $SVN_PATH_OS/$GOLD_REPO_NAME/hooks/post-commit
chown -R $APACHE_USER $SVN_PATH_OS/$GOLD_REPO_NAME/hooks/post-commit
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
