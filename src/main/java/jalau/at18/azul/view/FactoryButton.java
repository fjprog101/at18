package jalau.at18.azul.view;

import javax.swing.JToggleButton;
import java.awt.Color;

public class FactoryButton extends JToggleButton {
    public static final int TILES_HEIGHT = 50;
    public static final int CENTER = 100;
    public static final int DEFAULT_POS1 = 500;
    public FactoryButton() {
        setSize(DEFAULT_POS1, DEFAULT_POS1);
        setLocation(CENTER, CENTER);
        setBackground(Color.GRAY);
        add(new TileLabel());
    }
}
