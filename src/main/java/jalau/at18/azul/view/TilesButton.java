package jalau.at18.azul.view;

import javax.swing.JToggleButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import jalau.at18.azul.TileColor;
import java.awt.Color;

public class TilesButton extends JToggleButton {
    //public static final int TILES_HEIGHT = 50;
    public static final int CENTER = 100;
    public static final int DEFAULT_POS1 = 400;
    private TileLabel tileLabel;
    private String newpath;
    private ImageIcon icon;

    public TilesButton() {
        tileLabel = new TileLabel();
        newpath = TileColor.EMPTY.getColorPath();
        icon = new ImageIcon("src/main/resources/Azul/" + "myicon.png");
        setSize(DEFAULT_POS1, DEFAULT_POS1);
        setLocation(CENTER, CENTER);
        setBackground(Color.GRAY);
        add(tileLabel);
        setIcon(icon);
    }

    public void updateLabel(String newText) {
        tileLabel.setText(newText);
    }

    public void updateColor(String newText) {
        ImageIcon newIcon = new ImageIcon("src/main/resources/Azul/" + newText);
        setIcon(newIcon);
    }
}
