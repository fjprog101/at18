package jalau.at18.architects.view;

import java.awt.*;

import javax.swing.*;

public class CardLabel extends JLabel {
    public static final int WIDTH = 130;
    public static final int HEIGHT = 180;

    private String direction = "src/main/resources/architects/cards/";

    CardLabel() {
        ImageIcon image = new ImageIcon(direction + "deck.png");
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(WIDTH, HEIGHT, WIDTH));
        setIcon(icon);
    }

    public void setImage(String file) {
        ImageIcon image = new ImageIcon(direction + file);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(getWidth(), getHeight(), Image.SCALE_DEFAULT));
        setIcon(icon);
        setVisible(true);
        this.validate();
    }
}