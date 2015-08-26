#!/bin/sh

# This script is responsible for executing the lens application with the specified arguments

USER="$1"
LENS="/home/vialpando/Eclipse/Mondo/lens/eclipse/MondoOfflineCollaborationLens"
ARGS="-nosplash -consoleLog --launcher.suppressErrors -application org.mondo.collaboration.security.lens.offline.cli"
GOLD="$2"
FRONT="$3"
MACL="/home/vialpando/Eclipse/Mondo/git/mondo-collab-internal/ikerlan-related/es.ikerlan.wt.emf.security.example/src/es/ikerlan/wt/emf/security/example/rules.macl"
EIQ="/home/vialpando/Eclipse/Mondo/git/mondo-collab-internal/ikerlan-related/es.ikerlan.wt.emf.security.example/src/es/ikerlan/wt/emf/security/example/queries.eiq"

GOLD_COMMAND="-gold"
FRONT_COMMAND="-front"
MACL_COMMAND="-macl"
EIQ_COMMAND="-eiq"
USER_COMMAND="-userName"


#echo the command
echo "$LENS $ARGS $GOLD_COMMAND $GOLD $FRONT_COMMAND $FRONT $MACL_COMMAND $MACL $EIQ_COMMAND $EIQ $USER_COMMAND $USER $4" 1>&2

#execute everything
$LENS $ARGS $GOLD_COMMAND $GOLD $FRONT_COMMAND $FRONT $MACL_COMMAND $MACL $EIQ_COMMAND $EIQ $USER_COMMAND $USER $4 -configuration $5 -data $5
