package jalau.at18.azul.view;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import jalau.at18.azul.Tile;
import jalau.at18.azul.TileColor;

public class StackButtonGroup extends JPanel {

    private List<Tile> stackColorList = new ArrayList<Tile>();
    private final int posX = 715;
    private final int posY = 90;
    private final int height = 300;
    //private final int counter = 4;
    //private int count;

    public StackButtonGroup(int y) {
      //  count = counter;
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

    public void sentStackColorList() {
        for (int index = 0; index < getComponentCount(); index++) {
            StackTileButton buttonSelected = (StackTileButton) getComponent(index);
            if (buttonSelected.getTileValue() != "EMPTY") {
                stackColorList.add(new Tile(TileColor.valueOf(buttonSelected.getTileValue())));
            }
        }
    }

    public List<Tile> getStackColorList() {
        return stackColorList;
    }

    public void clearStackList() {
        Tile emptyTile = new Tile(TileColor.EMPTY);
        for (int index = 0; index < getComponentCount(); index++) {
            StackTileButton stackLabel = (StackTileButton) getComponent(index);
            stackLabel.updateLabel(emptyTile.getColor().getName());
            stackLabel.updateColor(emptyTile.getColor().getColorPath());
        }
        stackColorList.clear();
    }
}