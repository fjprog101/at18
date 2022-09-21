package jalau.at18.kingoftokyo.view.general;

import javax.swing.*;
import java.awt.*;

public class FooterPanel extends JPanel {

    private static final int DEFAULT_WIDTH = 100;
    private static final int DEFAULT_HEIGHT = 100;
    public FooterPanel() {
        add(new FooterLabel());
        setBackground(Color.ORANGE);
        initialize();
    }

    private void initialize() {
        setPreferredSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
    }
}
