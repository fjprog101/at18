package jalau.at18.azul.view;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import jalau.at18.azul.TileColor;
import java.awt.event.ActionListener;

public class TilesButton extends JButton {

    public static final int CENTER = 50;
    public static final int DEFAULT_POS1 = 400;
    private TileLabel tileLabel;
    private String newpath;
    private ImageIcon icon;

    public TilesButton(ActionListener listener) {
        tileLabel = new TileLabel();
        newpath = TileColor.EMPTY.getColorPath();
        icon = new ImageIcon("src/main/resources/Azul/" + newpath);
        setSize(DEFAULT_POS1, DEFAULT_POS1);
        setLocation(CENTER, CENTER);
        setBackground(Color.GRAY);
        add(tileLabel);
        addActionListener(listener);
        setIcon(icon);
    }

    public void updateLabel(String newText) {
        tileLabel.setText(newText);
    }

    public void updateColor(String newText) {
        ImageIcon newIcon = new ImageIcon("src/main/resources/Azul/" + newText);
        setIcon(newIcon);
    }

    public String getTileValue() {
        return tileLabel.getText();
    }
}
