package main.com.game;

/**
 * Created by jbrooks on 28/09/2015.
 */
public class Game {
    private GameBoard board;
    private GamePlayer player;

    {
        player = new GamePlayer();
        board = new GameBoard(player);
    }

    public GameBoard getBoard() {
        return board;
    }

    public GamePlayer getPlayer() {
        return player;
    }
}
