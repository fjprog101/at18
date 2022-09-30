package jalau.at18.azul.view;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import jalau.at18.azul.controllerazul.MoveTileController;
import jalau.at18.azul.model.CenterTileBoard;
import jalau.at18.azul.model.Tile;
import jalau.at18.azul.model.TileColor;
public class FactoryButtonGroup extends JPanel {

    private MoveTileController moveTiles;
    private CenterTileBoard centerBoard;
    private List<Tile> colorListFactory = new ArrayList<Tile>();
    private static int components = 5;

    public FactoryButtonGroup(CenterButtons tilesCenter, CenterTileBoard center, StackButtonGroup stackButtonGroup) {
        this.centerBoard = center;
        moveTiles = new MoveTileController(tilesCenter, center, this, stackButtonGroup);
        add(new TilesButton(moveTiles));
        add(new TilesButton(moveTiles));
        add(new TilesButton(moveTiles));
        add(new TilesButton(moveTiles));
        setBackground(Color.WHITE);
        JLabel label = new JLabel();
        ImageIcon newIcon = new ImageIcon("src/main/resources/azul/factorybackground.jpg");
        label.setIcon(newIcon);
        add(label);

    }

    public void updateButtonGroup(List<Tile> newValues) {
        for (int index = 0; index < 4; index++) {
            TilesButton dieLabel = (TilesButton) getComponent(index);
            Tile dieSource = newValues.get(index);
            dieLabel.updateLabel(dieSource.getColor().getName());
            dieLabel.updateColor(dieSource.getColor().getColorPath());
        }
    }

    public List<Tile> fillArrayList() {
        for (int index = 0; index < 4; index++) {
            TilesButton buttonSelected = (TilesButton) getComponent(index);
            colorListFactory.add(new Tile(TileColor.valueOf(buttonSelected.getTileValue())));
        }
        return colorListFactory;
    }

    public void clearFactoryTiles() {
        for (int index = 0; index < 4; index++) {
            TilesButton buttonSelected = (TilesButton) getComponent(index);
            Tile empty = new Tile(TileColor.EMPTY);
            buttonSelected.updateLabel(empty.getColor().getName());
            buttonSelected.updateColor(empty.getColor().getColorPath());
        }
        colorListFactory.clear();
    }

    public boolean isFactoryEmpty() {
        boolean isEmpty = false;
        Tile empty = new Tile(TileColor.EMPTY);
        for (int index = 0; index < 4; index++) {
            TilesButton buttonSelected = (TilesButton) getComponent(index);
            if (buttonSelected.getTileValue() == empty.getColor().getName()) {
                isEmpty = true;
            }
        }
        return isEmpty;
    }
}