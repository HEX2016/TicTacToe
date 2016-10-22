
package tictactoe;

public class TicTacToe{
	public static final int SIZE = 3;
	private char[][] board = new char[3][3];
	private int currentPlayer = 1;

	/**
	* Initializes the board, set all fields as '-'
	* automatically run by the constructor.
	*/
	private void initializeBoard(){
		for (int i = 0; i < SIZE; i++)
			for (int j = 0; j < SIZE; j++)
				board[i][j] = '-';
	}

	/** 
	* Constructor for TicTacToe
	*/
	public TicTacToe(){
		initializeBoard();
	}

	/**
	*
	*/
	public char getField(int row, int column) {
		return board[row][column];
	}

}