package jalau.at18.azul.view;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;


public class CenterTileButton extends JButton {
    public static final int CENTER = 100;
    public static final int DEFAULT_POS1 = 400;
    private TileLabel tileLabel;

    public CenterTileButton(ActionListener listener) {

        tileLabel = new TileLabel();
        setSize(DEFAULT_POS1, DEFAULT_POS1);
        setLocation(CENTER, CENTER);
        setBackground(Color.GRAY);
        add(tileLabel);
        addActionListener(listener);

    }

    public void updateLabel(String newText) {
        tileLabel.setText(newText);
    }
    public String getTileValue() {
        return tileLabel.getText();
    }

    public void updateColor(String newText) {
        ImageIcon newIcon = new ImageIcon("src/main/resources/azul/" + newText);
        setIcon(newIcon);
    }

}
