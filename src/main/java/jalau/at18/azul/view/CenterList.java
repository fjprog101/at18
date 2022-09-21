package jalau.at18.azul.view;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;

import jalau.at18.azul.CenterTileBoard;
import jalau.at18.azul.Tile;

public class CenterList extends JPanel {

    private JList<String> center;

    public CenterList(int positionx, int positiony, int width, int height) {
        CenterTileBoard centertiles = new CenterTileBoard();
        centertiles.add(Tile.EMPTY);
        centertiles.add(Tile.EMPTY);
        centertiles.add(Tile.EMPTY);
        centertiles.add(Tile.EMPTY);
        centertiles.add(Tile.EMPTY);
        centertiles.add(Tile.EMPTY);
        DefaultListModel<String> centerlist = new DefaultListModel<>();
        for (int pos = 0; pos < centertiles.size(); pos++) {
            centerlist.addElement((centertiles.get(pos)).toString());
        }
        center = new JList<String>(centerlist);
        add(center);
        setBounds(positionx, positiony, width, height);
    }
}
