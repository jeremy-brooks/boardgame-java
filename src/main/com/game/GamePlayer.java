package main.com.game;

/**
 * Created by jbrooks on 28/09/2015.
 */
public class GamePlayer {
    private int column;
    private int row;
    private int lives;

    {
        lives = 2;
    }

    public void setPosition(int col, int row) {
        this.column = col;
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    public int getLives() {
        return lives;
    }

    public void hitMine() {
        lives -= 1;
    }
}
