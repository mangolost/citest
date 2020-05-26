#!/bin/bash

app=citest.jar
java -jar -server -Xms256m -Xmx512m ${app} &
