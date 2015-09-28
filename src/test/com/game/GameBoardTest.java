package test.com.game;

import main.com.game.GameBoard;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jbrooks on 28/09/2015.
 */
public class GameBoardTest {

    @Test
    public void has64Squares(){
        GameBoard board = new GameBoard();
        Assert.assertEquals(64, board.getSquares());
    }
}