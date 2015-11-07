#!/bin/sh

LOG="/home/mondo/MONDO-Demo/example/lens.log"

timestamp() {
  date +"%Y-%m-%d_%H-%M-%S"
}

log() {
  echo "$(timestamp) $1" 1>>$LOG
}

# Config variables
# Set them carefully
LENS="/home/mondo/MONDO-Demo/lens/eclipse/MondoOfflineCollaborationLens"
ARGS="-nosplash -consoleLog --launcher.suppressErrors -application org.mondo.collaboration.security.lens.offline.cli"
MACL="/home/mondo/MONDO-Demo/admin/workspace/test.project.rules/src/es/ikerlan/wt/emf/security/example/rules.macl"
EIQ="/home/mondo/MONDO-Demo/admin/workspace/test.project.rules/src/es/ikerlan/wt/emf/security/example/queries.eiq"

# Input parameters
USER="$1"
GOLD="$2"
FRONT="$3"
TYPE="$4"
TEMP="$5"
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

#execute everything
log "$LENS $ARGS $GOLD_COMMAND $GOLD $FRONT_COMMAND $FRONT $MACL_COMMAND $MACL $EIQ_COMMAND $EIQ $USER_COMMAND $USER $TYPE -configuration $TEMP -data $TEMP $OBF_SALT_COMMAND $OBF_SALT $OBF_SEED_COMMAND $OBF_SEED $OBF_PREFIX_COMMAND $OBF_PREFIX"

set +e
$LENS $ARGS $GOLD_COMMAND $GOLD $FRONT_COMMAND $FRONT $MACL_COMMAND $MACL $EIQ_COMMAND $EIQ $USER_COMMAND $USER $TYPE -configuration $TEMP -data $TEMP $OBF_SALT_COMMAND $OBF_SALT $OBF_SEED_COMMAND $OBF_SEED $OBF_PREFIX_COMMAND $OBF_PREFIX > /dev/null 2>&1
ret=$?
log "$ret"
set -e
if [ $ret -eq 255 ]
then
   log "Mondo Exception: Security access violated"
   echo "Mondo Exception: Security access violated" 1>&2
   exit 1
fi
log "\n\n\n"

set -e
