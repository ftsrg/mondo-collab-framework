#!/bin/bash

if [ $# -lt 1 -o "$1" == "--help" -o "$1" == "-h" ]; then
  echo "Usage: $(basename $0) <gold repository name> [--force]"
  echo "gold repository name: the name of the gold repository"
  echo "--force execute the command without any question"
  exit
fi



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



set -e

if [ "$2" == "--force" ]; then
  FORCE=true
else
  FORCE=false
fi

if [ $FORCE = false ]; then
  echo "WARNING: Currently, we are just listing the repositories that are going to be deleted."
else
  echo "ATTENTION: We are executing the deletion of the following repositories"
fi



DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

GOLD_REPO_NAME=$1

GOLD_REPO_URL=$(concate_path_parts $URL $SVN_URL_PATH $GOLD_REPO_NAME)

# Load config file using the source command
. $DIR/../config/global-config.properties
. $DIR/../config/$GOLD_REPO_NAME/config.properties



echo "* Gold repository"
echo "* $SVN_PATH_OS/$GOLD_REPO_NAME"
if [ $FORCE = true ]; then
  rm -rf $SVN_PATH_OS/$GOLD_REPO_NAME
fi

if [ -f $DIR/../config/$GOLD_REPO_NAME/gen/user_front.properties ]; then
  echo "* Front repositories"
  USER_FRONT_MAPPING=$(cat $DIR/../config/$GOLD_REPO_NAME/gen/user_front.properties)
  for entry in $USER_FRONT_MAPPING; do
    oldIFS=$IFS
    IFS='='
    set x $entry
    USER=$2
    REPO=$3

    echo "* $REPO"
    if [ $FORCE = true ]; then
      $DIR/../scripts/delete-front-repository.sh $REPO $GOLD_REPO_NAME --force
    fi
  done
fi
if [ $FORCE = false ]; then
  read -p "Are you sure? (y/n) " -n 1 -r
  echo ""
  if [[ $REPLY =~ ^[Yy]$ ]]; then
    $0 $1 --force
  fi
fi
