package jalau.at18.azul.model;

import java.util.ArrayList;
import java.util.List;

public class Floor extends ArrayList<Tile> {
    private final int[] floorDeduction = {0, 1, 2, 4, 6, 8, 11, 14 };
    private final int floorlength = 7;


    public Floor addTilestoFloor(List<Tile> newfloorTile) {
        if (this.size() < floorlength) {
            this.addAll(newfloorTile);
        }
        return this;
    }

    public int pointsDeducted() {
        return floorDeduction[this.size()];
    }

}
