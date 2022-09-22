package jalau.at18.azul.view;

import java.util.List;
import javax.swing.JPanel;

import jalau.at18.azul.Tile;
//import jalau.at18.azul.Controller.TileController;

public class BagButton extends JPanel {
   // private TileController gameController;
  //  private List<Tile> tileList;

    public BagButton(int posx, int posy, int width, int height) {
        add(new TilesButton());
        add(new TilesButton());
        add(new TilesButton());
        add(new TilesButton());
        setBounds(posx, posy, width, height);
    }

    public void updateButtonGroup(List<Tile> newValues) {
        for (int index = 0; index < getComponentCount(); index++) {
            TilesButton dieLabel = (TilesButton) getComponent(index);
            Tile dieSource = newValues.get(index);
            dieLabel.updateLabel(dieSource.getColor().getName());
        }

    }
}
