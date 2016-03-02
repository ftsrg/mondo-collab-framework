#!/bin/bash

. ../scripts/mondo/config/config.properties

../scripts/mondo/scripts/wipe-repositories.sh --force
../scripts/mondo/scripts/init-repositories.sh --apache2
../scripts/mondo/scripts/add-front-repository.sh "wt-demo-alice" "alice" --apache2
../scripts/mondo/scripts/add-front-repository.sh "wt-demo-bob" "bob" --apache2

WORKSPACE="workspace"

rm -rf ../scripts/mondo/workspace/*

rm -rf $WORKSPACE/*
rm -rf $WORKSPACE/.svn

rm ../scripts/mondo/lock/.lock-gold

rm ../scripts/mondo/hooks/post-commit.log
rm ../scripts/mondo/hooks/pre-commit.log
rm ../scripts/mondo/invoker/lens.log

echo "Checkout gold"

svn co "http://127.0.0.1/svn/wt-demo" $WORKSPACE --username "$ADMIN_USER" --password "$ADMIN_PWD" --non-interactive --quiet

echo "CP pojects folder"

cp -a project/* $WORKSPACE/

echo "cd pojects folder"
cd $WORKSPACE

echo "add all"
svn add --force * --auto-props --parents --depth infinity -q
echo "commit"
svn commit -m "test commit" --username "$ADMIN_USER" --password "$ADMIN_PWD"
echo "Done"
