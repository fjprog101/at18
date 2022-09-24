package jalau.at18.architects.view;
import javax.swing.JComboBox;
import static jalau.at18.architects.view.Constants.ComboBox.*;
import java.awt.event.ActionListener;
public class ChoiceNumberPlayers extends JComboBox {

    private JComboBox<Integer> list;
    public ChoiceNumberPlayers(ActionListener listener) {
        list = new JComboBox<Integer>();
        setBounds(POS_X, POS_Y, WIDTH_CHOICE, HEIGHT_CHOICE);
        addItem(TWO);
        addItem(THREE);
        addItem(FOUR);
        add(list);
        addActionListener(listener);
    }
}
