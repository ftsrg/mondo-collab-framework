#!/bin/bash

if [ $# -lt 1 -o "$1" == "--help" -o "$1" == "-h" -o "$1" == "" ]; then
  echo "Usage: $(basename $0) <gold repository url>"
  echo " - gold repository url: the full public url for the gold repository"
  exit
fi


DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

# Find the gold repository name according to the given public gold URL
GIVEN_GOLD_URL=$1
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

echo "$GOLD_REPO_NAME"