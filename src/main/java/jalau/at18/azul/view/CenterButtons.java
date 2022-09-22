package jalau.at18.azul.view;

import javax.swing.JPanel;

import jalau.at18.azul.CenterTileBoard;
import jalau.at18.azul.Tile;

public class CenterButtons extends JPanel {

    public CenterButtons(int posx, int posy, int width, int height) {
        add(new TilesButton());
        add(new TilesButton());
        add(new TilesButton());
        add(new TilesButton());
        add(new TilesButton());
        add(new TilesButton());
        add(new TilesButton());
        add(new TilesButton());
        add(new TilesButton());
        add(new TilesButton());
        add(new TilesButton());
        add(new TilesButton());
        add(new TilesButton());
        add(new TilesButton());
        add(new TilesButton());
        add(new TilesButton());
        setBounds(posx, posy, width, height);
    }

    public void updateButtonGroup(CenterTileBoard centertiles) {

        for (int index = 0; index < getComponentCount(); index++) {
            TilesButton centerLabel = (TilesButton) getComponent(index);
            Tile centerSource = centertiles.get(index);
            centerLabel.updateLabel(centerSource.getColor().getName());
        }

    }
}
