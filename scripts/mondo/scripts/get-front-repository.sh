#!/bin/bash

if [ $# -lt 2 -o "$1" == "--help" -o "$1" == "-h" -o "$1" == "" ]; then
  echo "Usage: $(basename $0) <gold repository name> <user name>"
  echo "  - gold repository url: the full public url for the gold repository"
  echo "  - user name: the name of the user who has access to the new front repository"
  exit
fi

set -e


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

USER_NAME=$2

DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

GOLD_REPO_NAME=$1

# Load config file using the source command
. $DIR/../config/global-config.properties
. $DIR/../config/$GOLD_REPO_NAME/config.properties


DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
IFS_OLD=$IFS
IFS='='
cat $DIR/../config/$GOLD_REPO_NAME/gen/user_front.properties | while read key value; do
  if [[ $key == $USER_NAME ]]; then
  	echo $value
  	IFS=$IFS_OLD
  	break
  fi
done
IFS=$IFS_OLD
