#!/usr/bin/env bash
mvn clean install

cp -v my-first/my-first-service/target/my-first-service-1.0-SNAPSHOT.jar \
            "D:\Java\jboss-5.1.0.GA\server\default\deploy"
