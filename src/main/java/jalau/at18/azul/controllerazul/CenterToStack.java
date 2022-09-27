package jalau.at18.azul.controllerazul;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import jalau.at18.azul.CenterTileBoard;
import jalau.at18.azul.Tile;
import jalau.at18.azul.TileColor;
import jalau.at18.azul.view.CenterButtons;
import jalau.at18.azul.view.CenterTileButton;
import jalau.at18.azul.view.StackButtonGroup;

public class CenterToStack implements ActionListener {

    private CenterButtons centerbutton;
    private CenterTileBoard center;
    private StackButtonGroup stackButtonGroup;

    public CenterToStack(CenterTileBoard center, StackButtonGroup stack, CenterButtons centerbutton) {
        this.centerbutton = centerbutton;
        this.center = center;
        this.stackButtonGroup = stack;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        CenterTileButton buttonSelected = (CenterTileButton) e.getSource();
        CenterTileBoard newcenter = center;
        Tile color = new Tile(TileColor.valueOf(buttonSelected.getTileValue()));
        stackButtonGroup.updateStackButtons(newcenter.selectedTilesList(color));
        center.removeTilesOfSpecificColor(color);
        centerbutton.updateCenterButtons(center);
    }
}
