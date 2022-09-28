package jalau.at18.kingoftokyo.view.card;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

import jalau.at18.kingoftokyo.controller.BuyCardButtomController;
import jalau.at18.kingoftokyo.model.Card;
import jalau.at18.kingoftokyo.model.CompleteCard;

public class CardPanel extends JPanel {
    private static final int[] CARD_SIZE = {150, 250};
    private static final int[] COLOR = {2, 11, 43};
    private static final int EDGE_SPACE = 5;
    private static final int INDEX_DESCRIPTION = 4;

    private Card card;
    private BuyCardButtomController buyButtomController;

    public CardPanel(Card card) {
        this.card = card;
        setSize(CARD_SIZE[0], CARD_SIZE[1]);
        setBackground(new Color(COLOR[0], COLOR[1], COLOR[2]));
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        buyButtomController = new BuyCardButtomController(this);
        initComponents(card);
    }
    public void initComponents(Card newCard) {
        add(new CardCostLabel(newCard.getCost()));
        add(new CardNameLabel(newCard.getName()));
        add(new CardImageLabel(newCard.getImagePath()));
        add(new CardKindLabel());
        add(new CardDescriptionLabel(newCard.getDescription()));
        add(Box.createRigidArea(new Dimension(0, EDGE_SPACE)));
        add(new BuyCardButton(buyButtomController));
    }
    public void setCard(CompleteCard newCard) {
        this.card = newCard;
        ((CardCostLabel) getComponent(0)).setCost(newCard.getCost());
        ((CardNameLabel) getComponent(1)).setText(newCard.getName());
        ((CardImageLabel) getComponent(2)).setImage(newCard.getImagePath());
        ((CardDescriptionLabel) getComponent(INDEX_DESCRIPTION)).setDescription(newCard.getDescription());
    }
    public Card getCard() {
        return card;
    }
}
