package jalau.at18.architects.view;
import javax.swing.JComboBox;
import static jalau.at18.architects.view.Constants.ComboBox.*;
import java.awt.event.ActionListener;
public class ChoiceNumberPlayers extends JComboBox<Integer> {
    public ChoiceNumberPlayers(ActionListener listener) {
        setBounds(POS_X, POS_Y, WIDTH_CHOICE, HEIGHT_CHOICE);
        addItem(TWO);
        addItem(THREE);
        addItem(FOUR);
        addActionListener(listener);
    }
}
