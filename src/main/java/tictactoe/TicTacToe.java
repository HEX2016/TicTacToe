package tictactoe;

import java.util.Scanner;

public class TicTacToe {
	
	public void newGame() {
		TicTacToeLogic game = new TicTacToeLogic(3);
		Scanner in = new Scanner(System.in);
		int count = 0;
		while(true) {
			if (count >= 9){
				System.out.println("Game over, it's a tie! Try again...");
				break;
			}
			char player = game.whosNext();
			System.out.println("Player " + player + "'s turn");
			try{
				System.out.println("Enter two numbers (row column):");
				int p = in.nextInt();
				int q = in.nextInt();
				if(game.setField(p,q) == '-') {
					printBoard(game);
				}
				else{
					System.out.println("Player " + player + " wins");
					break;
				}
			}
			catch (WrongInputException ex) {
				System.out.println(ex.toString());
				continue;
			}
			count++;
		}
	}

	/**
	 * Prints the current board status
	 */
	public void printBoard(TicTacToeLogic currentGame){
		for (int i = 0; i<3;i++){
			for (int j=0; j<3;j++){
				if(j > 0){
					System.out.print(" ");
				}
				System.out.print(currentGame.getField(i, j));
			}
			System.out.println();
		}
	}
}