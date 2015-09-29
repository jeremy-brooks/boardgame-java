package com.game;

/**
 * Created by jbrooks on 28/09/2015.
 */
public class GameSquare {

    private GamePlayer player;
    private boolean hasMine;

    public void setPlayer(GamePlayer player) {
        this.player = player;
    }

    public GamePlayer getPlayer() {
        return player;
    }

    public boolean hasMine() {
        return hasMine;
    }

    public void layMine() {
        hasMine = true;
    }
}
