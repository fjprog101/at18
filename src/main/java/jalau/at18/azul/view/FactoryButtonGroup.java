package jalau.at18.azul.view;

import java.util.List;
import javax.swing.JPanel;

import jalau.at18.azul.CenterTileBoard;
import jalau.at18.azul.Tile;
import jalau.at18.azul.controllerazul.MoveTileController;

public class FactoryButtonGroup extends JPanel {
    private MoveTileController moveTiles;

    public FactoryButtonGroup(int posx, int posy, int width, int height, CenterButtons tilesCenter) {
        CenterTileBoard center = new CenterTileBoard();
        moveTiles = new MoveTileController(tilesCenter, center);
        add(new TilesButton(moveTiles));
        add(new TilesButton(moveTiles));
        add(new TilesButton(moveTiles));
        add(new TilesButton(moveTiles));
        setBounds(posx, posy, width, height);
    }

    public void updateButtonGroup(List<Tile> newValues) {
        for (int index = 0; index < getComponentCount(); index++) {
            TilesButton dieLabel = (TilesButton) getComponent(index);
            Tile dieSource = newValues.get(index);
            dieLabel.updateLabel(dieSource.getColor().getName());
            dieLabel.updateColor(dieSource.getColor().getColorPath());
        }
    }
}
