#!/bin/bash

set -e

USER_NAME=$1

DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
IFS_OLD=$IFS
IFS='='
cat $DIR/../config/gen/user_front.properties | while read key value; do
  if [[ $key == $USER_NAME ]]; then
  	echo $value
  	IFS=$IFS_OLD
  	break
  fi
done
IFS=$IFS_OLD
