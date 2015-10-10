#!/bin/sh

# Config variables
# Set them carefully
LENS="/home/vialpando/Eclipse/Mondo/lens/eclipse/MondoOfflineCollaborationLens"
ARGS="-nosplash -consoleLog --launcher.suppressErrors -application org.mondo.collaboration.security.lens.offline.cli"
MACL="/home/vialpando/Eclipse/Mondo/git/mondo-collab-internal/ikerlan-related/es.ikerlan.wt.emf.security.example/src/es/ikerlan/wt/emf/security/example/rules.macl"
EIQ="/home/vialpando/Eclipse/Mondo/git/mondo-collab-internal/ikerlan-related/es.ikerlan.wt.emf.security.example/src/es/ikerlan/wt/emf/security/example/queries.eiq"

# Input parameters
USER="$1"
GOLD="$2"
FRONT="$3"
TYPE="$4"
TEMP="$5"

GOLD_COMMAND="-gold"
FRONT_COMMAND="-front"
MACL_COMMAND="-macl"
EIQ_COMMAND="-eiq"
USER_COMMAND="-userName"

#execute everything
$LENS $ARGS $GOLD_COMMAND $GOLD $FRONT_COMMAND $FRONT $MACL_COMMAND $MACL $EIQ_COMMAND $EIQ $USER_COMMAND $USER $TYPE -configuration $TEMP -data $TEMP
