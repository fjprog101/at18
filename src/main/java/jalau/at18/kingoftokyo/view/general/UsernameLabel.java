package jalau.at18.kingoftokyo.view.general;

import javax.swing.*;
import java.awt.*;

public class UsernameLabel extends JLabel {
    private static final String FONT_NAME = "Serif";
    private static final int FONT_SIZE = 18;
    public UsernameLabel() {
        super("Username: ");
        setFont(new Font(FONT_NAME, Font.BOLD, FONT_SIZE));
    }
}
