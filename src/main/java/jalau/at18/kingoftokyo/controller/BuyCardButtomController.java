package jalau.at18.kingoftokyo.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

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
        JOptionPane.showMessageDialog(null, "Card bought: " + ((CardNameLabel) card.getComponent(1)).getText());
        card.setCard(((CardsGroupPanel) card.getParent()).getDeck());
    }

}
