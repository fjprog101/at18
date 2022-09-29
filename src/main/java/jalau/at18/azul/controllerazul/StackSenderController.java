package jalau.at18.azul.controllerazul;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import jalau.at18.azul.Tile;
import jalau.at18.azul.TileColor;
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
    private List<Tile> colorPyramidTilesList = new ArrayList<Tile>();

    public StackSenderController(StackButtonGroup newStack, PointerGroup newPointer, PyramidBoard newPyramid,
            FloorButtons newFloor) {
        count = counter;
        this.stackButtonGroup = newStack;
        this.pointerGroup = newPointer;
        this.pyramidBoard = newPyramid;
        this.floorButtons = newFloor;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Tile emptyTile = new Tile(TileColor.EMPTY);
        boolean pyramidplay = false;
        stackButtonGroup.sentStackColorList();
        for (int index = 0; index < pointerGroup.getComponentCount(); index++) {
            if (e.getSource() == (pointerGroup.getComponent(index))) {
                count = pyramidBoard.sendEmptyTiles(index);
                for (int jindex = 0; jindex < stackButtonGroup.getStackColorList().size(); jindex++) {
                    if (pyramidBoard.countEmptyPyramidTiles(index) > 0) {
                        if ((pyramidBoard.getTileButton()[index][counter].getTileValue() == emptyTile.getColor()
                                .getName())
                                || (pyramidBoard.getTileButton()[index][counter].getTileValue() == stackButtonGroup
                                        .getStackColorList().get(0).getColor().getName())) {
                            pyramidBoard.updateTiles(index, count, stackButtonGroup.getStackColorList().get(jindex));
                            count--;
                            pyramidplay = true;
                        } else {
                            colorPyramidTilesList.clear();
                        }
                    } else {
                        colorPyramidTilesList.add(stackButtonGroup.getStackColorList().get(jindex));
                    }
                }
            }
            floorButtons.updateButtonGroup(colorPyramidTilesList);
            count = counter;
            colorPyramidTilesList.clear();
            if (pyramidplay) {
                stackButtonGroup.clearStackList();
            }
        }
    }
}
