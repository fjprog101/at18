package jalau.at18.kingoftokyo.view.card;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

import jalau.at18.kingoftokyo.Card;
import jalau.at18.kingoftokyo.CompleteCard;
import jalau.at18.kingoftokyo.DeckCards;
import jalau.at18.kingoftokyo.controller.BuyCardButtomController;

public class CardPanel extends JPanel {
    private static final int[] CARD_SIZE = {150, 280};
    private static final int[] COLOR = {2, 11, 43};
    private static final int EDGE_SPACE = 5;
    private static final int INDEX_DESCRIPTION = 4;

    private BuyCardButtomController buyButtomController;

    public CardPanel(Card card) {
        setSize(CARD_SIZE[0], CARD_SIZE[1]);
        setBackground(new Color(COLOR[0], COLOR[1], COLOR[2]));
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        buyButtomController = new BuyCardButtomController(this);
        initComponents(card);
    }
    public void initComponents(Card card) {
        add(new CardCostLabel(card.getCost()));
        add(new CardNameLabel(card.getName()));
        add(new CardImageLabel(card.getImagePath()));
        add(new CardKindLabel());
        add(new CardDescriptionLabel(card.getDescription()));
        add(Box.createRigidArea(new Dimension(0, EDGE_SPACE)));
        add(new BuyCardButton(buyButtomController));
    }
    public void setCard(DeckCards deck) {
        CompleteCard newCard = (CompleteCard) deck.getRandomCard();
        deck.removeCard(newCard);
        ((CardCostLabel) getComponent(0)).setCost(newCard.getCost());
        ((CardNameLabel) getComponent(1)).setText(newCard.getName());
        ((CardImageLabel) getComponent(2)).setImage(newCard.getImagePath());
        ((CardDescriptionLabel) getComponent(INDEX_DESCRIPTION)).setDescription(newCard.getDescription());
    }
}
