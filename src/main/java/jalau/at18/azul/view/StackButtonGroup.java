package jalau.at18.azul.view;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import jalau.at18.azul.Tile;
import jalau.at18.azul.TileColor;
import java.awt.event.ActionEvent;

public class StackButtonGroup extends JPanel {

    private List<Tile> stackColorList = new ArrayList<Tile>();
    private final int posX = 715;
    private final int posY = 90;
    private final int height = 300;
    private final int counter = 4;
    private int count;

    public StackButtonGroup(int y) {
        count = counter;
        add(new StackTileButton());
        add(new StackTileButton());
        add(new StackTileButton());
        add(new StackTileButton());
        add(new StackTileButton());
        add(new StackTileButton());
        setBounds(posX, y, posY, height);
    }

    public void updateStackButtons(List<Tile> stackList) {
        for (int index = 0; index < stackList.size(); index++) {
            StackTileButton stackLabel = (StackTileButton) getComponent(index);
            Tile stackTileSource = stackList.get(index);
            stackLabel.updateLabel(stackTileSource.getColor().getName());
            stackLabel.updateColor(stackTileSource.getColor().getColorPath());
        }
    }

    public List<Tile> sentStackColorList() {
        for (int index = 0; index < getComponentCount(); index++) {
            StackTileButton buttonSelected = (StackTileButton) getComponent(index);
            if (buttonSelected.getTileValue() != "EMPTY") {
                stackColorList.add(new Tile(TileColor.valueOf(buttonSelected.getTileValue())));
            }
        }
        return stackColorList;
    }

    public void sendTilesToPyramid(ActionEvent e, PointerGroup pointerGroup, PyramidBoard pyramidBoard) {
        for (int index = 0; index < pointerGroup.getComponentCount(); index++) {
            if (e.getSource() == (pointerGroup.getComponent(index))) {
                for (int jindex = 0; jindex < sentStackColorList().size(); jindex++) {
                    pyramidBoard.updateTiles(index, count, sentStackColorList().get(jindex));
                    count--;
                    if (count == sentStackColorList().size()) {
                        break;
                    }
                }
            }
        }
    }
}
