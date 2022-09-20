package jalau.at18.azul.view;

import jalau.at18.azul.BagSender;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;

public class TilesSend extends JPanel{
    private JList<String> countryList;
    public TilesSend(int posx, int posy, int width, int height) {
        //setBounds(posx, posy, width, height);
        //create the model and add elements
        BagSender bag = new BagSender();
        bag.saveBag();
        DefaultListModel<String> listModel = new DefaultListModel<>();
        listModel.addElement(bag.getFactoryGroup().toString());
        countryList = new JList<>(listModel);
        add(countryList);
        setBounds(posx, posy, width, height);
    }
}
