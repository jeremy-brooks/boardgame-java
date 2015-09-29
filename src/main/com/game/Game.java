package main.com.game;

/**
 * Created by jbrooks on 28/09/2015.
 */
public class Game {
    public static String STATUS = "Player position: %d,%d; Game is won: %b; Mines hit: %d";
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

    public String getGameStatus() {
        return String.format(Game.STATUS, player.getColumn(), player.getRow(), isWon(), 0);
    }
}
