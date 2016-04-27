#!/bin/bash

if [ $# -lt 2 -o "$1" == "--help" -o "$1" == "-h" -o "$1" == "" ]; then
  echo "Usage: $(basename $0) <user name> <gold repository url>"
  echo " - user name: the name of the user who has access to the new front repository"
  echo " - gold repository url: the full public url for the gold repository"
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


USER_NAME=$1


DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

# Find the gold repository name according to the given public gold URL
GIVEN_GOLD_URL=$2
while IFS='' read -r LINE || [[ -n "$LINE" ]]; do

  GOLD_REPO_PUBLIC_URL=$(echo $LINE | cut -d'=' -f 1)
  GOLD_REPO_NAME=$(echo $LINE | cut -d'=' -f 2)

  if [[ $GIVEN_GOLD_URL == $GOLD_REPO_PUBLIC_URL ]]; then
    GOLD_REPO_NOT_FOUND=false
    break
  fi
done < "$DIR/../config/gold-url-local-mapping.properties"

if  $GOLD_REPO_NOT_FOUND ; then
  echo "Could not resolve location on server of gold repository with public URL $GIVEN_GOLD_URL"
  exit 1
fi
GOLD_REPO_URL=$(concate_path_parts $URL $SVN_URL_PATH $GOLD_REPO_NAME)

# Load config file using the source command
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
