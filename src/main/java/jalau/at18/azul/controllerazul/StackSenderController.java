package jalau.at18.azul.controllerazul;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import jalau.at18.azul.Floor;
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

    public StackSenderController(StackButtonGroup newStack, PointerGroup newPointer, PyramidBoard newPyramid, FloorButtons newFloor, Floor floort) {
        count = counter;
        this.stackButtonGroup = newStack;
        this.pointerGroup = newPointer;
        this.pyramidBoard = newPyramid;
        this.floorButtons = newFloor;
        this.colorPyramidTilesList = floort;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        stackButtonGroup.sentStackColorList();
        for (int index = 0; index < pointerGroup.getComponentCount(); index++) {
            if (e.getSource() == (pointerGroup.getComponent(index))) {
                count = pyramidBoard.sendEmptyTiles(index);
                for (int jindex = 0; jindex < stackButtonGroup.getStackColorList().size(); jindex++) {
                    if (pyramidBoard.countEmptyPyramidTiles(index) > 0) {
                        pyramidBoard.updateTiles(index, count, stackButtonGroup.getStackColorList().get(jindex));
                        count--;
                    } else {
                        colorPyramidTilesList.add(stackButtonGroup.getStackColorList().get(jindex));
                    }
                }
            }
        }
        floorButtons.updateButtonGroup(colorPyramidTilesList);
        count = counter;
        stackButtonGroup.clearStackList();
    }
}
