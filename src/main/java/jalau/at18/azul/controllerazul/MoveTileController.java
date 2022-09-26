package jalau.at18.azul.controllerazul;

import jalau.at18.azul.CenterTileBoard;
import jalau.at18.azul.Factory;
import jalau.at18.azul.StackTileBoard;
import jalau.at18.azul.Tile;
import jalau.at18.azul.TileColor;
import jalau.at18.azul.view.CenterButtons;
import jalau.at18.azul.view.FactoryButtonGroup;
import jalau.at18.azul.view.StackButtonGroup;
import jalau.at18.azul.view.TilesButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class MoveTileController implements ActionListener {

    private CenterButtons centerButton;
    private CenterTileBoard center;
    private StackButtonGroup stackButtonGroup;
    private StackTileBoard stack;
    private FactoryButtonGroup factoryButtonGroup;

    public MoveTileController(CenterButtons newCenterButton, CenterTileBoard centerBoard, FactoryButtonGroup newFactoryButtonGroup, StackButtonGroup newStackButtonGroup) {
        this.centerButton = newCenterButton;
        this.center = centerBoard;
        this.factoryButtonGroup = newFactoryButtonGroup;
        this.stackButtonGroup = newStackButtonGroup;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Factory factory = new Factory();
        TilesButton buttonSelected = (TilesButton) e.getSource();
        Tile color = new Tile(TileColor.valueOf(buttonSelected.getTileValue()));
        //List<Tile> listColors = new ArrayList<>();
        //listColors.add(color);
        
        factory.addTilesFromBag(factoryButtonGroup.fillArrayList());
        stackButtonGroup.updateStackButtons(factory.addTilesSelected(color));
        factory.removeTilesSelected(color);
        center.addTilestoCenter(factory.getTiles());
        centerButton.updateCenterButtons(center);
        buttonSelected.updateLabel("EMPTY");
    }
}
