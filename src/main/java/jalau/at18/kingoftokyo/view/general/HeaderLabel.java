package jalau.at18.kingoftokyo.view.general;

import javax.swing.*;
import java.awt.*;

public class HeaderLabel extends JLabel {
    private static final int WIDTH = 700;
    private static final int HEIGHT = 125;
    private static final int HINTS = 100;
    private static final int ZERO = 0;
    public HeaderLabel() {
        setBounds(ZERO, ZERO, 700, 125);
        ImageIcon image = new ImageIcon("src/main/resources/kingoftokyo/header.png");
        Icon icon = new ImageIcon(image.getImage().getScaledInstance( WIDTH, HEIGHT, HINTS));
        setIcon(icon);
        setAlignmentX(Component.CENTER_ALIGNMENT);
        setVisible(true);
    }
}
