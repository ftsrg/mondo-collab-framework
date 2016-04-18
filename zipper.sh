#!/bin/bash

DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

set -e
cp plugins/org.mondo.collaboration.security.lens.offline.daemon.api/target/org.mondo.collaboration.security.lens.offline.daemon.api-0.0.1-SNAPSHOT-jar-with-dependencies.jar scripts/mondo/invoker/invoker.jar
if [ -f scripts/mondo/config/user_front.properties ]; then
  rm scripts/mondo/config/user_front.properties
fi

rm -rf debian-build/mondo*
tar -zcvf debian-build/mondocollab_1.0.0.$1.orig.tar.gz -C scripts/ --exclude=*.git* --exclude-vcs mondo/

cd debian-build

tar xf mondocollab_1.0.0.$1.orig.tar.gz
mv mondo mondocollab-1.0.0.$1

cp -r debian/ mondocollab-1.0.0.$1/debian
cd mondocollab-1.0.0.$1
cd debian
sed -i "s/<date>/$1/g" changelog
now=$(date +"%a, %d %b %Y %T %z")
sed -i "s/<current_time>/$now/g" changelog
cd ..
debuild --lintian-opts --profile debian
