package jalau.at18.azul.controllerazul;

import jalau.at18.azul.CenterTileBoard;
import jalau.at18.azul.Factory;
import jalau.at18.azul.Tile;
import jalau.at18.azul.TileColor;
import jalau.at18.azul.view.CenterButtons;
import jalau.at18.azul.view.FactoryButtonGroup;
import jalau.at18.azul.view.StackButtonGroup;
import jalau.at18.azul.view.TilesButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MoveTileController implements ActionListener {

    private CenterButtons centerButton;
    private CenterTileBoard center;
    private StackButtonGroup stackButtonGroup;
    private FactoryButtonGroup factoryButtonGroup;

    public MoveTileController(CenterButtons newCB, CenterTileBoard newCTB, FactoryButtonGroup newFBG, StackButtonGroup newSBG) {
        this.centerButton = newCB;
        this.center = newCTB;
        this.factoryButtonGroup = newFBG;
        this.stackButtonGroup = newSBG;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Factory factory = new Factory();
        TilesButton buttonSelected = (TilesButton) e.getSource();
        Tile color = new Tile(TileColor.valueOf(buttonSelected.getTileValue()));
        factory.addTilesFromBag(factoryButtonGroup.fillArrayList());
        stackButtonGroup.updateStackButtons(factory.addTilesSelected(color));
        factory.removeTilesSelected(color);
        center.addTilestoCenter(factory.getTiles());
        centerButton.updateCenterButtons(center);
        factoryButtonGroup.clearFactoryTiles();
    }
}