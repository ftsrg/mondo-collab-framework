#!/bin/bash

set -e

../scripts/mondo/scripts/wipe-repositories.sh --force

../scripts/mondo/scripts/init-repositories.sh --apache2
