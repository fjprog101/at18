package jalau.at18.azul.view;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

import jalau.at18.azul.CenterTileBoard;
import jalau.at18.azul.StackTileBoard;
import jalau.at18.azul.Tile;
import jalau.at18.azul.TileColor;
import jalau.at18.azul.controllerazul.MoveTileController;

public class FactoryButtonGroup extends JPanel {

    private MoveTileController moveTiles;
    private CenterTileBoard centerBoard;
    private List<Tile> colorListFactory = new ArrayList();

    public FactoryButtonGroup(CenterButtons tilesCenter, CenterTileBoard center, StackButtonGroup stackButtonGroup) {
        this.centerBoard = center;
        moveTiles = new MoveTileController(tilesCenter, center, this, stackButtonGroup);
        add(new TilesButton(moveTiles));
        add(new TilesButton(moveTiles));
        add(new TilesButton(moveTiles));
        add(new TilesButton(moveTiles));
        setBackground(Color.CYAN);
    }

    public void updateButtonGroup(List<Tile> newValues) {
        for (int index = 0; index < getComponentCount(); index++) {
            TilesButton dieLabel = (TilesButton) getComponent(index);
            Tile dieSource = newValues.get(index);
            dieLabel.updateLabel(dieSource.getColor().getName());
            dieLabel.updateColor(dieSource.getColor().getColorPath());
        }
    }

    public List<Tile> fillArrayList(){
        for (int i = 0; i < getComponentCount(); i++) {
            TilesButton buttonSelected = (TilesButton) getComponent(i);
            colorListFactory.add(new Tile(TileColor.valueOf(buttonSelected.getTileValue())));
        }
        return colorListFactory;
    }
}
