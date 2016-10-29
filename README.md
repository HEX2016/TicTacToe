[![Build Status](https://travis-ci.org/HEX2016/TicTacToe.svg?branch=master)](https://travis-ci.org/HEX2016/TicTacToe)
[![codecov](https://codecov.io/gh/HEX2016/TicTacToe/branch/master/graph/badge.svg)](https://codecov.io/gh/HEX2016/TicTacToe)

# TicTacToe

# Create new branch:
### git checkout -b [branch name]
### git push origin [branch name]
###  


# Push Branch to Master:
### git checkout master
### git pull origin master
### git merge test
### git push origin master

# Create pull requests:
# Local:
### Búa til nýtt branch:
### git checkout -b NyttBranch

### Vinna á branch, t.d. bæta við skrá í git
### git add file

### Commit á skrá 
### git commit -m „Eitthvað gert við file“

### Senda á github
### git push -u origin NyttBranch

# Á github:
### Við push kemur tilkynning fram á github – you recently pushed branches. Smella á Compare and pull branches –  smella á Create pull request.  Við það hrekkur í gang test á Travis og sýnir niðurstöðu á github. Ef allt er fínt er hægt að smella á Merge pull request.

### Við erum með protection á master svo það þarf að staðfesta merge.  Eftir þetta má eyða þessu branch-i, boðið er upp á það eftir merge. 

### Til þess að gefa út útgáfu þarf að setja tagg á commitið. Það er gert með því að skrifa "git tag 0.xx". Svo er pushað með tag flaggi "git push origin --tags"