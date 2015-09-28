package test.com.game;

import main.com.game.GameBoard;
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

    }
}