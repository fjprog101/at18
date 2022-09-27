package jalau.at18.azul.view;

import java.util.List;

import javax.swing.JPanel;

import jalau.at18.azul.Tile;

public class FloorButtons extends JPanel {

    public FloorButtons() {
        add(new FloorTileButton());
        add(new FloorTileButton());
        add(new FloorTileButton());
        add(new FloorTileButton());
        add(new FloorTileButton());
        add(new FloorTileButton());
        add(new FloorTileButton());
    }

    public void updateButtonGroup(List<Tile> listFloor) {
        for (int index = 0; index < getComponentCount() && index < listFloor.size(); index++) {
            if (listFloor.size() > 0) {
                FloorTileButton floorLabel = (FloorTileButton) getComponent(index);
                Tile floorSource = listFloor.get(index);
                floorLabel.updateLabel(floorSource.getColor().getName());
                floorLabel.updateColor(floorSource.getColor().getColorPath());
            }
        }
    }
}
