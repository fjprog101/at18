package jalau.at18.architects.view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import jalau.at18.architects.controller.CardController;

import java.awt.*;

public class MiddleDeck extends JPanel {
    public static final int POS_X = 400;
    public static final int POS_Y = 5;
    public static final int WIDTH = 120;
    public static final int HEIGHT = 170;
    public static final int SPACE_SIZE = 10;
    MiddleDeck() {
        initComponets();
        loadCards();
    }
    private void initComponets() {
        setOpaque(false);
        setBackground(Color.black);
        setLayout(new GridLayout(1, 1));
    }
    private void loadCards() {
        setBorder(new EmptyBorder(SPACE_SIZE, 0, SPACE_SIZE, SPACE_SIZE));
        setBounds(POS_X, POS_Y, WIDTH, HEIGHT);
        CardLabel mazo = new CardLabel();
        CardController deckController = new CardController(mazo);
        add(mazo);
        mazo.addMouseListener(deckController);
        setVisible(true);
    }
}