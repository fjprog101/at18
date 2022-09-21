package jalau.at18.azul.view;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;

import jalau.at18.azul.CenterTileBoard;


public class CenterList extends JPanel {

    private JList<String> center;

    public CenterList(int positionx, int positiony, int width, int height) {
        CenterTileBoard centertiles = new CenterTileBoard();
        DefaultListModel<String> centerlist = new DefaultListModel<>();
        centerlist.addElement(centertiles.toString());
        center = new JList<String>(centerlist);
        add(center);
        setBounds(positionx, positiony, width, height);
    }
}
