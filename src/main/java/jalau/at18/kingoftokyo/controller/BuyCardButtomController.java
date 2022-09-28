package jalau.at18.kingoftokyo.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import jalau.at18.kingoftokyo.model.CompleteCard;
import jalau.at18.kingoftokyo.model.DeckCards;
import jalau.at18.kingoftokyo.view.card.*;

public class BuyCardButtomController implements ActionListener {
    private CardPanel cardPanel;

    public BuyCardButtomController(CardPanel cardPanel) {
        this.cardPanel = cardPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JLabel label = new JLabel("Do you want to buy: " + ((CardNameLabel) cardPanel.getComponent(1)).getText() + " Card");
        int result = JOptionPane.showConfirmDialog(null, label, "Buy Card",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
            ((CardsGroupPanel) cardPanel.getParent()).sendEffect(((CompleteCard) cardPanel.getCard()).getCard().getEffect());
            DeckCards deck = ((CardsGroupPanel) cardPanel.getParent()).getDeck();
            CompleteCard card = (CompleteCard) deck.getRandomCard();
            deck.removeCard(card);
            cardPanel.setCard(card);
        }
    }
}