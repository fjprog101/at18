package jalau.at18.azul.view;

import java.util.List;

import javax.swing.JPanel;

import jalau.at18.azul.Floor;
import jalau.at18.azul.Tile;
import jalau.at18.azul.TileColor;

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

    public int pointsdeductedFloor() {
        Floor counter = new Floor();
        for (int index = 0; index < getComponentCount(); index++) {
            FloorTileButton floorLabel = (FloorTileButton) getComponent(index);
            if (floorLabel.getLabel() != "EMPTY") {
                counter.add(new Tile(TileColor.NULL));
            }
        }
        return counter.pointsDeducted();
    }

    public void clearFloorTiles() {
        for (int index = 0; index < getComponentCount(); index++) {
            TilesButton buttonSelected = (TilesButton) getComponent(index);
            Tile empty = new Tile(TileColor.EMPTY);
            buttonSelected.updateLabel(empty.getColor().getName());
            buttonSelected.updateColor(empty.getColor().getColorPath());
        }
    }
    
}
