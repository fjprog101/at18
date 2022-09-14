package jalau.at18.azul;
import java.util.*;

public class CenterTileBoard extends ArrayList<Character> {


    public CenterTileBoard() {
        super();
    }

    public CenterTileBoard removeTilesOfSpecificColor(char color) {
        for (int position = 0; position < this.size(); ++position) {
            if (this.get(position) == color) {
                this.remove(position);
                position--;
            }
        }
        return this;
    }

    public CenterTileBoard addTilestoCenter(char tile, int count) {
        for (int position = 0; position < count; ++position) {
            this.add(tile);
        }
        return this;
    }


}
