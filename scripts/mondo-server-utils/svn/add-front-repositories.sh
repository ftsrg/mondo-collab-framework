#!/bin/bash

# $1 config file
# $2 front_list file

set -e

if [ $# -lt 1 -o "$1" == "--help" -o "$1" == ""]; then
  echo "Usage: $0 <config.properties> <front_list.properties>"
  echo " - front_list should contains only new front repos"
  exit
fi

CONFIG=$1
FRONT_LIST=$2
. $CONFIG
. $FRONT_LIST

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
  cp post-commit $SVN_PATH_OS/$FRONT_REPO_NAME/hooks/pre-commit
  echo "(4/5) Pre-commit hook copied"
  cp $CONFIG $SVN_PATH_OS/$FRONT_REPO_NAME/hooks/config.properties
  echo "(5/5) Config file copied"
done

ADDED_LIST=$FRONT_REPOS_NAME_WITH_ROLE
. $SVN_PATH_OS/$GOLD_REPO_NAME/hooks/front_list.properties
CURRENT_LIST=$FRONT_REPOS_NAME_WITH_ROLE

if [ -z "$CURRENT_LIST" ]; then
  CURRENT_LIST=$ADDED_LIST
else
  CURRENT_LIST="$CURRENT_LIST $ADDED_LIST"
fi

echo "FRONT_REPOS_NAME_WITH_ROLE=\"$CURRENT_LIST\"" > $SVN_PATH_OS/$GOLD_REPO_NAME/hooks/front_list.properties
echo "Updated $SVN_PATH_OS/$GOLD_REPO_NAME/hooks/front_list.properties"

echo "WARNING! Permissions for the repositories have to be set manually"
