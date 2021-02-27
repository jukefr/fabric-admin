#!/usr/bin/env bash

./gradlew build --stacktrace
chown -R 1000:100 build