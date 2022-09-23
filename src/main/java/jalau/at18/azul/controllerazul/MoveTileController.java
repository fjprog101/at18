package jalau.at18.azul.controllerazul;

import jalau.at18.azul.CenterTileBoard;
import jalau.at18.azul.Tile;
import jalau.at18.azul.TileColor;
import jalau.at18.azul.view.CenterButtons;
import jalau.at18.azul.view.TilesButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class MoveTileController implements ActionListener {

    private CenterButtons centerButtonPanel;
    private CenterTileBoard center;

    public MoveTileController(CenterButtons centerButton, CenterTileBoard centerBoard) {
        this.centerButtonPanel = centerButton;
        this.center = centerBoard;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        TilesButton b = (TilesButton)e.getSource();
        Tile color = new Tile(TileColor.valueOf(b.getTileValue()));
        List<Tile> listColors = new ArrayList<>();
        listColors.add(color);
        center.addTilestoCenter(listColors);
        centerButtonPanel.updateCenterButtons(center);
        b.updateLabel("EMPTY");
    }
}
