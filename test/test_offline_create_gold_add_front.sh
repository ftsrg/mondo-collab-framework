#!/bin/bash

set -e

../scripts/mondo/scripts/wipe-repositories.sh --force

../scripts/mondo/scripts/init-repositories.sh --apache2
../scripts/mondo/scripts/add-front-repository.sh "wt-demo-alice" "alice" --apache2
../scripts/mondo/scripts/add-front-repository.sh "wt-demo-bob" "bob" --apache2
