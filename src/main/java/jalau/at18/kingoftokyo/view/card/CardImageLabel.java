package jalau.at18.kingoftokyo.view.card;

import java.awt.*;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class CardImageLabel extends JLabel {
    private static final int WIDTH = 145;
    private static final int HEIGHT = 130;
    private static final String PATH = "src/main/resources/kingoftokyo/cards/";

    public CardImageLabel(String imagePath) {
        setSize(WIDTH, HEIGHT);
        ImageIcon image = new ImageIcon(PATH + imagePath);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(WIDTH, HEIGHT, Image.SCALE_DEFAULT));
        setIcon(icon);
        setAlignmentX(Component.CENTER_ALIGNMENT);
        setVisible(true);
    }
}
