package jalau.at18.architects.view;
import java.awt.*;
import javax.swing.*;
public class StagesWonder extends JLabel {
    public static final int WIDTH = 300;
    public static final int HEIGHT = 26;
    public StagesWonder(String direction) {
        ImageIcon image = new ImageIcon(direction);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(WIDTH, HEIGHT, Image.SCALE_DEFAULT));
        setIcon(icon);
    }
}
