package jalau.at18.azul.controllerazul;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import jalau.at18.azul.StackTileBoard;
import jalau.at18.azul.Tile;
import jalau.at18.azul.TileColor;
import jalau.at18.azul.view.StackButtonGroup;
import jalau.at18.azul.view.TilesButton;

public class MoveTileStackController implements ActionListener {

    private StackButtonGroup stackButtonGroup;
    private StackTileBoard stack;

    public MoveTileStackController(StackButtonGroup newStackButtonGroup, StackTileBoard stackBoard) {
        this.stackButtonGroup = newStackButtonGroup;
        this.stack = stackBoard;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        TilesButton buttonSelected = (TilesButton) e.getSource();
        Tile color = new Tile(TileColor.valueOf(buttonSelected.getTileValue()));
        List<Tile> listColors = new ArrayList<>();
        listColors.add(color);
        stack.addTilesToStack(listColors);
        stackButtonGroup.updateStackButtons(stack);
        buttonSelected.updateLabel("EMPTY");
    }
}
