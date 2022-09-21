package jalau.at18.azul.view;

import jalau.at18.azul.BagSender;
import jalau.at18.azul.Tile;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;

public class TilesSend extends JPanel {
    private JList<String> tileList;
    public TilesSend(int posx, int posy, int width, int height) {
        //create the model and add elements
        BagSender bag = new BagSender();
        bag.saveBag();
        DefaultListModel<String> listModel = new DefaultListModel<>();
        List<Tile> listbagtiles = bag.getFactoryGroup();
        for (int pos = 0; pos < listbagtiles.size(); pos++) {
            listModel.addElement(listbagtiles.get(pos).getColor().getName());
        }
        tileList = new JList<>(listModel);
        tileList.setVisibleRowCount(2);
        tileList.setLayoutOrientation(1);
        add(tileList);
        setBounds(posx, posy, width, height);
    }
}
