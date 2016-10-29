#TicTacToe þróunarskýrsla


[logo]: http://www.ru.is/media/hr/skjol/default_white.png

| Students                                                                                  |
|------------------------------------------------------------------------------------------:|
|                                                         Ágúst Aðalsteinsson – 221191-3319 |
|                                                  Egill Gautur Steingrímsson – 051191-2859 |
|                                                     Guðmundur Freyr Jónsson – 280582-3019 |
|                                                  Hrafnhildur Sigurðardóttir – 010163-5529 |
|                                                    Hreiðar Ólafur Arnarsson – 040780-4839 |
|                                                            Sveinn Björnsson – 091085-2329 |
|                                                         Þórdís Þórðardóttir – 110961-5619 |

##Inngangur

Þessi skýrsla inniheldur leiðbeiningar hvað þarf til þess að byggja forritið á nýrri vél.

## Meginmál

Forritið er hýst á github á slóðinni: https://github.com/HEX2016/tictactoe.git
Hægt er að sjá sögu útgáfna á https://travis-ci.org/HEX2016/TicTacToe 
Nauðsynlegt er að hafa gradle 3.1 sem er hægt að sækja í eftirfarandi skrefum:
1.	Opna Git Bash í rótinni á TicTacToe/
2.	Skrifa í Git Bash gluggann:
a.	 curl -s https://get.sdkman.io | bash 
b.	source "~/.sdkman/bin/sdkman-init.sh"
c.	sdk install gradle 3.1
3.	

### Development manual

Late term assignment in Reykjavík University. 
This game is a simple version of Tictactoe built __loosly coupled__ using __test driven development__.

#### Source control

This project uses Git with GitHub for source control and in development we use Git Shell to manage the project.

#### Build enviroment

Gradle is used to build and test the project on every change. On pushing to GitHub, Travis CI will check the just pushed version and create an executable to be able to run the game.

#### Dependencies

Travis CI is an application run og GitHub and detects when a push occurs. Then it will test the new version and deploy an executable .jar file to the final destination.

###### Classes

1. Board
..* Holds the board/fields for the game platform.
..* Has methods for placing a player on field and checking if a player is placed on field.
2. TicTacToeLogic
..* Logic for the board.
..* Has public methods API for gameplay.
..* Checks after placing a player if he has won and returns it to the user interface (char)
3. TicTacToe
..* Gameplay class, has user interface with command input/output.
..* Has instance of TicTacToeLogic and uses its API calls for playing the game.
..* runs a input loop until all board places are busy or a player wins.
..* prints out current board status after eacy play.
4. WrongInputException
..* Exception class to be thrown if wrong input is received by user.


