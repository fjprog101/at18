package jalau.at18.azul.model;

import jalau.at18.azul.view.PyramidBoard;

public class PyramidMovements {
    private static final int DIVIDE_PYRAMID = 4;
    private int emptyColumn = 0;
    private Tile emptyTile = new Tile(TileColor.EMPTY);
    private PyramidBoard pyramidBoard;
    public PyramidMovements(PyramidBoard newPyramidBoard) {
        this.pyramidBoard = newPyramidBoard;
    }

    public int sendEmptyTiles(int row) {
        for (int index = DIVIDE_PYRAMID; index >= 0; index--) {
            if (pyramidBoard.getTileButton()[row][index].getTileValue() == emptyTile.getColor().getName()) {
                emptyColumn = index;
                break;
            }
        }
        return emptyColumn;
    }

    public int countEmptyPyramidTiles(int row) {
        int emptyCount = 0;
        for (int index = DIVIDE_PYRAMID; index >= 0; index--) {
            if (pyramidBoard.getTileButton()[row][index].getTileValue() == emptyTile.getColor().getName()) {
                emptyCount++;
            }
        }
        return emptyCount;
    }

    public void cleanPyramid(int row) {
        for (int index = DIVIDE_PYRAMID; index >= 0; index--) {
            if (row + index >= DIVIDE_PYRAMID) {
                pyramidBoard.getTileButton()[row][index].updateLabel(emptyTile.getColor().getName());
                pyramidBoard.getTileButton()[row][index].updateColor(emptyTile.getColor().getColorPath());
            }
        }
    }
}
