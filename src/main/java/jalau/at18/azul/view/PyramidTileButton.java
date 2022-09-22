package jalau.at18.azul.view;

import javax.swing.JButton;
import java.awt.Color;

public class PyramidTileButton extends JButton {

    private PyramidTileLabel pyramidTileLabel;

    public PyramidTileButton() {
        pyramidTileLabel = new PyramidTileLabel();
        setLocation(CENTER, CENTER);
        setBackground(Color.LIGHT_GRAY);
        setBorder(null);
        add(pyramidTileLabel);
    }

    public void updateLabel(String newText) {
        pyramidTileLabel.setText(newText);
    }

    public void hideButton() {
        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
    }
}
