# <img src="http://www.ru.is/media/hr/skjol/default_white.png" width="75" height="75" />  TicTacToe Administration Manual

| Students                  | SSN         |
|---------------------------|:-----------:|
|Ágúst Aðalsteinsson        | 221191-3319 |
|Egill Gautur Steingrímsson | 051191-2859 |
|Guðmundur Freyr Jónsson    | 280582-3019 |
|Hrafnhildur Sigurðardóttir | 010163-5529 |
|Hreiðar Ólafur Arnarsson   | 040780-4839 |
|Sveinn Björnsson           | 091085-2329 |
|Þórdís Þórðardóttir        | 110961-5619 |

## Inngangur

Handbók þessi er tvískipt
  * Keyrsla leiks er fyrir notendur sem vilja setja upp og keyra leikinn.
  * Uppsetning forritunarumhverfisins. 

## Forskilyrði

 1. Nauðsynlegt er að hafa Java 1.8 forritunarumhverfið uppsett.
    Hægt er að nálgast það hér: http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html


## Keyra leikinn beint

1. Sækja nýjustu útgáfuna af TicTacToe.zip undir https://github.com/HEX2016/TicTacToe/releases
  a. Það er undir "Downloads" á nýjustu útgáfunni.
2. Extracta folderinn TicTacToe á skrárstað að eigin vali. (dæmi: C:\temp\TicTacToe)
3. Opna "cmd line" eða "cmd.exe" í Windows. (einnig er hægt að nota git bash, git shell eða flest command line forrit)
  a. Windows + R og skrifa "cmd"
4. Skrifa svo "java -jar C:\temp\TicTacToe\lib\TicTacToe.jar" í "cmd.exe"
5. Þá keyrist upp leikurinn "TicTacToe" í Command line.
6. Njóta leiksins...

## Uppsetning forritunarumhverfisins  

TicTacToe 

Forritið er hýst á github á slóðinni: https://github.com/HEX2016/tictactoe.git
Hægt er að sjá sögu útgáfna á https://travis-ci.org/HEX2016/TicTacToe 
Nauðsynlegt er að hafa gradle 3.1 sem er hægt að sækja í eftirfarandi skrefum:
1.	Opna Git Bash í rótinni á TicTacToe/
2.	Skrifa í Git Bash gluggann:
  a.	 curl -s https://get.sdkman.io | bash 
  b.	source "~/.sdkman/bin/sdkman-init.sh"
  c.	sdk install gradle 3.1
  d. git clone "https://github.com/HEX2016/TicTacToe.git"
3. Ýmsar .bat skrár hafa verið búnar til með mismunandi verkefnum í huga.
  a. Skrifa í TicTacToe rótinni "sh /bin/run" til að builda og keyra forritið.
  b. Skrifa í TicTacToe rótinni "sh /bin/build_and_test" til að builda og keyra testin.
