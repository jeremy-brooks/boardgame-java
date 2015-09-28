package test.com.game;

import main.com.game.GameBoard;
import main.com.game.GamePlayer;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by jbrooks on 28/09/2015.
 */
public class GameBoardTest {

    GameBoard board;

    @Before
    public void setUp(){
        board = new GameBoard();
    }

    @After
    public void tearDown(){
        board = null;
    }

    @Test
    public void has64Squares(){
        Assert.assertEquals(64, board.getSquares());
    }

    @Test
    public void is8x8Grid(){
        Assert.assertEquals(8, board.getSquares()/8);
    }

    @Test
    public void bottomLeftSquareContainsPlayerFromStart(){
        Assert.assertTrue(board.getSquare(0,0) instanceof GamePlayer);
    }

    @Test
    public void has8Columns(){
        Assert.assertEquals(8, board.getColumns());
    }

    @Test
    public void has8Rows(){
        Assert.assertEquals(8, board.getRows());
    }
}