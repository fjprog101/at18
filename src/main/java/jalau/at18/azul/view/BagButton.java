package jalau.at18.azul.view;


import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class BagButton extends JButton {
    public static final int DEFAULT_SIZE = 50;
    public static final int DEFAULT_POS1  = 500;
    public static final int DEFAULT_POS2  = 40;
    public BagButton(ActionListener listener) {
        setSize(DEFAULT_SIZE, DEFAULT_SIZE);
        setLocation(DEFAULT_POS1, DEFAULT_POS2);
        ImageIcon newIcon = new ImageIcon("src/main/resources/azul/Azulgamebutton.jpg");
        setIcon(newIcon);
        addActionListener(listener);
    }
}
