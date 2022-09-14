package jalau.at18.azul;

import java.util.ArrayList;

public class Floor extends ArrayList<Character> {
    private final int[] floorDeduction = {0, 1, 2, 4, 6, 8, 11, 14 };
    private final int floorlength = 7;


    public Floor addTilestoFloor(char tile, int count) {
        for (int position = 0; position < count && this.size() < floorlength; ++position) {
            this.add(tile);
        }
        return this;
    }
    public int pointsDeducted() {
        return floorDeduction[this.size()];
    }
}
