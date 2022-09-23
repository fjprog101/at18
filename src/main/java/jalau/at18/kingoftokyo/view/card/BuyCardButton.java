package jalau.at18.kingoftokyo.view.card;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.Component;

public class BuyCardButton extends JButton {
    private static final int[] SIZE = {150, 30};

    public BuyCardButton(ActionListener listener) {
        super("    Buy    ");
        setAlignmentX(Component.CENTER_ALIGNMENT);
        setSize(SIZE[0], SIZE[1]);
        setVisible(true);
        addActionListener(listener);
    }

}
