package jalau.at18.azul;

import javax.swing.*;
import java.awt.*;

public class FactoryPanel extends JPanel {
    private static final int DEFAULT_POS1 = 500;
    private static final int DEFAULT_POS2 = 10;
    private static final int DEFAULT_SIZE = 300;
    private static final int DEFAULT_SIZE1 = 610;

    public FactoryPanel() {

        setBounds(DEFAULT_SIZE1, DEFAULT_POS2, DEFAULT_SIZE, DEFAULT_POS1);
        setLayout(null);
        setBorder(BorderFactory.createLineBorder(Color.black));
    }
}
