package jalau.at18.azul.view;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;

public class FloorTileButton extends JButton {
    public static final int CENTER = 100;
    public static final int DEFAULT_POS1 = 400;
    private TileLabel tileLabel;
    public FloorTileButton() {
        tileLabel = new TileLabel();
        setSize(DEFAULT_POS1, DEFAULT_POS1);
        setLocation(CENTER, CENTER);
        setBackground(Color.GRAY);
        add(tileLabel);

    }

    public void updateLabel(String newText) {
        tileLabel.setText(newText);
    }
    public String getLabel() {
        return tileLabel.getText();
    }

    public void updateColor(String newText) {
        ImageIcon newIcon = new ImageIcon("src/main/resources/azul/" + newText);
        setIcon(newIcon);
    }
}
