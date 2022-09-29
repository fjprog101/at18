package jalau.at18.azul.controllerazul;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import jalau.at18.azul.model.Floor;
import jalau.at18.azul.model.PyramidMovements;
import jalau.at18.azul.model.Tile;
import jalau.at18.azul.model.TileColor;
import jalau.at18.azul.view.FloorButtons;
import jalau.at18.azul.view.PointerGroup;
import jalau.at18.azul.view.PyramidBoard;
import jalau.at18.azul.view.StackButtonGroup;

public class StackSenderController implements ActionListener {

    private StackButtonGroup stackButtonGroup;
    private PointerGroup pointerGroup;
    private PyramidBoard pyramidBoard;
    private FloorButtons floorButtons;
    private final int counter = 4;
    private int count;
    private Floor colorPyramidTilesList;
    private PyramidMovements pyramidMovements;

    public StackSenderController(StackButtonGroup newStack, PointerGroup newPointer, PyramidBoard newPyramid,
            FloorButtons newFloor, Floor floort) {
        count = counter;
        this.stackButtonGroup = newStack;
        this.pointerGroup = newPointer;
        this.pyramidBoard = newPyramid;
        this.floorButtons = newFloor;
        this.colorPyramidTilesList = floort;
        pyramidMovements = new PyramidMovements(pyramidBoard);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Tile emptyTile = new Tile(TileColor.EMPTY);
        boolean pyramidplay = false;
        stackButtonGroup.sentStackColorList();
        for (int index = 0; index < pointerGroup.getComponentCount(); index++) {
            if (e.getSource() == (pointerGroup.getComponent(index))) {
                count = pyramidMovements.sendEmptyTiles(index);
                int tilesLimit = stackButtonGroup.getStackColorList().size();
                for (int jindex = 0; jindex < tilesLimit; jindex++) {
                    if (pyramidMovements.countEmptyPyramidTiles(index) > 0) {
                        if ((pyramidBoard.getTileButton()[index][counter].getTileValue() == emptyTile.getColor()
                                .getName())
                                || (pyramidBoard.getTileButton()[index][counter].getTileValue() == stackButtonGroup
                                        .getStackColorList().get(0).getColor().getName())) {
                            pyramidBoard.updateTiles(index, count, stackButtonGroup.getStackColorList().get(jindex));
                            count--;
                            pyramidplay = true;
                        } else {
                            stackButtonGroup.getStackColorList().clear();
                        }
                    } else {
                        colorPyramidTilesList.add(stackButtonGroup.getStackColorList().get(jindex));
                        stackButtonGroup.clearStackList();
                    }
                }
                stackButtonGroup.getStackColorList().clear();
            }
            floorButtons.updateButtonGroup(colorPyramidTilesList);
            count = counter;
            if (pyramidplay) {
                stackButtonGroup.clearStackList();
                stackButtonGroup.getStackColorList().clear();
            }
        }
    }
}