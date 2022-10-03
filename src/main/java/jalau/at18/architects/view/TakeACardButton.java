package jalau.at18.architects.view;

import javax.swing.JButton;
import java.awt.event.ActionListener;

public class TakeACardButton extends JButton {
    private static final int POSX = 100;
    private static final int POSY = 200;
    private static final int WIDTH = 100;
    private static final int HEIGHT = 20;

    public TakeACardButton(ActionListener listener) {
        super("Take a Card");
        setBounds(POSX, POSY, WIDTH, HEIGHT);
        addActionListener(listener);

    }
}
