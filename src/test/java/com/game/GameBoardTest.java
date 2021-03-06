package com.game;

import com.game.GameBoard;
import com.game.GamePlayer;
import com.game.GameSquare;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

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
        Assert.assertEquals(64, board.getTotalSquares());
    }

    @Test
    public void is8x8Grid(){
        Assert.assertEquals(8, board.getTotalSquares()/8);
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
        // this only happens at the start when a player is positioned at the bottom left most square of the board
        board.movePlayer("L");
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void throwsExceptionIfPlayerMovedDownOffBoard(){
        // this only happens at the start when a player is positioned at the bottom left most square of the board
        board.movePlayer("D");
    }

    @Test
    public void boardContainsSomeMines(){
        int numberOfMinesFound = 0;
        GameSquare square;
        for (int col = 0; col < board.getColumns(); col++) {
            for (int row = 0; row < board.getRows(); row++) {
                square = board.getSquare(col,row);
                if (square.hasMine()){
                    numberOfMinesFound += 1;
                }
            }
        }
        Assert.assertTrue("Expected: > 0, Actual: " + String.valueOf(numberOfMinesFound), numberOfMinesFound > 0);
    }

    @Test
    public void startPositionDoesNotHaveMine(){
        Assert.assertFalse(board.getSquare(0,0).hasMine());
    }
}