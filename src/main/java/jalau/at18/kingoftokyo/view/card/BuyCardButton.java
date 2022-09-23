package jalau.at18.kingoftokyo.view.card;

import javax.swing.JButton;
import java.awt.event.ActionListener;

public class BuyCardButton extends JButton {
    private static final int[] SIZE = {90, 30};

    public BuyCardButton() {
        super("Buy");
        setSize(SIZE[0], SIZE[1]);
        setVisible(true);
        //addActionListener(listener);
    }

}
