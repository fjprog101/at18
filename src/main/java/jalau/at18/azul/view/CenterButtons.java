package jalau.at18.azul.view;

import javax.swing.JPanel;

import jalau.at18.azul.CenterTileBoard;
import jalau.at18.azul.Tile;

public class CenterButtons extends JPanel {

    public CenterButtons(int posx, int posy, int width, int height) {
        add(new CenterTileButton());
        add(new CenterTileButton());
        add(new CenterTileButton());
        add(new CenterTileButton());
        add(new CenterTileButton());
        add(new CenterTileButton());
        add(new CenterTileButton());
        add(new CenterTileButton());
        add(new CenterTileButton());
        add(new CenterTileButton());
        add(new CenterTileButton());
        add(new CenterTileButton());
        add(new CenterTileButton());
        add(new CenterTileButton());
        add(new CenterTileButton());
        add(new CenterTileButton());
        //setBounds(posx, posy, width, height);
    }

    public void updateCenterButtons(CenterTileBoard centerTiles) {

        for (int index = 0; index < getComponentCount() && index < centerTiles.size(); index++) {
            CenterTileButton centerLabel = (CenterTileButton) getComponent(index);
            Tile centerSource = centerTiles.get(index);
            centerLabel.updateLabel(centerSource.getColor().getName());
        }

    }
}
