package com.game;

import com.game.GamePlayer;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by jbrooks on 28/09/2015.
 */
public class GamePlayerTest {

    GamePlayer player;

    @Before
    public void setUp(){
        player = new GamePlayer();
    }
    @After
    public void tearDown(){
        player = null;
    }

    @Test
    public void testSetPosition() throws Exception {
        player.setPosition(0,0);
        Assert.assertEquals(player.getColumn(), 0);
        Assert.assertEquals(player.getRow(), 0);
    }

    @Test
    public void has2Lives() {
        Assert.assertEquals(2, player.getLives());
    }

    @Test
    public void hitting1MineRemoves1Life(){
        player.hitMine();
        Assert.assertEquals(1, player.getLives());
    }
}