package jalau.at18.azul.Controller;
import jalau.at18.azul.BagSender;
import jalau.at18.azul.Tile;
import jalau.at18.azul.view.AzulFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
public class TileController implements ActionListener {
    private AzulFrame azulFrame;
    private List<Tile> gameazul;
    private BagSender game1;

    public TileController(AzulFrame frame, List<Tile> newValues) {
        this.azulFrame = frame;
        this.gameazul = newValues;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        BagSender bag = new BagSender();
        bag.saveBag();
        List<Tile> game = bag.getFactoryGroup();
       azulFrame.getTileButtonGroup().updateButtonGroup(game);
    }
}
