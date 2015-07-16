#!/bin/bash

appinventor=~/Documents/appinventor-sources/appinventor
appengine=~/Documents/appengine/appengine-java-sdk-1.9.15
appenginename=isense-project

cd $appinventor

ant
vim $appinventor/appengine/build/war/WEB-INF/appengine-web.xml

$appengine/bin/appcfg.sh -A $appenginename update $appinventor/appengine/build/war/
