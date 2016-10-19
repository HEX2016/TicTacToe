package tictactoe;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TicTacToeTest {

    @Test
    public void testWorld() {
        assertEquals("Hello world", TicTacToeController.world());
    }
}