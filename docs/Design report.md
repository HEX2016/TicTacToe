#TicTacToe design report


<img src="http://www.ru.is/media/hr/skjol/default_white.png" width="150" height="150" />

| Students                  | Ssn         |
|---------------------------|:-----------:|
|Ágúst Aðalsteinsson        | 221191-3319 |
|Egill Gautur Steingrímsson | 051191-2859 |
|Guðmundur Freyr Jónsson    | 280582-3019 |
|Hrafnhildur Sigurðardóttir | 010163-5529 |
|Hreiðar Ólafur Arnarsson   | 040780-4839 |
|Sveinn Björnsson           | 091085-2329 |
|Þórdís Þórðardóttir        | 110961-5619 |

## abstract

TicTacToe is a game where two players compete about getting three "X" or "O" in a row of a two-way array. The project is about designing and implementing the game.

## Project vision

The game has a simple command line interface for two players.


## System implementation


## Class overview

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


