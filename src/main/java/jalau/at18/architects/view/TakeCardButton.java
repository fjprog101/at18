package jalau.at18.architects.view;

import javax.swing.JButton;
import java.awt.event.ActionListener;

public class TakeCardButton extends JButton {
    private static final int DEFAULT_POSX = 75;
    private static final int DEFAULT_POSY = 120;
    private static final int DEFAULT_HEIGHT = 15;
    private static final int DEFAULT_WIDTH = 200;

    public TakeCardButton(ActionListener listener) {
        super("Take a Card");
        setBounds(DEFAULT_POSX, DEFAULT_POSY, DEFAULT_WIDTH, DEFAULT_HEIGHT);
        addActionListener(listener);
    }
}
