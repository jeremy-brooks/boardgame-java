package test.com.game;

import main.com.game.Game;
import main.com.game.GameBoard;
import main.com.game.GamePlayer;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by jbrooks on 28/09/2015.
 */
public class GameTest {

    private Game game;

    @Before
    public void setUp(){
        game = new Game();
    }
    @After
    public void tearDown(){
        game = null;
    }

    @Test
    public void hasBoard(){
        Assert.assertTrue(game.getBoard() instanceof GameBoard);
    }

    @Test
    public void hasPlayer(){
        GamePlayer player = game.getPlayer();
        Assert.assertTrue(player instanceof GamePlayer);
    }
}