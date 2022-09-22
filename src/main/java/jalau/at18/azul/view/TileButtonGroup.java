package jalau.at18.azul.view;

import java.util.List;
import javax.swing.JPanel;

import jalau.at18.azul.Tile;
import jalau.at18.azul.Controller.TileController;

public class TileButtonGroup extends JPanel {
    private TileController gameController;
    private List<Tile> tileList;

    public TileButtonGroup(int posx, int posy, int width, int height) {
        add(new FactoryButton());
        add(new FactoryButton());
        add(new FactoryButton());
        add(new FactoryButton());
        //add(new TileLabel());
        setBounds(posx, posy, width, height);
        // updateButtonGroup(tileList);
    }

    public void updateButtonGroup(List<Tile> newValues) {
        for (int index = 0; index < getComponentCount(); index++) {
            FactoryButton dieLabel = (FactoryButton) getComponent(index);
            Tile dieSource = newValues.get(index);
            dieLabel.updateLabel(dieSource.getColor().getName());
        }

    }
}
