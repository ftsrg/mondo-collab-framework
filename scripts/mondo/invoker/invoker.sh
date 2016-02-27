#!/bin/bash

DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
. $DIR/config.properties
. $CONFIG_DIR/config.properties

LOG="$LENS_DIR/lens.log"

function timestamp() {
  date +"%Y-%m-%d_%H-%M-%S"
}

function log() {
  echo "$(timestamp) $1" 1>>$LOG
}

# Config variables
# Set them carefully
MACL="$9"
EIQ="${10}"

# Input parameters
USER="$1"
GOLD="$2"
FRONT="$3"
TYPE="$4"
TEMP="$5/lens"
OBF_SALT="$6"
OBF_SEED="$7"
OBF_PREFIX="$8"

GOLD_COMMAND="-gold"
FRONT_COMMAND="-front"
MACL_COMMAND="-macl"
EIQ_COMMAND="-eiq"
USER_COMMAND="-userName"

OBF_SALT_COMMAND="-obfuscatorSalt"
OBF_SEED_COMMAND="-obfuscatorSeed"
OBF_PREFIX_COMMAND="-obfuscatorPrefix"

-unique

log "clear previous mess"
rm -rf "$TEMP/"
mkdir "$TEMP"

#execute everything
log "java -jar $LENS_INVOKER $LENS_DAEMON_PORT/thrift-local/lens-daemon $GOLD_COMMAND $GOLD $FRONT_COMMAND $FRONT $MACL_COMMAND $MACL $EIQ_COMMAND $EIQ $USER_COMMAND $USER $TYPE -configuration $TEMP -data $TEMP $OBF_SALT_COMMAND $OBF_SALT $OBF_SEED_COMMAND $OBF_SEED $OBF_PREFIX_COMMAND $OBF_PREFIX"

set -e

#set +e
java -jar $LENS_INVOKER $LENS_DAEMON_PORT/thrift-local/lens-daemon $GOLD_COMMAND $GOLD $FRONT_COMMAND $FRONT $MACL_COMMAND $MACL $EIQ_COMMAND $EIQ $USER_COMMAND $USER $TYPE -configuration $TEMP -data $TEMP $OBF_SALT_COMMAND $OBF_SALT $OBF_SEED_COMMAND $OBF_SEED $OBF_PREFIX_COMMAND $OBF_PREFIX -uniqueIDScheme $UNIQUE_SCHEME_ID
#ret=$?
#log "$ret"
#set -e
#if [ $ret -eq 255 ]
#then
#   log "Mondo Exception: Security access violated"
#   echo "Mondo Exception: Security access violated" 1>&2
#   exit 1
#fi
#log "\n\n\n"

#set -e
