package jalau.at18.azul;

import javax.swing.JLabel;

public class DieLabel extends JLabel {

    public static final int DEFAULT_POSX = 150;
    public static final int DEFAULT_POSY = 50;
    public static final int DEFAULT_WIDTH = 75;
    public static final int DEFAULT_HEIGHT = 20;

    public DieLabel() {
        super("0");
        setBounds(DEFAULT_POSX, DEFAULT_POSY, DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}