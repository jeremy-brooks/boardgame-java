package com.game;

import com.game.Game;
import com.game.GameBoard;
import com.game.GamePlayer;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

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
        Assert.assertTrue(game.getBoard() != null);
    }

    @Test
    public void hasPlayer(){
        GamePlayer player = game.getPlayer();
        Assert.assertTrue(player != null);
    }

    @Test
    public void gameIsNotWonAtStart(){
        Assert.assertFalse(game.isWon());
    }

    @Test
    public void whenPlayerReachesTopOfBoardTheyWin(){
        // start at 1 because the rows are not zero indexed!
        for (int row = 1; row < game.getBoard().getRows(); row++){
            game.movePlayerUp();
        }
        Assert.assertTrue(game.isWon());
    }

    @Test
    public void displaysGameStatus(){
        Assert.assertEquals(String.format(Game.STATUS,0,0,false,0), game.getGameStatus());
    }
}