package jalau.at18.azul.view;

import jalau.at18.azul.BagSender;
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
        listModel.addElement(bag.getFactoryGroup().toString());
        tileList = new JList<>(listModel);
        add(tileList);
        setBounds(posx, posy, width, height);
    }
}
