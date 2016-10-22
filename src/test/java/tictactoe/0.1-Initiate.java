package tictactoe;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class InitiationTest {

    @Test
    public void initiateBoard() {
        assertEquals("---\n---\n---\nPlayer 1 turn", TicTacToeController.world());
    }
}