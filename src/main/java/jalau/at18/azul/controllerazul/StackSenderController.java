package jalau.at18.azul.controllerazul;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import jalau.at18.azul.view.PointerGroup;
import jalau.at18.azul.view.PyramidBoard;
import jalau.at18.azul.view.StackButtonGroup;

public class StackSenderController implements ActionListener {
    private StackButtonGroup stackButtonGroup;
    private PointerGroup pointerGroup;
    private PyramidBoard pyramidBoard;

    public StackSenderController(StackButtonGroup newStackButtonGroup, PointerGroup newPointerGroup, PyramidBoard newPyramidBoard) {
        this.stackButtonGroup = newStackButtonGroup;
        this.pointerGroup = newPointerGroup;
        this.pyramidBoard = newPyramidBoard;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        stackButtonGroup.sendTilesToPyramid(e, pointerGroup, pyramidBoard);
    }
}
