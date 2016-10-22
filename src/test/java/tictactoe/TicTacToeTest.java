package tictactoe;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TicTacToeTest {

	private TicTacToe game = new TicTacToe();

    @Test
    public void testWorld()  throws WrongInputException {
        assertEquals("Hello world", TicTacToeController.world());
    }

    @Test
    public void testInit()  throws WrongInputException {
    	for (int i = 0; i < game.SIZE; i++)
    		for (int j = 0; j < game.SIZE; j++)
    			assertEquals('-', game.getField(i,j));
    }

    @Test
    public void testPlay() throws WrongInputException {
        game.setField(0,0,'X');
        assertEquals('X', game.getField(0,0)); // test if setting field worked
        assertEquals('-', game.getField(1,0)); // test if setting field wrote too may fields
        assertEquals(1, game.getMoves());
    }

    @Test
    public void testWin() throws WrongInputException {
        game.setField(0,0,'X');
        assertEquals('-', game.setField(1, 0, 'O'));
        assertEquals('-', game.setField(1, 1, 'X'));
        assertEquals('-', game.setField(0, 1, 'O'));
        assertEquals('X', game.setField(2, 2, 'X'));
    }

    @Test(expected=WrongInputException.class) 
    public void testWrongInput() throws WrongInputException{
        assertEquals('-', game.setField(44, 1, 'X'));
    }

    @Test(expected=WrongInputException.class) 
    public void testInvalidInput() throws WrongInputException{
        assertEquals('-', game.setField(1, 1, 'X'));
        assertEquals('-', game.setField(1, 1, 'O'));
           
    }

}