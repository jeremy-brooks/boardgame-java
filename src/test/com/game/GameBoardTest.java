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
    GamePlayer player;

    @Before
    public void setUp(){
        player = new GamePlayer();
        board = new GameBoard(player);
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
    public void has8Columns(){
        Assert.assertEquals(8, board.getColumns());
    }

    @Test
    public void has8Rows(){
        Assert.assertEquals(8, board.getRows());
    }

    @Test
    public void gridContainsSquares(){
        for (int col = 0; col < board.getColumns(); col++){
            for (int row = 0; row < board.getRows(); row++){
                Assert.assertTrue(board.getSquare(col,row) != null);
            }
        }
    }

    @Test
    public void firstSquareHasPlayerAtStartOfGame(){
        Assert.assertEquals(board.getSquare(0,0).getPlayer(), player);
    }

    @Test
    public void canMovePlayerUp(){
        Assert.assertEquals(0, player.getRow());
        board.movePlayer("U");
        Assert.assertEquals(1, player.getRow());
    }

    @Test
    public void canMovePlayerDown(){
        Assert.assertEquals(0, player.getRow());
        board.movePlayer("U");
        Assert.assertEquals(1, player.getRow());
        board.movePlayer("D");
        Assert.assertEquals(0, player.getRow());
    }

    @Test
    public void canMovePlayerRight(){
        Assert.assertEquals(0, player.getColumn());
        board.movePlayer("R");
        Assert.assertEquals(1, player.getColumn());
    }

    @Test
    public void canMovePlayerLeft(){
        Assert.assertEquals(0, player.getColumn());
        board.movePlayer("R");
        Assert.assertEquals(1, player.getColumn());
        board.movePlayer("L");
        Assert.assertEquals(0, player.getColumn());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void throwsExceptionIfPlayerMovedLeftOffBoard(){
        board.movePlayer("L");
    }
}