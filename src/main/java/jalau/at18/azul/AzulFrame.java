package jalau.at18.azul;

import javax.swing.*;

public class AzulFrame extends JFrame{
    private static final int DEFAULT_POS1 = 500;
    private static final int DEFAULT_SIZE = 300;
    private static final int DEFAULT_POS2 = 10;
    private static final int DEFAULT_SIZE1 = 610;

    public AzulFrame() {

        add(new PlayerPanel1(0, 0, DEFAULT_POS1, DEFAULT_SIZE));
        add(new PlayerPanel1(0, DEFAULT_SIZE, DEFAULT_POS1, DEFAULT_SIZE));
        add(new PlayerPanel1(DEFAULT_SIZE1, DEFAULT_POS2, DEFAULT_SIZE, DEFAULT_SIZE1));
    }
}
