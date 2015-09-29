package com.game;

import com.game.Game;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.*;

/**
 * Created by jbrooks on 29/09/2015.
 */
public class PlayGameTest {

    private Game game;

    @Before
    public void setUp(){
        game = new Game();
    }

    @After
    public void tearDown(){
        game = null;
    }

    @Given("^the game has a board$")
    public void the_game_has_a_board() {
        assertTrue("Game board should not be null", game.getBoard() != null);
    }

    @When("^the player is placed on the board for the first time$")
    public void the_player_is_placed_on_the_board_for_the_first_time() {
        assertTrue("Player should not be null", game.getPlayer() != null);
    }

    @Then("^the they are on the bottom left square$")
    public void the_they_are_on_the_bottom_left_square() {
        assertEquals(0, game.getPlayerColIndex());
        assertEquals(0, game.getplayerRowIndex());
    }

    @And("^the board is (\\d+) columns by (\\d+) rows$")
    public void the_board_is_columns_by_rows(int cols, int rows) {
        assertEquals(String.valueOf(cols) + "," + String.valueOf(rows), game.getBoardDimensions());
    }
}
