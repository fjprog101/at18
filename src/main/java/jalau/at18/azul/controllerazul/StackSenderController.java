package jalau.at18.azul.controllerazul;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import jalau.at18.azul.Tile;
import jalau.at18.azul.view.PointerGroup;
import jalau.at18.azul.view.PyramidBoard;
import jalau.at18.azul.view.StackButtonGroup;

public class StackSenderController implements ActionListener {
    private StackButtonGroup stackButtonGroup;
    private PointerGroup pointerGroup;
    private PyramidBoard pyramidBoard;
    private final int counter = 4;
    private int count;
    private List<Tile> colorPyramidTilesList = new ArrayList<Tile>();

    public StackSenderController(StackButtonGroup newStackButtonGroup, PointerGroup newPointerGroup, PyramidBoard newPyramidBoard) {
        count = counter;
        this.stackButtonGroup = newStackButtonGroup;
        this.pointerGroup = newPointerGroup;
        this.pyramidBoard = newPyramidBoard;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        stackButtonGroup.sentStackColorList();
        for (int index = 0; index < pointerGroup.getComponentCount(); index++) {
            if (e.getSource() == (pointerGroup.getComponent(index))) {
                count = pyramidBoard.sendEmptyTiles(index);
                for (int jindex = 0; jindex < stackButtonGroup.getStackColorList().size(); jindex++) {  
                    for (int i = 0; i < stackButtonGroup.getStackColorList().size(); i++) {
                        if (pyramidBoard.countEmptyPyramidTiles(index) > 0) {
                            pyramidBoard.updateTiles(index, count, stackButtonGroup.getStackColorList().get(jindex));
                            count--;
                        } else {
                            colorPyramidTilesList.add(stackButtonGroup.getStackColorList().get(jindex));
                        }
                        /*if (pyramidBoard.countEmptyPyramidTiles(index) < stackButtonGroup.getStackColorList().size()) {
                            System.out.println(pyramidBoard.countEmptyPyramidTiles(index));
                            pyramidBoard.updateTiles(index, count, stackButtonGroup.getStackColorList().get(jindex));
                            count--;
                        }*/
                    }
                }
            }
        }
        count = counter;
        stackButtonGroup.clearStackList();
    }
}
