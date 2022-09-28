package jalau.at18.azul.view;

import javax.swing.JPanel;

import jalau.at18.azul.CenterTileBoard;
import jalau.at18.azul.Tile;
import jalau.at18.azul.TileColor;
import jalau.at18.azul.controllerazul.CenterToStack;

public class CenterButtons extends JPanel {

    private CenterToStack moveCenterTiles;

    public CenterButtons(CenterTileBoard center, StackButtonGroup stackButtonGroup, FloorButtons floorbuttons1, FloorButtons floorbuttons2) {
        moveCenterTiles = new CenterToStack(center, stackButtonGroup, this, floorbuttons1, floorbuttons2);
        add(new CenterTileButton(moveCenterTiles));
        add(new CenterTileButton(moveCenterTiles));
        add(new CenterTileButton(moveCenterTiles));
        add(new CenterTileButton(moveCenterTiles));
        add(new CenterTileButton(moveCenterTiles));
        add(new CenterTileButton(moveCenterTiles));
        add(new CenterTileButton(moveCenterTiles));
        add(new CenterTileButton(moveCenterTiles));
        add(new CenterTileButton(moveCenterTiles));
        add(new CenterTileButton(moveCenterTiles));
        add(new CenterTileButton(moveCenterTiles));
        add(new CenterTileButton(moveCenterTiles));
        add(new CenterTileButton(moveCenterTiles));
        add(new CenterTileButton(moveCenterTiles));
        add(new CenterTileButton(moveCenterTiles));
        add(new CenterTileButton(moveCenterTiles));
    }

    public void updateCenterButtons(CenterTileBoard centerTiles) {
        for (int index = 0; index < getComponentCount() && index < centerTiles.size(); index++) {
            CenterTileButton centerLabel = (CenterTileButton) getComponent(index);
            Tile centerSource = centerTiles.get(index);
            centerLabel.updateLabel(centerSource.getColor().getName());
            centerLabel.updateColor(centerSource.getColor().getColorPath());
        }
        for (int index = centerTiles.size(); index < getComponentCount(); index++) {
            CenterTileButton centerLabel = (CenterTileButton) getComponent(index);
            centerLabel.updateLabel("EMPTY");
            centerLabel.updateColor("empty.png");
        }
    }

    public boolean isCenterEmpty() {
        int count = 0;
        Tile empty = new Tile(TileColor.EMPTY);
        for (int index = 0; index < getComponentCount(); index++) {
            CenterTileButton buttonSelected = (CenterTileButton) getComponent(index);
            if (buttonSelected.getTileValue() == empty.getColor().getName()) {
                count++;
            }
        }
        return count == getComponentCount();
    }
}
