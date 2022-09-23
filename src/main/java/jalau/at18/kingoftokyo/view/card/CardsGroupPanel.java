package jalau.at18.kingoftokyo.view.card;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import java.awt.*;

import jalau.at18.kingoftokyo.CompleteCard;
import jalau.at18.kingoftokyo.DeckCards;
import jalau.at18.kingoftokyo.DiscardCards;

public class CardsGroupPanel extends JPanel {
    private static final int[] CARD_SIZE = {470, 220};
    private static final int[] CARD_POS = {700, 185};
    private static final int CARDS_SEPARATION = 10;
    private static final int THIRD_CARD = 4;
    private DeckCards deck;

    public CardsGroupPanel() {
        setBounds(CARD_POS[0], CARD_POS[1], CARD_SIZE[0], CARD_SIZE[1]);
        setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
        deck = new DeckCards();
        add(new CardPanel(new CompleteCard(DiscardCards.ENERGIZE)));
        add(Box.createRigidArea(new Dimension(CARDS_SEPARATION, 0)));
        add(new CardPanel(new CompleteCard(DiscardCards.ENERGIZE)));
        add(Box.createRigidArea(new Dimension(CARDS_SEPARATION, 0)));
        add(new CardPanel(new CompleteCard(DiscardCards.ENERGIZE)));
        initialCards();
    }
    public void initialCards() {
        CompleteCard card1 = (CompleteCard) deck.getRandomCard();
        ((CardPanel) getComponent(0)).setCard(card1);
        deck.removeCard(card1);
        CompleteCard card2 = (CompleteCard) deck.getRandomCard();
        ((CardPanel) getComponent(2)).setCard(card2);
        deck.removeCard(card2);
        CompleteCard card3 = (CompleteCard) deck.getRandomCard();
        ((CardPanel) getComponent(THIRD_CARD)).setCard(card3);
        deck.removeCard(card3);
    }
}
