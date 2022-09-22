package jalau.at18.kingoftokyo.view.card;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import java.awt.*;

import jalau.at18.kingoftokyo.CompleteCard;
import jalau.at18.kingoftokyo.DeckCards;
import jalau.at18.kingoftokyo.DiscardCards;
import jalau.at18.kingoftokyo.view.card.CardPanel;

public class CardsGroupPanel extends JPanel {
    private static final int CARD_WIDTH = 470;
    private static final int CARD_HEIGHT = 220;
    private static final int CARD_POSY = 185;
    private static final int CARD_POSX = 700;
    private static final int CARDS_SEPARATION = 10;
    private DeckCards deck;

    public CardsGroupPanel() {
        setBounds(CARD_POSX, CARD_POSY, CARD_WIDTH, CARD_HEIGHT);
        setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
        deck = new DeckCards();
        add(new CardPanel(deck.getRandomCard()));
        add(Box.createRigidArea(new Dimension(CARDS_SEPARATION, 0)));
        add(new CardPanel(deck.getRandomCard()));
        add(Box.createRigidArea(new Dimension(CARDS_SEPARATION, 0)));
        add(new CardPanel(deck.getRandomCard()));
    }
}
