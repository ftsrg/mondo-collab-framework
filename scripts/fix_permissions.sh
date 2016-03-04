#!/bin/bash

if [ $# -lt 1 -o "$1" == "--help" -o "$1" == "-h" -o "$1" == "" ]; then
  echo "Usage: $(basename $0) (<apache_user> | --apache | --apache2)"
  echo " - apache_user: the user name of Apache"
  echo " --apache: apache_user=\"apache.apache\" "
  echo " --apache2: apache_user=\"www-data.www-data\" "
  exit
fi

if [ "$1" == "--apache" ]; then
  APACHE_USER="apache.apache"
elif [ "$1" == "--apache2" ]; then
  APACHE_USER="www-data:www-data"
else
  APACHE_USER="$1"
fi

DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
chown -R $APACHE_USER $DIR/mondo/hooks
chown -R $APACHE_USER $DIR/mondo/hooks/pre-commit
chown -R $APACHE_USER $DIR/mondo/hooks/post-commit
chown -R $APACHE_USER $DIR/mondo/invoker
chown -R $APACHE_USER $DIR/mondo/invoker/invoker.jar
chown -R $APACHE_USER $DIR/mondo/invoker/invoker.sh
chown -R $APACHE_USER $DIR/mondo/lock
chown -R $APACHE_USER $DIR/mondo/workspace
