#!/bin/bash

set -e

GOLD_REPO_URL="http://mondo.inf.mit.bme.hu/svn/gold/"
ADMIN_USER="admin"
ADMIN_PWD="admin"

mkdir -p temp
rm -rf temp/*
svn co $GOLD_REPO_URL temp/gold -q --username $ADMIN_USER --password $ADMIN_PWD
mkdir -p temp/gold/test.project.with.model
cp ../project/test.project.with.model/* temp/gold/test.project.with.model/
cp ../project/test.project.with.model/.project temp/gold/test.project.with.model/.project

mkdir -p temp/gold/macl.project
cp ../project/macl.project/* temp/gold/macl.project/
cp ../project/macl.project/.project temp/gold/macl.project/.project

cd temp/gold
svn add --force * --auto-props --parents --depth infinity -q
svn commit -m "test: $0" --username $ADMIN_USER --password $ADMIN_PWD
