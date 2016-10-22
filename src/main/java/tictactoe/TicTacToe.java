
package tictactoe;

public class TicTacToe{
	public static final int SIZE = 3;
	private char[][] board = new char[3][3];
	private int currentPlayer = 1;
	private int numberOfMoves = 0;

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
	 * Get number of moves for this game.
	 * 
	 * @return how many moves have been made in the game
	 */
	public int getMoves() {
		return this.numberOfMoves;
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
	public char setField(int row, int column, char value) {
		this.board[row][column] = value;
		this.numberOfMoves++;
		return checkWin();

	}

	private char checkWin() {
		char temp = 0;
		boolean isWinner = true;
		
		temp = board[0][0];
		
		// horizontal check
		for (int p=0; p<SIZE; p++) {
			temp = board[p][0];
			isWinner = true;
			for(int q=1; q<SIZE; q++) {
				if(board[p][q] != temp) {
					isWinner = false;					
				}
			}
			if(isWinner) {
				return temp;
			}
		}
		
		// vertical checking
		for (int q=0; q<SIZE; q++) {
			temp = board[0][q];
			isWinner = true;
			for (int p = 1; p<SIZE;p++) {
				if(board[p][q] != temp) {
					isWinner = false;
				}
			}
			if(isWinner) {
				return temp;
			}
		}
		

		// cross checking: (hardcoded size)
		if (board[0][0] == board[1][1] && board[1][1] == board[2][2] )
			return board[0][0];
		
		if (board[2][0] == board[1][1] && board[1][1] == board[0][2] )
			return board[2][0];
		
		// no winner, return 0
		return '-';
	}

}