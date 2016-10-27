package tictactoe;
public class TicTacToeController {
    public static void main(String[] args) {
        System.out.println("Welcome to TicTacToe!,\n This is the ultimate game of Tic Tac Toe."
							+	"\n\n If you are unprepared, be prepared.\n Two players take turn inserting"
							+	" two digits to the console.\n Valid inputs are:\n   '0 0','0 1','0 2'"
							+	"\n   '1 0','1 1','1 2'\n   '2 0','2 1','2 2'"
							+	"\n Lets start with Player 1, representing Team 'X' and Player 2 represents Team 'O'. \n\n");
        TicTacToe game = new TicTacToe();

        game.newGame();
    }

}
