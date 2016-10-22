
package tictactoe;

public class TicTacToeLogic{
	public static int SIZE = 3;
	public static final char[] player = {'X', 'O'};
	private Board board = new Board(SIZE);
	private int numberOfMoves = 0;

	public TicTacToeLogic(int size){
		this.SIZE = size;
	}
	/**
	 * Get number of moves for this game.
	 * 
	 * @return how many moves have been made in the game
	 */
	public int getMoves() {
		return this.numberOfMoves;
	}

	public char whosNext() {
		return this.player[numberOfMoves%2];
	}

	/**
	 * Returns the symbol for given field, if it is available (-) or occupied by another player (O or X)
	 * 
	 * @param row which row you want to chekc
	 * @param column which column you want to check
	 * @return the symbol for the given field
	 */
	public char getField(int row, int column) {
		return this.board.getField(row, column);
	}

	/**
	 * Let user choose the next field
	 * 
	 * @param row which row you want to place your mark
	 * @param column which column you want to place your mark
	 * @throws WrongInputException if row/column is out of bounds, already occupied or if value is neither X or O.
	 */
	public char setField(int row, int column) throws WrongInputException {
		
		int currPlayer = numberOfMoves % 2;
		this.board.setField(row, column, player[currPlayer]);
		this.numberOfMoves++;

		return checkWin();
	}

	/**
	 * Returns the symbol for given field, if it is available (-) or occupied by another player (O or X)
	 * 
	 * @return the symbol for the given field
	 */
	private char checkWin() {
		char temp = 0;
		boolean isWinner = true;
		
		temp = this.board.getField(0,0);
		
		// horizontal check
		for (int p=0; p<SIZE; p++) {
			temp = this.board.getField(p, 0);
			isWinner = true;
			for(int q=1; q<SIZE; q++) {
				if(this.board.getField(p, q) != temp) {
					isWinner = false;					
				}
			}
			if(isWinner) {
				return temp;
			}
		}
		
		// vertical checking
		for (int q=0; q<SIZE; q++) {
			temp = this.board.getField(0, q);
			isWinner = true;
			for (int p = 1; p<SIZE;p++) {
				if(this.board.getField(p, q) != temp) {
					isWinner = false;
				}
			}
			if(isWinner) {
				return temp;
			}
		}
		

		// cross checking: (hardcoded size)
		if (this.board.getField(0, 0) == this.board.getField(1, 1) && this.board.getField(1, 1) == this.board.getField(2, 2) )
			return this.board.getField(0, 0);
		
		if (this.board.getField(2, 0) == this.board.getField(1, 1) && this.board.getField(1, 1) == this.board.getField(0, 2) )
			return this.board.getField(2, 0);
		
		// no winner, return 0
		return '-';
	}

}