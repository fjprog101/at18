package jalau.at18.azul.controllerazul;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import jalau.at18.azul.CenterTileBoard;
import jalau.at18.azul.Floor;
import jalau.at18.azul.Tile;
import jalau.at18.azul.TileColor;
import jalau.at18.azul.view.CenterButtons;
import jalau.at18.azul.view.CenterTileButton;
import jalau.at18.azul.view.FloorButtons;
import jalau.at18.azul.view.StackButtonGroup;

public class CenterToStack implements ActionListener {

    private CenterButtons centerbutton;
    private CenterTileBoard center;
    private StackButtonGroup stackButtonGroup;
    private FloorButtons floorButtons;
    private FloorButtons floorButtons2;
    private Tile first = new Tile(TileColor.FIRST);
    private Floor firsttile;

    public CenterToStack(CenterTileBoard center, StackButtonGroup stack, CenterButtons centerbutton, FloorButtons newFloor1,
        FloorButtons newfloor2, Floor floor) {
        this.centerbutton = centerbutton;
        this.center = center;
        this.floorButtons = newFloor1;
        this.floorButtons2 = newfloor2;
        this.stackButtonGroup = stack;
        this.firsttile = floor;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        CenterTileButton buttonSelected = (CenterTileButton) e.getSource();
        CenterTileBoard newcenter = center;
        Tile color = new Tile(TileColor.valueOf(buttonSelected.getTileValue()));
        if (color.equals(first)) {
            firsttile.add(new Tile(TileColor.FIRST));
            floorButtons.updateButtonGroup(firsttile);
            center.removeTilesOfSpecificColor(first);
            centerbutton.updateCenterButtons(center);
        } else {
            stackButtonGroup.updateStackButtons(newcenter.selectedTilesList(color));
            center.removeTilesOfSpecificColor(color);
            centerbutton.updateCenterButtons(center);
        }
    }
}
