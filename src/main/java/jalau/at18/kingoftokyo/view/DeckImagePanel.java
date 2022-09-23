package jalau.at18.kingoftokyo.view;

import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DeckImagePanel extends JPanel {
    private static final int POS_X = 850;
    private static final int POS_Y = 20;
    private static final int WIDTH = 220;
    private static final int HEIGHT = 150;
    private static final String PATH = "src/main/resources/kingoftokyo/deck.PNG";

    public DeckImagePanel() {
        setBounds(POS_X, POS_Y, WIDTH, HEIGHT);
        JLabel deckImage = new JLabel();
        ImageIcon image = new ImageIcon(PATH);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(WIDTH, HEIGHT, Image.SCALE_DEFAULT));
        deckImage.setIcon(icon);
        add(deckImage);
        setVisible(true);
    }
}