package jalau.at18.azul.view;

import javax.swing.JPanel;

import jalau.at18.azul.CenterTileBoard;
import jalau.at18.azul.Tile;
import jalau.at18.azul.controllerazul.CenterToStack;

public class CenterButtons extends JPanel {

    private CenterToStack moveCenterTiles;

    public CenterButtons(CenterTileBoard center, StackButtonGroup stackButtonGroup) {
        moveCenterTiles = new CenterToStack(center, stackButtonGroup, this);
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

    }
}
