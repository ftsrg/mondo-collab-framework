#!/bin/bash

set -e

DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
. $DIR/../config/config.properties

LENS_INVOKER_JAR=$DIR/invoker.jar

LOG="$DIR/../log/lens.log"

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
MPBL="${11}"

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
MPBL_COMMAND="-mpbl"
USER_COMMAND="-userName"

OBF_SALT_COMMAND="-obfuscatorSalt"
OBF_SEED_COMMAND="-obfuscatorSeed"
OBF_PREFIX_COMMAND="-obfuscatorPrefix"

log "clear previous mess"
rm -rf "$WORKSPACE/"
mkdir "$WORKSPACE"

#execute everything
log "java -jar $LENS_INVOKER $LENS_DAEMON_PORT/thrift-local/lens-daemon $GOLD_COMMAND $GOLD $FRONT_COMMAND $FRONT $MACL_COMMAND $MACL $EIQ_COMMAND $EIQ $USER_COMMAND $USER $TYPE -configuration $WORKSPACE -data $WORKSPACE $OBF_SALT_COMMAND $OBF_SALT $OBF_SEED_COMMAND $OBF_SEED $OBF_PREFIX_COMMAND $OBF_PREFIX"

set +e
if [ -z $MPBL  ]; then
  java -jar $LENS_INVOKER_JAR $LENS_DAEMON_PORT/thrift-local/lens-daemon $GOLD_COMMAND $GOLD $FRONT_COMMAND $FRONT $MACL_COMMAND $MACL $EIQ_COMMAND $EIQ $USER_COMMAND $USER $TYPE -configuration $WORKSPACE -data $WORKSPACE $OBF_SALT_COMMAND $OBF_SALT $OBF_SEED_COMMAND $OBF_SEED $OBF_PREFIX_COMMAND $OBF_PREFIX -uniqueIDScheme "mondo.demo"
else
  java -jar $LENS_INVOKER_JAR $LENS_DAEMON_PORT/thrift-local/lens-daemon $GOLD_COMMAND $GOLD $FRONT_COMMAND $FRONT $MPBL_COMMAND $MPBL $MACL_COMMAND $MACL $EIQ_COMMAND $EIQ $USER_COMMAND $USER $TYPE -configuration $WORKSPACE -data $WORKSPACE $OBF_SALT_COMMAND $OBF_SALT $OBF_SEED_COMMAND $OBF_SEED $OBF_PREFIX_COMMAND $OBF_PREFIX -uniqueIDScheme "mondo.demo"
fi
ret=$?
log "$ret"
set -e
if [ 253 = "$ret" ]; then
  log "Mondo Lock is violated"
  echo "Mondo Lock is violated" 1>&2
  exit 1
elif [ 0 -ne "$ret" ];
then
   log "Mondo Exception: Security access violated. Error code $ret"
   echo "Mondo Exception: Security access violated. Error code $ret" 1>&2
   exit 1
fi
