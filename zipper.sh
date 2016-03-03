#!/bin/sh

set -e
cp plugins/org.mondo.collaboration.security.lens.offline.daemon.api/target/org.mondo.collaboration.security.lens.offline.daemon.api-0.0.1-SNAPSHOT-jar-with-dependencies.jar scripts/mondo/invoker/invoker.jar
if [ -f scripts/mondo/config/user_front.properties ]; then
  rm scripts/mondo/config/user_front.properties
fi
zip -r offline-scripts.zip scripts/mondo -x *.git*
