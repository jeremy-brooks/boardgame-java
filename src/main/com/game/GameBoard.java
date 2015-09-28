package main.com.game;

/**
 * Created by jbrooks on 28/09/2015.
 */
public class GameBoard {
    private int columns;
    private int rows;
    private GamePlayer[][] grid;

    {
        // default columns and rows
        columns = 8;
        rows = 8;

        // set up grid
        grid = new GamePlayer[columns][rows];

        // create player and put in board
        grid[0][0] = new GamePlayer();
    }

    public int getSquares() {
        return columns*rows;
    }

    public GamePlayer getSquare(int column, int row) {
        return grid[column][row];
    }

    public int getColumns() {
        return columns;
    }

    public int getRows() {
        return rows;
    }
}
