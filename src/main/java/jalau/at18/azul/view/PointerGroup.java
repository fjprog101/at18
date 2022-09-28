package jalau.at18.azul.view;

import javax.swing.JPanel;

import jalau.at18.azul.controllerazul.StackSenderController;

import java.awt.GridLayout;

public class PointerGroup extends JPanel {
    private StackSenderController controller;
    private StackButtonGroup stackButtonGroup;
    private FloorButtons floorButtons;
    private PyramidBoard pyramidBoard;
    private static final int ROW = 5;
    private static final int COL = 1;
    private static final int GAP = 3;

    public PointerGroup(StackButtonGroup newStackButtonGroup, PyramidBoard newPyramidBoard, FloorButtons newFloorButtons) {
        this.stackButtonGroup = newStackButtonGroup;
        this.pyramidBoard = newPyramidBoard;
        this.floorButtons = newFloorButtons;
        controller = new StackSenderController(stackButtonGroup, this, pyramidBoard, floorButtons);
        setLayout(new GridLayout(ROW, COL, GAP, GAP));
        add(new PyramidPointer(controller));
        add(new PyramidPointer(controller));
        add(new PyramidPointer(controller));
        add(new PyramidPointer(controller));
        add(new PyramidPointer(controller));
    }
}
