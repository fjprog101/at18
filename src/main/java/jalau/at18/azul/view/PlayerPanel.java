package jalau.at18.azul.view;

import javax.swing.*;


import java.awt.*;

public class PlayerPanel extends JPanel {
    public static final int DEFAULT_POSX = 0; //Only tu run the test
    public static final int DEFAULT_POSY = 0; //Only tu run the test
    public static final int DEFAULT_WIDTH = 0; //Only tu run the test
    public static final int DEFAULT_HEIGHT = 0; //Only tu run the test

    public PlayerPanel(int posx, int posy, int width, int height) {
        setBounds(posx, posy, width, height);
        setBorder(BorderFactory.createLineBorder(Color.BLUE));
    }
}
