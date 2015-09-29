package com.game;

import static org.junit.Assert.*;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

/**
 * Created by jbrooks on 29/09/2015.
 */
public class StartGameTest {

    private Game game;

    @Before
    public void setUp(){
        game = new Game();
    }

    @After
    public void tearDown(){
        game = null;
    }

    @Given("^that a new game board is created with (\\d+) player$")
    public void that_a_new_game_board_is_created_with_player(int numberOfPlayers) {
        assertEquals(numberOfPlayers, game.getNumberOfPlayers());
    }

    @And("^the player starts at square (\\d+),(\\d+)$")
    public void the_player_starts_at_square_(int col, int row) {
        assertEquals(col, game.getPlayer().getColumn());
        assertEquals(row, game.getPlayer().getRow());
    }

    @When("^the player moves up (\\d+) square$")
    public void the_player_moves_up_square(int verticalIncrement) {
        int rowIndexBeforeMove = game.getPlayer().getRow();
        game.movePlayerUp();
        assertEquals(rowIndexBeforeMove + verticalIncrement, game.getPlayer().getRow());
    }

    @Then("^the players position is: x = (\\d+), y = (\\d+)$")
    public void the_players_position_is_(int col, int row) {
        assertEquals(col, game.getPlayer().getColumn());
        assertEquals(row, game.getPlayer().getRow());
    }

    @When("^the player moves right (\\d+) square$")
    public void the_player_moves_right_square(int horizontalIncrement) {
        int colIndexBeforeMove = game.getPlayer().getColumn();
        game.movePlayerRight();
        assertEquals(colIndexBeforeMove + horizontalIncrement, game.getPlayer().getColumn());
    }

}
