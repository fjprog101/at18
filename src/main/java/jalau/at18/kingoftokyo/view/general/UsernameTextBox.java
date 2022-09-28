package jalau.at18.kingoftokyo.view.general;

import javax.swing.*;
import java.awt.*;

public class UsernameTextBox extends JTextField {
    private static final String FONT_NAME = "Serif";
    private static final int FONT_SIZE = 18;
    private static final int TEN = 10;
    public UsernameTextBox() {
        super(TEN);
        setFont(new Font(FONT_NAME, Font.BOLD, FONT_SIZE));
    }
}
