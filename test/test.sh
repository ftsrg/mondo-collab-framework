#!/bin/bash

function replace_slash {
  ${1//\//-}
}

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

MODEL_EXTENSIONS="asd"

function known_model_extension {
  contains=false

  IFS_OLD_SUB=$IFS
  IFS=","
  for extension in $MODEL_EXTENSIONS
  do
    if [[ $1 =~ .${extension}$ ]]; then
      contains=true
    fi
  done
  IFS=$IFS_OLD_SUB

  echo "$contains"
}

echo $(replace_slash "a/asdds/adss")
