package jalau.at18.azul;

import javax.swing.*;
import java.awt.*;

public class PlayerPanel2 extends JPanel {
    private static final int DEFAULT_POS1 = 500;
    private static final int DEFAULT_SIZE = 300;

    public PlayerPanel2() {
        setBounds(0, DEFAULT_POS1, DEFAULT_POS1, DEFAULT_SIZE);
        setLayout(null);
        setBorder(BorderFactory.createLineBorder(Color.blue));

    }
}
