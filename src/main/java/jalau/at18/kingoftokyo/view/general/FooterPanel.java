package jalau.at18.kingoftokyo.view.general;

import javax.swing.*;
import java.awt.*;

public class FooterPanel extends JPanel {
    public FooterPanel() {
        add(new FooterLabel());
        setBackground(Color.ORANGE);
        initialize();
    }

    private void initialize() {
        setPreferredSize(new Dimension(100,100));
    }
}
