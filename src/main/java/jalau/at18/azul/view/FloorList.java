package jalau.at18.azul.view;

import javax.swing.JList;

import jalau.at18.azul.Tile;

public class FloorList extends JList<Tile> {
    public static final int DEFAULT_POSX = 100;
    public static final int DEFAULT_POSY = 50;
    public static final int DEFAULT_WIDTH = 150;
    public static final int DEFAULT_HEIGHT = 75;

    FloorList() {
        super();
        setBounds(DEFAULT_POSX, DEFAULT_POSY, DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setLayoutOrientation(HORIZONTAL_WRAP);
    }
}
