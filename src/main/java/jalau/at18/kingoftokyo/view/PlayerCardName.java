package jalau.at18.kingoftokyo.view;

import java.awt.Component;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class PlayerCardName extends JLabel {
    public PlayerCardName(String name) {
        super(name, SwingConstants.LEFT);
        setBounds(0, 0, 10, 10);
        setFont(new Font("Arial Black", 1, 11));
        setAlignmentX(Component.LEFT_ALIGNMENT);
        setVisible(true);
    }
}
