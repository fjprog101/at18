package jalau.at18.kingoftokyo.view.card;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

import jalau.at18.kingoftokyo.Card;

public class CardPanel extends JPanel {
    private static final int CARD_WIDTH = 150;
    private static final int CARD_HEIGHT = 220;
    private static final int COLOR_R = 2;
    private static final int COLOR_G = 11;
    private static final int COLOR_B = 43;
    private static final int EDGE_SPACE = 5;

    public CardPanel(int cardNumber, Card card) {
        setSize(CARD_WIDTH, CARD_HEIGHT);
        setBackground(new Color(COLOR_R, COLOR_G, COLOR_B));
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        add(new CardCostLabel(card.getCost()));
        add(new CardNameLabel(card.getName()));
        add(new CardImageLabel(card.getImagePath()));
        add(new CardKindLabel());
        add(new CardDescriptionLabel(card.getDescription()));
        add(Box.createRigidArea(new Dimension(0, EDGE_SPACE)));
    }
}
