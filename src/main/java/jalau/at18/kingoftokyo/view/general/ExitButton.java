package jalau.at18.kingoftokyo.view.general;

import javax.swing.*;
import java.awt.*;

public class ExitButton extends JButton {
    public static final int DEFAULT_WIDTH = 100;
    public static final int DEFAULT_HEIGHT = 40;

    public ExitButton() {
        super("Exit");
        setPreferredSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
    }
}
