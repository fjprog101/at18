package jalau.at18.azul.view;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JToggleButton;

public class TileButton extends JButton {
    public static final int DEFAULT_SIZE = 50;
    public static final int DEFAULT_POS1  = 100;
    public TileButton(ActionListener listener) {
        setSize(DEFAULT_SIZE, DEFAULT_SIZE);
        setLocation(DEFAULT_POS1, DEFAULT_POS1);
        setBackground(Color.GRAY);
        addActionListener(listener);
    }
}
