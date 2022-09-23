package jalau.at18.azul.view;

import javax.swing.JToggleButton;
import java.awt.Color;


public class CenterTileButton extends JToggleButton {
    public static final int CENTER = 100;
    public static final int DEFAULT_POS1 = 400;
    private TileLabel tileLabel;
    public CenterTileButton() {
        tileLabel = new TileLabel();
        setSize(DEFAULT_POS1, DEFAULT_POS1);
        setLocation(CENTER, CENTER);
        setBackground(Color.GRAY);
        add(tileLabel);

    }

    public void updateLabel(String newText) {
        tileLabel.setText(newText);
    }

}
