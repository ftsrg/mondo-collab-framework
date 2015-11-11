#!/bin/bash

# Reset script is responsible for reseting all front models based on the gold repository.

DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

set -e

. $DIR/config.properties
. $DIR/front_list.properties

set -e

if [ $# -lt 1 -o "$1" == "--help" -o "$1" == "" ]; then
  echo "Usage: $0 <config.properties> [<front_list.properties>]"
  exit
fi

export PATH=$PATH:$JAVA_HOME

GOLD_REPOS="$SVN_PATH_URL/$GOLD_REPO_NAME"
LOG="$DIR/reset.log"

GOLD_REPOS_URL="$URL$GOLD_REPOS"

TEMP_GOLD="$TEMP/tempGold$GOLD_REPOS"
TEMP_FRONTS="$TEMP/tempFront"

timestamp() {
  date +"%Y-%m-%d_%H-%M-%S"
}

log() {
  echo "$(timestamp) $1" 1>>$LOG
}

log "======================================================="
log "Executing Reset script"
log "Parameters"
log "      URL $URL"
log "      TEMP $TEMP"
log "      FRONT_LIST $FRONT_LIST"
log "      LENS_SCRIPT $LENS_SCRIPT"
log "      JAVA_HOME $JAVA_HOME"
log "      MODEL_EXTENSIONS $MODEL_EXTENSIONS"
log "      ADMIN_USER $ADMIN_USER"
log "      ADMIN_PWD $ADMIN_PWD"
log "      GOLD_REPOS $GOLD_REPOS"
log "      TEMP_GOLD $TEMP_GOLD"
log "      TEMP_FRONTS $TEMP_FRONTS"
log "      TEMP_CURRENT $TEMP_CURRENT"

log "clear TEMP_FRONTS - $TEMP_FRONTS"
rm -rf $TEMP_FRONTS
log "clear tempGold folder - $TEMP/tempGold"
rm -rf "$TEMP/tempGold"
log "checkout gold - from $GOLD_REPOS_URL to $TEMP_GOLD"
svn checkout "$GOLD_REPOS_URL" "$TEMP_GOLD" --username $ADMIN_USER --password $ADMIN_PWD

log "find models with specific extension - $MODEL_EXTENSIONS"
FILE_LIST="$(find $TEMP_GOLD -type f -name \*.$MODEL_EXTENSIONS)"

log "iterate over the front list"
for entry in $FRONT_REPOS_NAME_WITH_ROLE; do
  oldIFS=$IFS
  IFS=':'
  set x $entry
  FRONT_REPOS="$2"
  FRONT_USER="$3"
  current="$TEMP_FRONTS/$2"

  log "     processing: $FRONT_REPOS in the name of $FRONT_USER"
  log "        checkout the repository - from $URL/$SVN_PATH_URL/$2 to $TEMP_FRONTS/$2"
  svn checkout "$URL/$SVN_PATH_URL/$2" "$TEMP_FRONTS/$2" --username $ADMIN_USER --password $ADMIN_PWD --quiet --non-interactive
  log "        synchronizing the source tree"
  log "           rsync -av --exclude='.svn' $TEMP_GOLD/ $TEMP_FRONTS/$2"
  rsync -av --exclude=".svn" $TEMP_GOLD/ $TEMP_FRONTS/$2
  IFS="
"
  log "        start iterating over the model files"
  for gold in $FILE_LIST; do
    front=${gold/$TEMP_GOLD/$current}
    log "        -> file: $gold"
    log "        ->   executing the lens"
    log "        ->     $LENS_SCRIPT"
    log "        ->     $FRONT_USER"
    log "        ->     $gold"
    log "        ->     $front"
    log "        ->     '-performGet' $TEMP"
    obfuscatorSeed="seed_/$FRONT_REPOS"
    obfuscatorSalt="salt_/$FRONT_REPOS"
    obfuscatorPrefix="mondo"
    log "        ->     $obfuscatorSeed $obfuscatorSalt $obfuscatorPrefix"

    $LENS_SCRIPT $FRONT_USER $gold $front '-performGet' $TEMP $obfuscatorSeed $obfuscatorSalt $obfuscatorPrefix "$TEMP_GOLD/$ACCESS_CONTROL_RULES" "$TEMP_GOLD/$ACCESS_CONTROL_QUERIES"
    log "        ->   execution finished"
  done

  IFS="$oldIFS"

  log "        step into the current folder - $current"
  cd $current

  log "        add all modifications to svn"
  svn add --force * --auto-props --parents --depth infinity -q

  log "        execute commit"
  svn commit -m "Reseting front repositories with reset script" --username $ADMIN_USER --password $ADMIN_PWD --quiet --non-interactive
done

#rm -rf $TEMP_FRONTS/*
#rm -rf $TEMP_GOLD/*
log "Reset script finished finished successfully"
exit 0
