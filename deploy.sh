#!/usr/bin/env bash
mvn clean install
cp -v my-first/target/my-first-1.0-SNAPSHOT.jar "D:\Java\jboss-5.1.0.GA\server\default\deploy"
