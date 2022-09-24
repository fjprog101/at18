package jalau.at18.architects.view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class MiddleDeck extends JPanel {
    public static final int POS_X = 400;
    public static final int POS_Y = 5;
    public static final int WIDTH = 225;
    public static final int HEIGHT = 170;
    public static final int SPACE_SIZE = 10;
    MiddleDeck() {
        initComponets();
        loadCards();
        setBackground(Color.black);
    }
    private void initComponets() {
        setLayout(new GridLayout(1, 2));
    }
    private void loadCards() {
        setBorder(new EmptyBorder(SPACE_SIZE, 0, SPACE_SIZE, SPACE_SIZE));
        setBounds(POS_X, POS_Y, WIDTH, HEIGHT);
        JLabel mazo = new CardLabel();
        //mazo.addMouseListener();
        JLabel mazo2 = new CardLabel();
        add(mazo);
        add(mazo2);
        setVisible(true);
    }
}