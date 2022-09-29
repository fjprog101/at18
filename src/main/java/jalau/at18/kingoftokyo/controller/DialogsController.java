package jalau.at18.kingoftokyo.controller;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import jalau.at18.kingoftokyo.view.card.CardNameLabel;

public class DialogsController extends JOptionPane {
    public boolean confirmBuyDialogResult(CardNameLabel cardName) {
        boolean yesOption = false;
        JLabel label = new JLabel("Do you want to buy: " + cardName.getText() + " Card");
        if (showConfirmDialog(label) == YES_OPTION) {
            yesOption = true;
        }
        return yesOption;
    }
    public void showErrorMessage() {
        showMessageDialog(null, "Not enought Energy for buy the card",
                "Error", JOptionPane.WARNING_MESSAGE);
    }
    public int showConfirmDialog(JLabel message) {
        return showConfirmDialog(null, message, "Buy Card", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    }
}
