package jalau.at18.kingoftokyo.view.card;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import java.awt.*;

import jalau.at18.kingoftokyo.CompleteCard;
import jalau.at18.kingoftokyo.DeckCards;

public class CardsGroupPanel extends JPanel {
    private static final int[] CARD_SIZE = {470, 280};
    private static final int[] CARD_POS = {700, 185};
    private static final int CARDS_SEPARATION = 10;
    private static final int THIRD_CARD = 4;
    private DeckCards deck;

    public CardsGroupPanel() {
        setBounds(CARD_POS[0], CARD_POS[1], CARD_SIZE[0], CARD_SIZE[1]);
        setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
        deck = new DeckCards();
        initialCards();
    }
    public void initialCards() {
        CompleteCard card1 = (CompleteCard) deck.getRandomCard();
        add(new CardPanel(card1));
        deck.removeCard(card1);
        add(Box.createRigidArea(new Dimension(CARDS_SEPARATION, 0)));
        CompleteCard card2 = (CompleteCard) deck.getRandomCard();
        add(new CardPanel(card2));
        deck.removeCard(card2);
        add(Box.createRigidArea(new Dimension(CARDS_SEPARATION, 0)));
        CompleteCard card3 = (CompleteCard) deck.getRandomCard();
        add(new CardPanel(card3));
        deck.removeCard(card3);
    }
    public DeckCards getDeck() {
        return deck;
    }
}
