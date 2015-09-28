package test.com.game;

import main.com.game.Game;
import main.com.game.GameBoard;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jbrooks on 28/09/2015.
 */
public class GameTest {
    @Test
    public void hasBoard(){
        Game game = new Game();
        Assert.assertTrue(game.getBoard() instanceof GameBoard);
    }
}