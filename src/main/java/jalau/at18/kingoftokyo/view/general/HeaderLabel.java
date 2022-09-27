package jalau.at18.kingoftokyo.view.general;

import javax.swing.*;
import java.awt.*;

public class HeaderLabel extends JLabel {
    private static final String FONT_NAME = "Serif";
    private static final int FONT_SIZE = 60;
    public HeaderLabel() {
        super("King of Tokyo", SwingConstants.CENTER);
        setFont(new Font(FONT_NAME, Font.BOLD, FONT_SIZE));
    }
}
