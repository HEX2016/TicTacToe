package tictactoe;

public class Board {
	private char[][] board = new char[3][3];
    private int SIZE;

	/**
	* Initializes the board, set all fields as '-'
	* automatically run by the constructor.
	*/
	private void initialize(){
		for (int i = 0; i < SIZE; i++)
			for (int j = 0; j < SIZE; j++)
				this.board[i][j] = '-';
	}

	/** 
	 * Constructor for Board
	 */
	public Board(int size){
		this.SIZE = size;
		initialize();
	}

	/**
	 * Let user choose the next field
	 * 
	 * @param row which row you want to place your mark
	 * @param column which column you want to place your mark
	 * @param value is the character for the player (X / O)
	 * @throws WrongInputException if row/column is out of bounds, already occupied or if value is neither X or O.
	 */
	public void setField(int row, int column, char value) throws WrongInputException{

		if (row < 0 || row >= SIZE || column < 0 || column >=SIZE){
			throw new WrongInputException("Index out of bounds");
		}
		
		if(this.board[row][column] != '-'){
			throw new WrongInputException("Field already in use");
		}

		if(!(value == 'X' || value == 'O')){
			throw new WrongInputException("Wrong player identifier, only X/O accepted");
		}

		this.board[row][column] = value;
	}

	/**
	 * Returns the symbol for given field, if it is available (-) or occupied by another player (O or X)
	 * 
	 * @param row which row you want to check
	 * @param column which column you want to check
	 * @return the symbol for the given field
	 */
	public char getField(int row, int column) {
		return this.board[row][column];
	}

}