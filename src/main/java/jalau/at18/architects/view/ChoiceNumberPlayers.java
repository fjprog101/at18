package jalau.at18.architects.view;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import static jalau.at18.architects.Constants.ComboBox.*;
public class ChoiceNumberPlayers extends JPanel {
    private JComboBox<Integer> options;
    
    public ChoiceNumberPlayers() {
        options = new JComboBox<Integer>();
        setBounds(POS_X, POS_Y, WIDTH_CHOICE, HEIGHT_CHOICE);
        options.addItem(TWO);
        options.addItem(THREE);
        options.addItem(FOUR);
        add(options);
    }
}
