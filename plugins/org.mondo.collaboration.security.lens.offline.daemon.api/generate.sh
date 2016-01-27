#!/bin/bash

rm -rf src-gen
mkdir src-gen
thrift -out src-gen --gen java src/org/mondo/collaboration/security/lens/offline/daemon/api/lens-daemon.thrift
