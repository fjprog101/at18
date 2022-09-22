package jalau.at18.azul;

import java.util.List;

public class FactorySenderToPyramid {

    private Pyramid pyramid;

    public FactorySenderToPyramid() {
        this.pyramid = new Pyramid();

    }

    public void sendTilesToPyramid(List<Tile> tilesSelected) {
        for(int index = 0; index < tilesSelected.size(); index++) {
            pyramid.addTileToPyramid(row, column, tilesSelected.get(index));
        }
    }

}
