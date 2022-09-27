package jalau.at18.kingoftokyo.view.general;

import javax.swing.*;
import java.awt.*;

public class FooterPanel extends JPanel {

    public FooterPanel() {
        setLayout(new BorderLayout());
        add(new FooterLabel(), BorderLayout.EAST);
        setBackground(Color.ORANGE);
    }
}
