#!/bin/sh

# -Dorg.eclipse.equinox.p2.reconciler.dropins.directory=/home/meres/MONDO/mondo-lens-dropins
mondo-server-nogpl/mondo-server -vmargs  -Dosgi.noShutdown=true -Dlog4j.configuration=file:/home/meres/MONDO/log4j.properties  -Dorg.osgi.service.http.port=8484
