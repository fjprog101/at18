package jalau.at18.kingoftokyo.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import jalau.at18.kingoftokyo.CompleteCard;
import jalau.at18.kingoftokyo.view.card.CardNameLabel;
import jalau.at18.kingoftokyo.view.card.CardPanel;
import jalau.at18.kingoftokyo.view.card.CardsGroupPanel;

public class BuyCardButtomController implements ActionListener {
    private CardPanel card;

    public BuyCardButtomController(CardPanel card) {
        this.card = card;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JLabel label = new JLabel("Do you want to buy: " + ((CardNameLabel) card.getComponent(1)).getText() + " Card");
        int result = JOptionPane.showConfirmDialog(null, label, "Buy Card",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
            ((CardsGroupPanel) card.getParent()).sendEffect(((CompleteCard) card.getCard()).getCard().getEffect());
            card.setCard(((CardsGroupPanel) card.getParent()).getDeck());
        }
    }
}