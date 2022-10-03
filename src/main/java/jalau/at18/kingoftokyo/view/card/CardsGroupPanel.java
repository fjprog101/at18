package jalau.at18.kingoftokyo.view.card;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import java.awt.*;

import jalau.at18.kingoftokyo.controller.PlayerStatusController;
import jalau.at18.kingoftokyo.model.CompleteCard;
import jalau.at18.kingoftokyo.model.DeckCards;
import jalau.at18.kingoftokyo.model.Turn;

public class CardsGroupPanel extends JPanel {
    private static final int THREE = 3;
    private static final int RED = 176;
    private static final int GREEN = 82;
    private static final int BLUE = 122;
    private static final int[] CARD_SIZE = {550, 250 };
    private static final int[] CARD_POS = {950, 185 };
    private static final int CARDS_SEPARATION = 10;
    private DeckCards deck;
    private Turn turn;
    private PlayerStatusController playerController;

    public CardsGroupPanel(Turn turn, PlayerStatusController playerController) {
        this.turn = turn;
        this.playerController = playerController;
        setBounds(CARD_POS[0], CARD_POS[1], CARD_SIZE[0], CARD_SIZE[1]);
        setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
        deck = new DeckCards();
        initialCards();
        float[] hsb = new float[THREE];
        hsb = Color.RGBtoHSB(RED, GREEN, BLUE, hsb);
        setBackground(Color.getHSBColor(hsb[0], hsb[1], hsb[2]));
    }

    public void initialCards() {
        CompleteCard card1 = (CompleteCard) deck.getRandomCard();
        add(new CardPanel(turn, card1));
        deck.removeCard(card1);
        add(Box.createRigidArea(new Dimension(CARDS_SEPARATION, 0)));
        CompleteCard card2 = (CompleteCard) deck.getRandomCard();
        add(new CardPanel(turn, card2));
        deck.removeCard(card2);
        add(Box.createRigidArea(new Dimension(CARDS_SEPARATION, 0)));
        CompleteCard card3 = (CompleteCard) deck.getRandomCard();
        add(new CardPanel(turn, card3));
        deck.removeCard(card3);
    }

    public DeckCards getDeck() {
        return deck;
    }

    public void sendEffect(int[] effect) {
        playerController.setPlayersStatus(effect);
    }
}
