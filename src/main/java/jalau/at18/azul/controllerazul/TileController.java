package jalau.at18.azul.controllerazul;

import jalau.at18.azul.BagSender;
import jalau.at18.azul.Tile;
import jalau.at18.azul.view.AzulFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class TileController implements ActionListener {
    private AzulFrame azulFrame;
    private BagSender gameAzul;

    public TileController(AzulFrame frame, BagSender newValues) {
        this.azulFrame = frame;
        this.gameAzul = newValues;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        List<Tile> game = gameAzul.getFactoryGroup();
        azulFrame.getTileButtonGroup().updateButtonGroup(game);
        gameAzul.removeTiles();
        List<Tile> game1 = gameAzul.getFactoryGroup();
        azulFrame.getTileButtonGroup1().updateButtonGroup(game1);
        gameAzul.removeTiles();
    }
}
