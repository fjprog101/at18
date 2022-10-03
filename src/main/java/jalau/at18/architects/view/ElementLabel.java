package jalau.at18.architects.view;

import java.awt.*;

import javax.swing.*;

public class ElementLabel extends JLabel {
    public static final int DEFAULT_SIZE_2 = 50;
    public static final int DEFAULT_SIZE_1 = 50;

    private String direction = "src/main/resources/architects/icons/";

    public ElementLabel() {
        super("");
        setSize(DEFAULT_SIZE_1, DEFAULT_SIZE_2);
    }

    public void setImage(String file) {
        ImageIcon image = new ImageIcon(direction + file);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(getWidth(), getHeight(), Image.SCALE_DEFAULT));
        setIcon(icon);
        setVisible(true);
        this.validate();
    }
}
