package main.com.game;

/**
 * Created by jbrooks on 28/09/2015.
 */
public class Game {
    private GameBoard board;

    {
        board = new GameBoard();
    }

    public GameBoard getBoard() {
        return board;
    }
}
