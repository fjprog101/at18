package jalau.at18.azul.view;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;

import jalau.at18.azul.Floor;
import jalau.at18.azul.Tile;

public class FloorList extends JPanel {
    private JList<String> floor;

    public FloorList(int positionx, int positiony, int width, int height) {
        Floor floortiles = new Floor();
        floortiles.add(Tile.EMPTY);
        floortiles.add(Tile.EMPTY);
        floortiles.add(Tile.EMPTY);
        floortiles.add(Tile.EMPTY);
        floortiles.add(Tile.EMPTY);
        floortiles.add(Tile.EMPTY);
        floortiles.add(Tile.EMPTY);
        DefaultListModel<String> floorlist = new DefaultListModel<>();
        for (int pos = 0; pos < floortiles.size(); pos++) {
            floorlist.addElement((floortiles.get(pos)).toString());
        }
        floor = new JList<String>(floorlist);
        floor.setVisibleRowCount(1);
        floor.setLayoutOrientation(JList.HORIZONTAL_WRAP);
        add(floor);
        setBounds(positionx, positiony, width, height);
    }
}
