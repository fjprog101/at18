package jalau.at18.kingoftokyo.view;

import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class CardImageLabel extends JLabel {
    private static final int POS_X = 1;
    private static final int POS_Y = 120;
    private static final int WIDTH = 130;
    private static final int HEIGHT = 110;
    private static final String PATH = "src/main/resources/kingoftokyo/cards/";

    public CardImageLabel(String imagePath) {
        setBounds(POS_X, POS_Y, WIDTH, HEIGHT);
        ImageIcon image = new ImageIcon(PATH + imagePath);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(WIDTH, HEIGHT, Image.SCALE_DEFAULT));
        setIcon(icon);
        setVisible(true);
    }
}
