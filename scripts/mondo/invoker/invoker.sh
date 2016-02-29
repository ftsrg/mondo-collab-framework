#!/bin/bash

set -e

DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
. $DIR/../config.properties

LENS_INVOKER_DIR=$DIR/../invoker
LENS_INVOKER_SCRIPT=$LENS_DIR/invoke.sh
LENS_INVOKER_JAR=$LENS_DIR/invoker.jar

LOG="./lens.log"

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
WORKSPACE="$5/lens"
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
rm -rf "$WORKSPACE/"
mkdir "$WORKSPACE"

#execute everything
log "java -jar $LENS_INVOKER $LENS_DAEMON_PORT/thrift-local/lens-daemon $GOLD_COMMAND $GOLD $FRONT_COMMAND $FRONT $MACL_COMMAND $MACL $EIQ_COMMAND $EIQ $USER_COMMAND $USER $TYPE -configuration $WORKSPACE -data $WORKSPACE $OBF_SALT_COMMAND $OBF_SALT $OBF_SEED_COMMAND $OBF_SEED $OBF_PREFIX_COMMAND $OBF_PREFIX"

set +e
java -jar $LENS_INVOKER_JAR $LENS_DAEMON_PORT/thrift-local/lens-daemon $GOLD_COMMAND $GOLD $FRONT_COMMAND $FRONT $MACL_COMMAND $MACL $EIQ_COMMAND $EIQ $USER_COMMAND $USER $TYPE -configuration $WORKSPACE -data $WORKSPACE $OBF_SALT_COMMAND $OBF_SALT $OBF_SEED_COMMAND $OBF_SEED $OBF_PREFIX_COMMAND $OBF_PREFIX -uniqueIDScheme $UNIQUE_SCHEME_ID
ret=$?
log "$ret"
set -e
if [ 0 -ne "$ret" ]
then
   log "Mondo Exception: Security access violated"
   echo "Mondo Exception: Security access violated" 1>&2
   exit 1
fi
