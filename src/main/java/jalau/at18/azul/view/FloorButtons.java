package jalau.at18.azul.view;

import javax.swing.JPanel;

import jalau.at18.azul.model.Floor;
import jalau.at18.azul.model.Tile;
import jalau.at18.azul.model.TileColor;

public class FloorButtons extends JPanel {

    public FloorButtons(Floor floor) {
        add(new FloorTileButton());
        add(new FloorTileButton());
        add(new FloorTileButton());
        add(new FloorTileButton());
        add(new FloorTileButton());
        add(new FloorTileButton());
        add(new FloorTileButton());
    }

    public void updateButtonGroup(Floor listFloor) {
        if (listFloor != null) {
            for (int index = 0; index < getComponentCount() && index < listFloor.size(); index++) {
                if (listFloor != null) {
                    FloorTileButton floorLabel = (FloorTileButton) getComponent(index);
                    Tile floorSource = listFloor.get(index);
                    floorLabel.updateLabel(floorSource.getColor().getName());
                    floorLabel.updateColor(floorSource.getColor().getColorPath());
                }
            }
        }
    }

    public void clearFloorTiles() {
        for (int index = 0; index < getComponentCount(); index++) {
            FloorTileButton buttonSelected = (FloorTileButton) getComponent(index);
            Tile empty = new Tile(TileColor.EMPTY);
            buttonSelected.updateLabel(empty.getColor().getName());
            buttonSelected.updateColor(empty.getColor().getColorPath());
        }
    }
}
