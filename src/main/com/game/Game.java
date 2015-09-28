package main.com.game;

/**
 * Created by jbrooks on 28/09/2015.
 */
public class Game {
    private GameBoard board;
    private GamePlayer player;
    private boolean won;

    {
        player = new GamePlayer();
        board = new GameBoard(player);
        won = false;
    }

    public GameBoard getBoard() {
        return board;
    }

    public GamePlayer getPlayer() {
        return player;
    }

    public boolean isWon() {
        return won;
    }

    public void movePlayerUp() {
        board.movePlayer("U");
        if (player.getRow() == 7){
            won = true;
        }
    }
}
