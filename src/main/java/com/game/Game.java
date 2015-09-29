package com.game;

/**
 * Created by jbrooks on 29/09/2015.
 */
public class Game {
    private GameBoard board;
    private GamePlayer player;
    private int playerColIndex;
    private int playerRowIndex;

    {
        board = new GameBoard();
        player = new GamePlayer();
    }

    public GameBoard getBoard() {
        return board;
    }

    public GamePlayer getPlayer() {
        return player;
    }

    public int getPlayerColIndex() {
        return playerColIndex;
    }

    public int getplayerRowIndex() {
        return playerRowIndex;
    }

    public String getBoardDimensions() {
        return "8,8";
    }
}
