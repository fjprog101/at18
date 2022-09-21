package jalau.at18.azul.view;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;

import jalau.at18.azul.Floor;

public class FloorList extends JPanel {
    private JList<String> floor;

    public FloorList(int positionx, int positiony, int width, int height) {
        Floor floortiles = new Floor();
        DefaultListModel<String> floorlist = new DefaultListModel<>();
        floorlist.addElement(floortiles.toString());
        floor = new JList<String>(floorlist);
        add(floor);
        setBounds(positionx, positiony, width, height);
    }
}
