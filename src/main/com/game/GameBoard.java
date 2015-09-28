package main.com.game;

/**
 * Created by jbrooks on 28/09/2015.
 */
public class GameBoard {
    private int columns;
    private int rows;
    private GameSquare[][] grid;
    private GamePlayer player;

    {
        // default columns and rows
        columns = 8;
        rows = 8;

        // set up grid
        grid = new GameSquare[columns][rows];

        // initialise grid
        GameSquare gs;
        for (int col = 0; col < columns; col++){
            for (int row = 0; row < rows; row++){
                gs = new GameSquare();
                // don't want the starting position to have a mine otherwise its game over already!
                if ((row > 0 && col == 0) || (row == 0 && col > 0) || row > 0 || col > 0) {
                    if (Math.random() >= 0.5) {
                        gs.layMine();
                    }
                }
                grid[col][row] = gs;
            }
        }
    }

    public GameBoard(GamePlayer player){
        GameSquare firstSquare = grid[0][0];
        this.player = player;
        this.player.setPosition(0,0);
        firstSquare.setPlayer(player);
    }

    public int getTotalSquares() {
        return columns*rows;
    }

    public GameSquare getSquare(int column, int row) {
        return grid[column][row];
    }

    public int getColumns() {
        return columns;
    }

    public int getRows() {
        return rows;
    }

    public void movePlayer(String direction) {
        direction = direction.toUpperCase();
        if (direction == "U"){
            move(0,1);
        } else if (direction == "R"){
            move(1,0);
        } else if (direction == "L"){
            move(-1,0);
        } else if (direction == "D"){
            move(0,-1);
        }
    }

    private void move(int colIncrement, int rowIncrement){
        // get and reset current player position
        GameSquare gs = grid[player.getColumn()][player.getRow()];
        gs.setPlayer(null);

        // get and set new player position
        player.setPosition(player.getColumn()+colIncrement, player.getRow()+rowIncrement);
        GameSquare gs2 = grid[player.getColumn()][player.getRow()];
        gs2.setPlayer(player);
    }
}
