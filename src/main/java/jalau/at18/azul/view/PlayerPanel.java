package jalau.at18.azul.view;

import javax.swing.*;


import java.awt.*;

public class PlayerPanel extends JPanel {
    public static final int DEFAULT_POSX = 10; //Only tu run the test
    public static final int DEFAULT_POSY = 0; //Only tu run the test
    public static final int DEFAULT_WIDTH = 500; //Only tu run the test
    public static final int DEFAULT_HEIGHT = 350; //Only tu run the test
    public static final int HORIZONTAL_GAP = 30;
    public static final int VERTIXCAL_GAP = 50;

    private FloorButtons floorButtonGroup;

    public PlayerPanel(int player, int posy) {
        setLayout(new BorderLayout(HORIZONTAL_GAP, VERTIXCAL_GAP));
        add(new PyramidBoard(), BorderLayout.LINE_START);
        add(new WallBoard(), BorderLayout.CENTER);
        add(new FloorButtons(), BorderLayout.PAGE_END);
        setBounds(DEFAULT_POSX, posy, DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setBorder(BorderFactory.createLineBorder(Color.BLUE));
    }

    public FloorButtons getfloorButtonGroup() {
        return this.floorButtonGroup;
    }
}