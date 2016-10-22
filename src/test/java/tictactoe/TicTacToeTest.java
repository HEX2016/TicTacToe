package tictactoe;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TicTacToeTest {

	private TicTacToe game = new TicTacToe();


    @Test
    public void testWorld() {
        assertEquals("Hello world", TicTacToeController.world());
    }

    @Test
    public void testInit() {
    	for (int i = 0; i < game.SIZE; i++)
    		for (int j = 0; j < game.SIZE; j++)
    			assertEquals('-', game.getField(i,j));
    }
}