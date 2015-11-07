#!/bin/bash
CONFIG="a:b c:ddsa e:hs"

echo $CONFIG | grep -P 'c:(\w)*' -o
