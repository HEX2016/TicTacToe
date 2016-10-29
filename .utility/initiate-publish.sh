#!/bin/bash
# This script initiates the Gradle publishing task when pushes to master occur.

if [ "$TRAVIS_REPO_SLUG" == "HEX2016/TicTacToe" ] && [ "$TRAVIS_PULL_REQUEST" == "false" ] && [ "$TRAVIS_BRANCH" == "master" ]; then
 
  echo -e "Starting publish to HEX2016TicTacToe...\n"

  ./gradlew uploadArchives -PnexusUsername="${NEXUS_USERNAME}" -PnexusPassword="${NEXUS_PASSWORD}"
  RETVAL=$?

  if [ $RETVAL -eq 0 ]; then
    echo 'Completed publish!'
  else
    echo 'Publish failed.'
    return 1
  fi

fi