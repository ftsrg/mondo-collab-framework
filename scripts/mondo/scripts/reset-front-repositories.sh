#!/bin/bash

if [ $# -lt 1 -o "$1" == "--help" -o "$1" == "-h" -o "$1" == "" ]; then
  echo "Usage: $(basename $0) (<apache_user> | --apache | --apache2)"
  echo " - apache_user: the user name of Apache"
  echo " --apache: apache_user=\"apache.apache\" "
  echo " --apache2: apache_user=\"www-data.www-data\" "
  exit
fi

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

# Replace from $2 to $3 in $1
function replace {
    echo "${1/$2/$3}"
}

set -e

DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

if [ "$1" == "--apache" ]; then
  APACHE_USER="apache.apache"
elif [ "$1" == "--apache2" ]; then
  APACHE_USER="www-data:www-data" 
else
  APACHE_USER="$1"
fi


DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

# Load config file using the source command
. $DIR/../config/config.properties


# Delete locks
echo "Removing locks:"
find "$DIR/../lock/" -mindepth 1 -depth -print0 | grep -vEzZ '(\.git(/|$)|/\.gitignore$)' | xargs -0 echo rm -rvf
find "$DIR/../lock/" -mindepth 1 -depth -print0 | grep -vEzZ '(\.git(/|$)|/\.gitignore$)' | xargs -0 rm -rvf >/dev/null


# Regenerating front repositories
GOLD_REPO_URL=$(concate_path_parts $URL $SVN_URL_PATH $GOLD_REPO_NAME)
while IFS='' read -r LINE || [[ -n "$LINE" ]]; do

	USER_NAME=$(echo $LINE | cut -d'=' -f 1)
	FRONT_REPO_NAME=$(echo $LINE | cut -d'=' -f 2)
	echo $USER_NAME
	echo $FRONT_REPO_NAME

	./reset-front-repository.sh $USER_NAME $APACHE_USER

done < "$DIR/../config/gen/user_front.properties"

