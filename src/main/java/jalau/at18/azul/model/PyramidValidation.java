package jalau.at18.azul.model;

import jalau.at18.azul.view.PointerGroup;
import jalau.at18.azul.view.PyramidBoard;
import jalau.at18.azul.view.StackButtonGroup;
import java.awt.event.ActionEvent;

public class PyramidValidation {
    private StackButtonGroup stackButtonGroup;
    private PointerGroup pointerGroup;
    private PyramidBoard pyramidBoard;
    private PyramidMovements pyramidMovements;
    private Floor colorPyramidTilesList;
    private static final int COUNTER = 4;
    private int count;

    public PyramidValidation(PyramidBoard newPyramidBoard, StackButtonGroup newStack, PointerGroup pointer,Floor floort) {
        count = COUNTER;
        this.stackButtonGroup = newStack;
        this.pointerGroup = pointer;
        this.pyramidBoard = newPyramidBoard;
        this.colorPyramidTilesList = floort;
        pyramidMovements = new PyramidMovements(pyramidBoard);
    }

    public boolean validateColors(int index, int jindex, boolean pyramidplay) {
        Tile emptyTile = new Tile(TileColor.EMPTY);
        if ((pyramidBoard.getTileButton()[index][COUNTER].getTileValue() == emptyTile.getColor()
                .getName())
                || (pyramidBoard.getTileButton()[index][COUNTER].getTileValue() == stackButtonGroup
                        .getStackColorList().get(0).getColor().getName())) {
            pyramidBoard.updateTiles(index, count, stackButtonGroup.getStackColorList().get(jindex));
            count--;
            pyramidplay = true;
        } else {
            stackButtonGroup.getStackColorList().clear();
        }
        return pyramidplay;
    }

    public boolean validatePointer(int index, boolean pyramidplay, ActionEvent e) {
        if (e.getSource() == (pointerGroup.getComponent(index))) {
            count = pyramidMovements.sendEmptyTiles(index);
            for (int jindex = 0; jindex < stackButtonGroup.getStackColorList().size(); jindex++) {
                if (pyramidMovements.countEmptyPyramidTiles(index) > 0) {
                    pyramidplay = validateColors(index, jindex, pyramidplay);
                } else {
                    colorPyramidTilesList.add(stackButtonGroup.getStackColorList().get(jindex));
                    stackButtonGroup.clearStackList();
                }
            }
            stackButtonGroup.getStackColorList().clear();
        }
        return pyramidplay;
    }

}
