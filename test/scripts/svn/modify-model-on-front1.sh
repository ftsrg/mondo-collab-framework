#!/bin/bash

set -e

FRONT_REPO_URL="http://mondo.inf.mit.bme.hu/svn/front1/"
FRONT_USER="alice"
FRONT_PWD="alice"

mkdir -p temp
rm -rf temp/*
svn co $FRONT_REPO_URL temp/front -q --username $FRONT_USER --password $FRONT_PWD --quiet --non-interactive
cp ../modified_models/front1.wtspec4m temp/front/test.project.with.model/model.wtspec4m

cd temp/front
svn add --force * --auto-props --parents --depth infinity -q
svn commit -m "test: $0" --username $FRONT_USER --password $FRONT_PWD
