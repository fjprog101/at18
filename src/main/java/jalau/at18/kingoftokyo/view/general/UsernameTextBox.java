package jalau.at18.kingoftokyo.view.general;

import javax.swing.*;
import java.awt.*;

public class UsernameTextBox extends JTextField {
    private static final String FONT_NAME = "Serif";
    private static final int FONT_SIZE = 18;
    public UsernameTextBox() {
        super(10);
        setFont(new Font(FONT_NAME, Font.BOLD, FONT_SIZE));
    }
}
