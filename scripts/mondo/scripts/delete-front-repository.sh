#!/bin/bash

if [ $# -lt 1 -o "$1" == "--help" -o "$1" == "-h" ]; then
  echo "Usage: $(basename $0) <front-repo-name> [--force]"
  echo "- front-repo-name: name of the front repository that you want to delete"
  echo "--force execute the command without any question"
  exit
fi

set -e

DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

# Load Config files
. $DIR/../config/config.properties

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

if [ ! -f $DIR/../config/gen/user_front.properties ]; then
  echo "Error: User-Front mapping list does not exist"
  exit 1
else
  IS_REPO_IN_CONFIG=$(cat $DIR/../config/gen/user_front.properties | grep "=$FRONT_REPO_NAME")
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
    RET=$(cat $DIR/../config/gen/user_front.properties | grep "=$FRONT_REPO_NAME")
    echo "Remove the following entries:"
    echo "$RET"
    RET=$(cat $DIR/../config/gen/user_front.properties | grep -v "=$FRONT_REPO_NAME")
    echo "$RET" > $DIR/../config/gen/user_front.properties
    echo "Removed entries from $DIR/../config/gen/user_front.properties"
  else
    echo "Error: User-Front mapping list does not contain $FRONT_REPO_NAME"
    exit 1
  fi
fi
