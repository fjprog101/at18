package jalau.at18.kingoftokyo.view;

import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

import jalau.at18.kingoftokyo.Card;

public class CardPanel extends JPanel {
    private static final int CARD_WIDTH = 150;
    private static final int CARD_HEIGHT = 210;
    private static final int CARD_POSY = 200;
    private static final int CARD_POSX = 700;
    private static final int CARDS_SEPARATOR = 10;
    private static final int COLOR_R = 2;
    private static final int COLOR_G = 11;
    private static final int COLOR_B = 43;

    public CardPanel(int cardNumber, Card card) {
        setBounds(CARD_POSX + (CARD_WIDTH + CARDS_SEPARATOR) * cardNumber, CARD_POSY, CARD_WIDTH, CARD_HEIGHT);
        setBackground(new Color(COLOR_R, COLOR_G, COLOR_B));
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        add(new CardCostLabel(card.getCost()));
        add(new CardNameLabel(card.getName()));
        add(new CardImageLabel(card.getImagePath()));
        add(new CardKindLabel());
        add(new CardDescriptionLabel(card.getDescription()));
    }
}
