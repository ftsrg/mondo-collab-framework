#!/bin/bash

# $1 path to the gold repository: /svn/gold

set -e

if [ $# -lt 1 -o "$1" == "--help" -o "$1" == "" ]; then
  echo "Usage: $0 <gold repository path> "
  exit
fi

CONFIG=$1/hooks/config.properties
FRONT_LIST=$1/hooks/front_list.properties
. $CONFIG
. $FRONT_LIST

rm -rf $SVN_PATH_OS/$GOLD_REPO_NAME
echo "Deleted Gold repository ($SVN_PATH_OS/$GOLD_REPO_NAME)"

for entry in $FRONT_REPOS_NAME_WITH_ROLE; do
  oldIFS=$IFS
  IFS=':'
  set x $entry
  FRONT_REPO_NAME="$2"
  FRONT_USER="$3"
  IFS=$oldIFS

  rm -rf $SVN_PATH_OS/$FRONT_REPO_NAME
  echo "Deleted Front repository ($SVN_PATH_OS/$FRONT_REPO_NAME)"
done

echo "WARNING! Permissions for the repositories have to be removed manually"
