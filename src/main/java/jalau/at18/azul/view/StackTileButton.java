package jalau.at18.azul.view;
import javax.swing.ImageIcon;
import javax.swing.JToggleButton;
import java.awt.Color;

public class StackTileButton extends JToggleButton {
    public static final int CENTER = 100;
    public static final int DEFAULT_POS = 0;
    private TileLabel tileLabel;
    public StackTileButton() {
        tileLabel = new TileLabel();
        setSize(DEFAULT_POS, DEFAULT_POS);
        setLocation(CENTER, CENTER);
        setBackground(Color.GRAY);
        add(tileLabel);

    }

    public void updateLabel(String newText) {
        tileLabel.setText(newText);
    }

    public void updateColor(String newText) {
        ImageIcon newIcon = new ImageIcon("src/main/resources/azul/" + newText);
        setIcon(newIcon);
    }

    public String getTileValue() {
        return tileLabel.getText();
    }
}
