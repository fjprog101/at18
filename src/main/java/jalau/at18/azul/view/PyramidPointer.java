package jalau.at18.azul.view;


import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
public class PyramidPointer extends JButton {

    public static final int CENTER = 100;
    public static final int DEFAULT_POS1 = 400;

    public PyramidPointer(ActionListener listener) {
        setSize(DEFAULT_POS1, DEFAULT_POS1);
        setLocation(CENTER, CENTER);
        Icon icon = new ImageIcon("src/main/resources/azul/triangle.png");
        setIcon(icon);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);
        addActionListener(listener);
    }
}
