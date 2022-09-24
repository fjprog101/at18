package jalau.at18.architects.view;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class ConflictTokenLabel extends JLabel {
    public static final int DEFAULT_SIZE_2 = 50;
    public static final int DEFAULT_SIZE_1 = 50;
    public static final int SPACE_SIZE = 2;
    private String direction = "src/main/resources/architects/images/PeaceToken.png";

    public ConflictTokenLabel() {
        super("");
        setBorder(new EmptyBorder(0, SPACE_SIZE, 0, 0));
        setSize(DEFAULT_SIZE_1, DEFAULT_SIZE_2);
        ImageIcon image = new ImageIcon(direction);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(getWidth(), getHeight(), Image.SCALE_DEFAULT));
        setIcon(icon);
        setBackground(Color.CYAN);
    }

    public void setImage(String file) {
        setVisible(true);
        this.repaint();
    }
}
