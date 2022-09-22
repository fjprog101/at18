package jalau.at18.azul.view;

import javax.swing.JPanel;

import jalau.at18.azul.Floor;
import jalau.at18.azul.Tile;

public class FloorButtons extends JPanel {

    public FloorButtons(int posx, int posy, int width, int height) {
        add(new TilesButton());
        add(new TilesButton());
        add(new TilesButton());
        add(new TilesButton());
        add(new TilesButton());
        add(new TilesButton());
        add(new TilesButton());
        setBounds(posx, posy, width, height);
    }

    public void updateButtonGroup(Floor floor) {
        for (int index = 0; index < getComponentCount(); index++) {
            TilesButton floorLabel = (TilesButton) getComponent(index);
            Tile floorSource = floor.get(index);
            floorLabel.updateLabel(floorSource.getColor().getName());
        }

    }
}
