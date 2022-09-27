package jalau.at18.azul.view;
import java.awt.GridLayout;
import javax.swing.JPanel;

import jalau.at18.azul.Tile;
import jalau.at18.azul.TileColor;

public class PyramidBoard extends JPanel {

    private static final int PYRAMID_MATRIZ_SIZE = 5;
    private PyramidTileButton[][] tileButton = new PyramidTileButton[PYRAMID_MATRIZ_SIZE][PYRAMID_MATRIZ_SIZE];
    private Tile emptyTile = new Tile(TileColor.EMPTY);
    private static final int DIVIDE_PYRAMID = 4;
    private int emptyColumn = 0;

    public PyramidBoard() {
        setLayout(new GridLayout(PYRAMID_MATRIZ_SIZE, PYRAMID_MATRIZ_SIZE, PYRAMID_MATRIZ_SIZE, PYRAMID_MATRIZ_SIZE));
        getPyramid();
    }

    public void getPyramid() {
        for (int row = 0; row < PYRAMID_MATRIZ_SIZE; row++) {
            for (int column = 0; column < PYRAMID_MATRIZ_SIZE; column++) {
                tileButton[row][column] = new PyramidTileButton();
                if (row + column >= DIVIDE_PYRAMID) {
                    tileButton[row][column].updateLabel(emptyTile.getColor().getName());
                    tileButton[row][column].updateColor(emptyTile.getColor().getColorPath());
                    add(tileButton[row][column]);
                } else {
                    tileButton[row][column].hideButton();
                    add(tileButton[row][column]);
                }
            }
        }
    }

    public void updateTiles(int row, int column, Tile newTile) {
        tileButton[row][column].updateLabel(newTile.getColor().getName());
        tileButton[row][column].updateColor(newTile.getColor().getColorPath());
    }

    public int sendEmptyTiles(int row) {
        for (int index = DIVIDE_PYRAMID; index > 0; index--) {
            if (tileButton[row][index].getTileValue() == "EMPTY") {
                emptyColumn = index;
                break;
            }
        }
        return emptyColumn;
    }

    public int countEmptyPyramidTiles(int row) {
        int emptyCount = 0;
        for (int index = DIVIDE_PYRAMID; index >= 0; index--) {
            if (tileButton[row][index].getTileValue() == "EMPTY") {
                emptyCount++;
            }
        }
        return emptyCount;
    }
}