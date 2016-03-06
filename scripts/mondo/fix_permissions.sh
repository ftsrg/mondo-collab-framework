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
chown -R $APACHE_USER $DIR/../mondo
chmod 777 $DIR/../mondo
chown -R $APACHE_USER $DIR/../../scripts
chmod 777 $DIR/../../scripts
chown -R $APACHE_USER $DIR/config
chmod 777 $DIR/config
chown -R $APACHE_USER $DIR/scripts
chmod 777 $DIR/scripts
chown -R $APACHE_USER $DIR/hooks
chmod 777 $DIR/hooks
chown -R $APACHE_USER $DIR/hooks/front-pre-commit.sh
chmod 777 $DIR/hooks/front-pre-commit.sh
chown -R $APACHE_USER $DIR/hooks/gold-pre-commit.sh
chmod 777 $DIR/hooks/gold-pre-commit.sh
chown -R $APACHE_USER $DIR/invoker
chmod 777 $DIR/invoker
chown -R $APACHE_USER $DIR/invoker/invoker.jar
chmod 777 $DIR/invoker/invoker.jar
chown -R $APACHE_USER $DIR/invoker/invoker.sh
chmod 777 $DIR/invoker/invoker.sh
chown -R $APACHE_USER $DIR/lock
chmod 777 $DIR/lock
chown -R $APACHE_USER $DIR/workspace
chmod 777 $DIR/workspace
