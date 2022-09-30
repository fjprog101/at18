package jalau.at18.azul.controllerazul;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import jalau.at18.azul.model.Floor;
import jalau.at18.azul.model.PyramidValidation;
import jalau.at18.azul.view.FloorButtons;
import jalau.at18.azul.view.PointerGroup;
import jalau.at18.azul.view.PyramidBoard;
import jalau.at18.azul.view.StackButtonGroup;

public class StackSenderController implements ActionListener {

    private StackButtonGroup stackButtonGroup;
    private PointerGroup pointerGroup;
    private PyramidBoard pyramidBoard;
    private FloorButtons floorButtons;
    private Floor colorPyramidTilesList;
    private PyramidValidation pyramidValidation;

    public StackSenderController(StackButtonGroup newStack, PointerGroup newPointer, PyramidBoard newPyramid,
            FloorButtons newFloor, Floor floort) {
        this.stackButtonGroup = newStack;
        this.pointerGroup = newPointer;
        this.pyramidBoard = newPyramid;
        this.floorButtons = newFloor;
        this.colorPyramidTilesList = floort;
        this.pyramidValidation = new PyramidValidation(pyramidBoard, stackButtonGroup, pointerGroup, colorPyramidTilesList);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        boolean pyramidplay = false;
        stackButtonGroup.sentStackColorList();
        for (int index = 0; index < pointerGroup.getComponentCount(); index++) {
            pyramidplay = pyramidValidation.validatePointer(index, pyramidplay, e);
            floorButtons.updateButtonGroup(colorPyramidTilesList);
            if (pyramidplay) {
                stackButtonGroup.clearStackList();
                stackButtonGroup.getStackColorList().clear();
            }
        }
    }
}