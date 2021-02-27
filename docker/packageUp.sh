#!/usr/bin/env sh

zip -r build/fabric_admin-all.zip build
rm build/fabric_admin-1.0.0-dev.jar
rm build/fabric_admin-1.0.0-sources.jar
rm build/fabric_admin-1.0.0-sources-dev.jar
chown -R 1000:100 build/.