package jalau.at18.kingoftokyo.controller;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

import jalau.at18.kingoftokyo.model.Player;
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
    public void showMessageToLose(Player player) {
        showMessageDialog(null, "Sorry " + player.getUserName() + ", your monster was defeated", "You Lose", JOptionPane.ERROR_MESSAGE);
    }
    public void showMessageToWin(Player player) {
        UIManager.put("OptionPane.messageForeground", Color.BLUE);
        showMessageDialog(null, "Congratulations " + player.getUserName() + ", you WIN!!!", "You Win", JOptionPane.DEFAULT_OPTION);
    }
    public boolean showMessageForLeaveTokyo(Player player) {
        JLabel label = new JLabel(player.getUserName() + " Your monster was injured, do you want to leave TokyoCity?");
        int result = JOptionPane.showConfirmDialog(null, label, "You were attacked",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        return result == JOptionPane.YES_OPTION;
    }
}
