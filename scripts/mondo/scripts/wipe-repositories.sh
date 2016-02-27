#!/bin/bash

set -e

DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

if [ "$1" == "--help" ]; then
  echo "Usage: $0 [--force]"
  exit
fi

if [ "$1" == "--force" ]; then
  FORCE=true
else
  FORCE=false
fi

if [ $FORCE = false ]; then
  echo "WARNING: Currently, we are just listing the repositories that are going to be deleted."
else
  echo "ATTENTION: We are executing the deletion of the following repositories"
fi

# Load Config files
. $DIR/../config/config.properties

echo "* Gold repository"
echo "* $SVN_PATH_OS/$GOLD_REPO_NAME"
if [ $FORCE = true ]; then
  rm -rf $SVN_PATH_OS/$GOLD_REPO_NAME
fi

if [ -f $DIR/../config/gen/user_front.properties ]; then
  echo "* Front repositories"
  USER_FRONT_MAPPING=$(cat $DIR/../config/gen/user_front.properties)
  for entry in $USER_FRONT_MAPPING; do
    oldIFS=$IFS
    IFS='='
    set x $entry
    USER=$2
    REPO=$3

    echo "* $REPO"
    if [ $FORCE = true ]; then
      $DIR/../scripts/delete-front-repository.sh $REPO --force
    fi
  done
fi
if [ $FORCE = false ]; then
  read -p "Are you sure? (y/n) " -n 1 -r
  echo ""
  if [[ $REPLY =~ ^[Yy]$ ]]; then
    $0 --force
  fi
fi
