package jalau.at18.kingoftokyo.controller;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import jalau.at18.kingoftokyo.view.card.CardNameLabel;

public class DialogsController {
    public int confirmBuyDialogResult(CardNameLabel cardName) {
        JLabel label = new JLabel("Do you want to buy: " + cardName.getText() + " Card");
        int result = JOptionPane.showConfirmDialog(null, label, "Buy Card",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        return result;
    }
    public void showErrorMessage() {
        JOptionPane.showMessageDialog(null, "Not enought Energy for buy the card",
                "Error", JOptionPane.WARNING_MESSAGE);
    }
}
