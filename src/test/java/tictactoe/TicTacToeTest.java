package tictactoe;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TicTacToeTest {

	private TicTacToeLogic game = new TicTacToeLogic(3);

    @Test
    public void testInit()  throws WrongInputException {
    	for (int i = 0; i < game.SIZE; i++)
    		for (int j = 0; j < game.SIZE; j++)
    			assertEquals('-', game.getField(i,j));
    }

    @Test
    public void testPlay() throws WrongInputException {
        game.setField(0,0);
        assertEquals('X', game.getField(0,0)); // test if setting field worked
        assertEquals('-', game.getField(1,0)); // test if setting field wrote too may fields
        assertEquals(1, game.getMoves());
    }

    @Test
    public void testWin() throws WrongInputException {
        assertEquals('-', game.setField(0, 0));
        assertEquals('-', game.setField(1, 0));
        assertEquals('-', game.setField(1, 1));
        assertEquals('-', game.setField(0, 1));
        assertEquals('X', game.setField(2, 2));
    }

    @Test(expected=WrongInputException.class) 
    public void testWrongInput() throws WrongInputException{
        assertEquals('-', game.setField(44, 1));
    }

    @Test(expected=WrongInputException.class) 
    public void testInvalidInput() throws WrongInputException{
        assertEquals('-', game.setField(1, 1));
        assertEquals('-', game.setField(1, 1));
           
    }

}