#!/bin/sh

cd ..

rm -rf example/gold/*
rm -rf example/gold/.svn

svn co http://127.0.0.1/svn/gold example/gold --username admin --password admin --non-interactive --quiet
yes | cp -rf project/test.project.with.model.project example/gold
chmod 777 example/gold/test.project.with.model.project
chmod 777 example/gold/test.project.with.model.project/*
chmod 777 example/gold/test.project.with.model.project/.*

cd example/gold
svn add --force * --auto-props --parents --depth infinity -q
svn commit -m "Initial commit to gold" --username admin --password admin --non-interactive --quiet
