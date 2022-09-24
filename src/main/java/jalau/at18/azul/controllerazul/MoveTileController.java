package jalau.at18.azul.controllerazul;

import jalau.at18.azul.CenterTileBoard;
import jalau.at18.azul.Tile;
import jalau.at18.azul.TileColor;
import jalau.at18.azul.view.CenterButtons;
import jalau.at18.azul.view.FactoryPanel;
import jalau.at18.azul.view.TilesButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class MoveTileController implements ActionListener {

    private CenterButtons centerButton;
    private CenterTileBoard center;

    public MoveTileController(CenterButtons newCenterButton, CenterTileBoard centerBoard) {
        this.centerButton = newCenterButton;
        this.center = centerBoard;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        TilesButton buttonSelected = (TilesButton) e.getSource();
        Tile color = new Tile(TileColor.valueOf(buttonSelected.getTileValue()));
        List<Tile> listColors = new ArrayList<>();
        listColors.add(color);
        center.addTilestoCenter(listColors);
        centerButton.updateCenterButtons(center);
        buttonSelected.updateLabel("EMPTY");
    }
}
