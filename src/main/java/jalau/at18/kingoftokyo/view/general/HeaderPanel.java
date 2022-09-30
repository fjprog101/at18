package jalau.at18.kingoftokyo.view.general;

import javax.swing.*;
import java.awt.*;

public class HeaderPanel extends JPanel {

    private static final int DEFAULT_WIDTH = 100;
    private static final int DEFAULT_HEIGHT = 100;

    public HeaderPanel() {
        setLayout(new BorderLayout());
        add(new HeaderLabel());
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setBackground(Color.GREEN);
    }
}
