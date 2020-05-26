#!/bin/bash

app=citest.jar
ID=$(ps -ef | grep ${app} | grep -v "$0" | grep -v "grep" | awk '{print $2}')
echo "${ID}"
for id in ${ID}
do
kill "${id}"
echo "killed $id"
done
echo "---success---"
