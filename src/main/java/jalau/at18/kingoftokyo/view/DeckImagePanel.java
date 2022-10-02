package jalau.at18.kingoftokyo.view;

import java.awt.Image;
import java.awt.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DeckImagePanel extends JPanel {
    private static final int THREE = 3;
    private static final int RED = 176;
    private static final int GREEN = 82;
    private static final int BLUE = 122;
    private static final int POS_X = 1100;
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
        float[] hsb = new float[THREE];
        hsb = Color.RGBtoHSB(RED, GREEN, BLUE, hsb);
        setBackground(Color.getHSBColor(hsb[0], hsb[1], hsb[2]));
    }
}