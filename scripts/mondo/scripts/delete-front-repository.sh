#!/bin/bash

if [ $# -lt 2 -o "$1" == "--help" -o "$1" == "-h" ]; then
  echo "Usage: $(basename $0) <front-repo-name> <gold-repo-url> [--force]"
  echo "- front-repo-name: name of the front repository that you want to delete"
  echo "- gold-repo-url: the public URL of the gold repository to which the front repository belongs"
  echo "--force execute the command without any question"
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


# Load Config files
. $DIR/../config/$GOLD_REPO_NAME/config.properties

if [ "$2" == "--force" ]; then
  FORCE=true
else
  FORCE=false
fi

CAN_EXECUTE_DELETE=true
FRONT_REPO_NAME=$1
SVN_FRONT_REPO_FULL_PATH=$SVN_PATH_OS/$FRONT_REPO_NAME
if [ ! -d $SVN_FRONT_REPO_FULL_PATH ]; then
  echo "Warning: Repository directory does not exist: $SVN_FRONT_REPO_FULL_PATH"
  CAN_EXECUTE_DELETE=false;
else
  set +e
  svnlook info $SVN_FRONT_REPO_FULL_PATH > /dev/null 2>&1
  # The value in $RETURN_VALUE is 1 if it is not a repository
  RETURN_VALUE=$?
  set -e

  if [ 0 -ne $RETURN_VALUE ]; then
    echo "Warning: \"$SVN_FRONT_REPO_FULL_PATH\" is directory for a non-svn repository"
    CAN_EXECUTE_DELETE=false;
  fi
fi

if [ ! -f $DIR/../config/$GOLD_REPO_NAME/gen/user_front.properties ]; then
  echo "Error: User-Front mapping list does not exist"
  exit 1
else
  IS_REPO_IN_CONFIG=$(cat $DIR/../config/$GOLD_REPO_NAME/gen/user_front.properties | grep "=$FRONT_REPO_NAME")
  if [[ $IS_REPO_IN_CONFIG = *[!\ ]* ]]; then
    if [ $FORCE = false ]; then
      read -p "Are you sure? (y/n) " -n 1 -r
      echo ""
      if [[ ! $REPLY =~ ^[Yy]$ ]]; then
        exit 0
      fi
    fi
    if [ "$CAN_EXECUTE_DELETE" = true ]; then
      rm -rf $SVN_FRONT_REPO_FULL_PATH
      echo "Path deleted: $SVN_FRONT_REPO_FULL_PATH"
    fi
    RET=$(cat $DIR/../config/$GOLD_REPO_NAME/gen/user_front.properties | grep "=$FRONT_REPO_NAME")
    echo "Remove the following entries:"
    echo "$RET"
    set +e
    RET=$(cat $DIR/../config/$GOLD_REPO_NAME/gen/user_front.properties | grep -v "=$FRONT_REPO_NAME")
    set -e
    echo "$RET" > $DIR/../config/$GOLD_REPO_NAME/gen/user_front.properties
    echo "Removed entries from $DIR/../config/$GOLD_REPO_NAME/gen/user_front.properties"
  else
    echo "Error: User-Front mapping list does not contain $FRONT_REPO_NAME"
    exit 1
  fi
fi
