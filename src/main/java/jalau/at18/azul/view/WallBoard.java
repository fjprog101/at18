package jalau.at18.azul.view;

import javax.swing.JPanel;

import jalau.at18.azul.Tile;
import jalau.at18.azul.TileColor;

import java.awt.GridLayout;

public class WallBoard extends JPanel {

    private static final int WALL_MATRIX_SIZE = 5;
    private PyramidTileButton[][] tileButton = new PyramidTileButton[WALL_MATRIX_SIZE][WALL_MATRIX_SIZE];
    private static final int THREE = 3;

    public WallBoard() {
        setLayout(new GridLayout(WALL_MATRIX_SIZE, WALL_MATRIX_SIZE, WALL_MATRIX_SIZE, WALL_MATRIX_SIZE));
        initializeWall();
    }

    public void initializeWall() {
        for (int row = 0; row < WALL_MATRIX_SIZE; row++) {
            for (int column = 0; column < WALL_MATRIX_SIZE; column++) {
                tileButton[row][column] = new PyramidTileButton();
                Tile tile = new Tile(TileColor.BLUE);
                tile = column - row == THREE + 1 || column - row == -1 ? new Tile(TileColor.WHITE)
                        : column - row == THREE || column - row == -THREE + 1 ?  new Tile(TileColor.DARK)
                        : column - row == THREE - 1 || column - row == -THREE ?  new Tile(TileColor.RED)
                        : column - row == 1 || column - row == -THREE - 1 ?  new Tile(TileColor.YELLOW)
                        : column - row == 0 ?  new Tile(TileColor.BLUE) : new Tile(TileColor.EMPTY);
                tileButton[row][column].updateLabel(tile.getColor().getName() + "/" + tile.getColor().getStatusTile());
                add(tileButton[row][column]);
            }
        }
    }
}
