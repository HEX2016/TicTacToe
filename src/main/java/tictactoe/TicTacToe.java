
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
	 * Returns the symbol for given field, if it is available (-) or occupied by another player (O or X)
	 * 
	 * @param row which row you want to chekc
	 * @param column which column you want to check
	 * @return the symbol for the given field
	 */
	public char getField(int row, int column) {
		return board[row][column];
	}

	/**
	 * Let user choose the next field
	 * 
	 * @param row which row you want to place your mark
	 * @param column which column you want to place your mark
	 */
	public void setField(int row, int column, char value) {
		this.board[row][column] = value;
	}

}