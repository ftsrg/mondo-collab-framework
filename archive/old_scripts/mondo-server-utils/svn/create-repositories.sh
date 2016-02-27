#!/bin/bash

# $1 config file
# $2 front_list file

DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

set -e

if [ $# -lt 1 -o "$1" == "--help" -o "$1" == "" ]; then
  echo "Usage: $0 <config.properties> [<front_list.properties>]"
  exit
fi

CONFIG=$1
FRONT_LIST=$2
. $CONFIG
. $FRONT_LIST

echo "Default configuration..."
cp $CONFIG $CONFIG_DIR/config.properties
cp $FRONT_LIST $CONFIG_DIR/front_list.properties
echo "* Config files copied"
cp $DIR/lens-executor.sh $LENS_SCRIPT
cp $DIR/invoker.jar $LENS_INVOKER
echo "CONFIG_DIR=$CONFIG_DIR" >> $LENS_DIR/config.properties
echo "* Lens Invoker copied"
mkdir -p $TEMP
mkdir -p $LOCK_DIR

echo "Generating Gold Repository (0/5)"
rm -rf $SVN_PATH_OS/$GOLD_REPO_NAME
echo "(1/6) Cleanup previous mess"
svnadmin create $SVN_PATH_OS/$GOLD_REPO_NAME
echo "(2/6) Gold Repo created"
chown -R $SVN_USER_OS /$SVN_PATH_OS/$GOLD_REPO_NAME
echo "(3/6) Permissons added"
cp $DIR/../../mondo-server-hooks/svn/post-commit $SVN_PATH_OS/$GOLD_REPO_NAME/hooks/post-commit
chmod +x $SVN_PATH_OS/$GOLD_REPO_NAME/hooks/post-commit
echo "(4/6) Post-commit hook copied"
echo "CONFIG_DIR=$CONFIG_DIR" >> $SVN_PATH_OS/$GOLD_REPO_NAME/hooks/config.properties
echo "LOCK_FILE=$LOCK_DIR/.lock-front" >> $SVN_PATH_OS/$GOLD_REPO_NAME/hooks/config.properties
echo "GOLD_LOCK_FILE=$LOCK_DIR/.lock-gold" >> $SVN_PATH_OS/$GOLD_REPO_NAME/hooks/config.properties
echo "(5/6) Configurators copied"

echo "Generating Front Repositories..."
for entry in $FRONT_REPOS_NAME_WITH_ROLE; do
  oldIFS=$IFS
  IFS=':'
  set x $entry
  FRONT_REPO_NAME="$2"
  FRONT_USER="$3"
  IFS=$oldIFS

  echo "Generating ($FRONT_REPO_NAME) Repository (0/5)"
  rm -rf $SVN_PATH_OS/$FRONT_REPO_NAME
  echo "(1/5) Cleanup previous mess"
  svnadmin create $SVN_PATH_OS/$FRONT_REPO_NAME
  echo "(2/5) Gold Repo created"
  chown -R $SVN_USER_OS /$SVN_PATH_OS/$FRONT_REPO_NAME
  echo "(3/5) Permissons added"
  cp $DIR/../../mondo-server-hooks/svn/pre-commit $SVN_PATH_OS/$FRONT_REPO_NAME/hooks/pre-commit
  chmod +x $SVN_PATH_OS/$FRONT_REPO_NAME/hooks/pre-commit
  echo "(4/5) Pre-commit hook copied"
  echo "CONFIG_DIR=$CONFIG_DIR" >> $SVN_PATH_OS/$FRONT_REPO_NAME/hooks/config.properties
  echo "LOCK_FILE=$LOCK_DIR/.lock-front" >> $SVN_PATH_OS/$FRONT_REPO_NAME/hooks/config.properties
  echo "GOLD_LOCK_FILE=$LOCK_DIR/.lock-gold" >> $SVN_PATH_OS/$FRONT_REPO_NAME/hooks/config.properties
  echo "(5/6) Configurators copied"
done

echo "WARNING! Permissions for the repositories have to be set manually"
