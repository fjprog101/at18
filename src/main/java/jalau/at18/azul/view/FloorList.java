package jalau.at18.azul.view;

import javax.swing.JList;

import jalau.at18.azul.Tile;

public class FloorList extends JList<Tile> {
    public static final int DEFAULT_POSX = 20;
    public static final int DEFAULT_POSY = 50;
    public static final int DEFAULT_WIDTH = 25;
    public static final int DEFAULT_HEIGHT = 25;

    FloorList() {
        super();
        setBounds(DEFAULT_POSX, DEFAULT_POSY, DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setLayoutOrientation(HORIZONTAL_WRAP);
    }
}
