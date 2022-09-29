package jalau.at18.azul.view;

import javax.swing.JPanel;

import jalau.at18.azul.controllerazul.StackSenderController;
import jalau.at18.azul.model.Floor;

import java.awt.GridLayout;

public class PointerGroup extends JPanel {
    private StackSenderController controller;
    private StackButtonGroup stackButtonGroup;
    private FloorButtons floorButtons;
    private Floor floorp;
    private PyramidBoard pyramidBoard;
    private static final int ROW = 5;
    private static final int COL = 1;
    private static final int GAP = 3;

    public PointerGroup(StackButtonGroup newStackButtonGroup, PyramidBoard newPyramidBoard, FloorButtons newFloorButtons, Floor floor) {
        this.stackButtonGroup = newStackButtonGroup;
        this.pyramidBoard = newPyramidBoard;
        this.floorButtons = newFloorButtons;
        this.floorp = floor;
        controller = new StackSenderController(stackButtonGroup, this, pyramidBoard, floorButtons, floorp);
        setLayout(new GridLayout(ROW, COL, GAP, GAP));
        add(new PyramidPointer(controller));
        add(new PyramidPointer(controller));
        add(new PyramidPointer(controller));
        add(new PyramidPointer(controller));
        add(new PyramidPointer(controller));
    }
}
