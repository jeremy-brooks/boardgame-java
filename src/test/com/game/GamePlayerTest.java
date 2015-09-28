package test.com.game;

import main.com.game.GamePlayer;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jbrooks on 28/09/2015.
 */
public class GamePlayerTest {

    @Test
    public void testSetPosition() throws Exception {
        GamePlayer player = new GamePlayer();
        player.setPosition(0,0);
        Assert.assertEquals(player.getColumn(), 0);
        Assert.assertEquals(player.getRow(), 0);
    }
}