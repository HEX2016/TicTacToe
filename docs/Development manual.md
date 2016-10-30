# <img src="http://www.ru.is/media/hr/skjol/default_white.png" width="75" height="75" /> TicTacToe Development Manual 

| Students                  | SSN         |
|---------------------------|:-----------:|
|Ágúst Aðalsteinsson        | 221191-3319 |
|Egill Gautur Steingrímsson | 051191-2859 |
|Guðmundur Freyr Jónsson    | 280582-3019 |
|Hrafnhildur Sigurðardóttir | 010163-5529 |
|Hreiðar Ólafur Arnarsson   | 040780-4839 |
|Sveinn Björnsson           | 091085-2329 |
|Þórdís Þórðardóttir        | 110961-5619 |

## Abstract

Development manual for TicTacToe implementation.

### Development manual

Late term assignment in Reykjavík University. 
This game is a simple version of Tictactoe built __loosly coupled__ using __test driven development__.

#### Source control

This project uses Git with GitHub for source control and in development we use Git Shell to manage the project.

The project enforces pull requests on master. Project generally uses Git command line except in the case of pull requests.

##### Clone the project
    git clone git@github.com:HEX2016/TicTacToe.git

##### Create a new branch
    git checkout -b [branch name]
    git push -u origin [branch name]

##### Working with files
###### Adding the file to be committed
    git add [filename]
###### Committing changes
    git commit -m "[changes made]"

##### Push branch changes to GitHub
    git push -u origin [branch name]

To release a commit it is required to tag it.

##### Creating a release
    git tag [version number]
    git push origin --tags

GitHub is used to create pull requests. When a developer goes on GitHub after you pushed a branch you will get a notification that you recently pushed a branch. The developer can then push _Compare and pull branches_ and after that _Create pull request_.

#### Build enviroment

Gradle is used to build and test the project on every change. On pushing to GitHub, [Travis CI](https://travis-ci.org/HEX2016/TicTacToe) will check the just pushed version and create an executable to be able to run the game.

After each push to GitHub it is possible to see code coverage by going to the project's [codecov.io page](https://codecov.io/gh/HEX2016/TicTacToe).

#### Dependencies

Java is required to run and build code locally. The Java Development Kit is downloadable from [here](http://www.oracle.com/technetwork/java/javase/downloads/index.html).

Git installation is required to get access to the project's repositories.

Travis CI is an application run og GitHub and detects when a push occurs. Then it will test the new version and deploy an executable .jar file to the final destination.

