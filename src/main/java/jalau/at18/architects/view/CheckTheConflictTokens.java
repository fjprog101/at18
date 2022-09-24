package jalau.at18.architects.view;

import javax.swing.JCheckBox;
import java.awt.event.ActionListener;

public class CheckTheConflictTokens extends JCheckBox {
    private static final int DEFAULT_POSX = 65;
    private static final int DEFAULT_POSY = 85;
    private static final int DEFAULT_HEIGHT = 15;
    private static final int DEFAULT_WIDTH = 200;

    public CheckTheConflictTokens(ActionListener listener) {
        super("Check the Quantity of Tokens");
        setBounds(DEFAULT_POSX, DEFAULT_POSY, DEFAULT_WIDTH, DEFAULT_HEIGHT);
        addActionListener(listener);
    }
}
