package tictactoe;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BoardTest {

	private Board board = new Board(3);

   
    @Test(expected=WrongInputException.class) 
    public void testOccupied() throws WrongInputException{
        board.setField(1, 1, 'X');
        board.setField(1, 1, 'O');
           
    }

    @Test(expected=WrongInputException.class) 
    public void testWrongIdentifier() throws WrongInputException{
        board.setField(1, 1, 'F');
    }

}