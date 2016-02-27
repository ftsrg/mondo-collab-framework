#!/bin/bash

# $1 path to the gold repository: /svn/gold

set -e

if [ $# -lt 1 -o "$1" == "--help" -o "$1" == "" ]; then
  echo "Usage: $0 <front repo path> [<other front repo path> ...]"
  exit
fi

function replace {
    echo "${1/$2/$3}"
}

for front in "$@"
do
    . $front/hooks/config.properties
    . $SVN_PATH_OS/$GOLD_REPO_NAME/hooks/front_list.properties

    rm -rf $front
    echo "Deleted Front repository ($front)"

    CURRENT_LIST=$FRONT_REPOS_NAME_WITH_ROLE
    CURRENT_REPO=$(replace "$front" "$SVN_PATH_OS/" "")
    CURRENT_REPO=$(echo $CURRENT_LIST | grep -P "$CURRENT_REPO:(\w)*" -o)
    CURRENT_LIST=$(replace "$CURRENT_LIST" "$CURRENT_REPO" "")
    CURRENT_LIST=$(replace "$CURRENT_LIST" "  " " ")
    CURRENT_LIST="$(echo -e "${CURRENT_LIST}" | sed -e 's/^[[:space:]]*//' -e 's/[[:space:]]*$//')"

    echo "FRONT_REPOS_NAME_WITH_ROLE=\"$CURRENT_LIST\"" > $SVN_PATH_OS/$GOLD_REPO_NAME/hooks/front_list.properties
    echo "Updated $SVN_PATH_OS/$GOLD_REPO_NAME/hooks/front_list.properties"
done
