package jalau.at18.architects.view;

import javax.swing.JButton;
import java.awt.event.ActionListener;

public class CheckTheConflictTokens extends JButton {
    private static final int DEFAULT_POSX = 120;
    private static final int DEFAULT_POSY = 120;
    private static final int DEFAULT_HEIGHT = 20;
    private static final int DEFAULT_WIDTH = 100;

    public CheckTheConflictTokens(ActionListener listener) {
        super("Turn Finish");
        setOpaque(false);
        setBounds(DEFAULT_POSX, DEFAULT_POSY, DEFAULT_WIDTH, DEFAULT_HEIGHT);
        addActionListener(listener);
    }
}
