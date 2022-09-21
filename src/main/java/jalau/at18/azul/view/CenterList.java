package jalau.at18.azul.view;

import javax.swing.JList;

import jalau.at18.azul.CenterTileBoard;
import jalau.at18.azul.Tile;

public class CenterList extends JList<Tile> {
    public static final int DEFAULT_POSX = 50;
    public static final int DEFAULT_POSY = 50;
    public static final int DEFAULT_WIDTH = 75;
    public static final int DEFAULT_HEIGHT = 75;
    static CenterTileBoard center = new CenterTileBoard();

    CenterList() {
        super();
        setBounds(DEFAULT_POSX, DEFAULT_POSY, DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}
