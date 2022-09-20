package jalau.at18.kingoftokyo.view.general;

import javax.swing.*;
import java.awt.*;

public class HeaderPanel extends JPanel {
    public HeaderPanel() {
        super();
        add(new HeaderLabel());
        setBackground(Color.GREEN);
        initialize();
    }

    private void initialize() {
        setPreferredSize(new Dimension(100,100));
    }
}
