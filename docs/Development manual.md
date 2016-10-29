#TicTacToe Development manual <img src="http://www.ru.is/media/hr/skjol/default_white.png" width="50" height="50" />



| Students                  | Ssn         |
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

#### Build enviroment

Gradle is used to build and test the project on every change. On pushing to GitHub, Travis CI will check the just pushed version and create an executable to be able to run the game.

#### Dependencies

Travis CI is an application run og GitHub and detects when a push occurs. Then it will test the new version and deploy an executable .jar file to the final destination.

