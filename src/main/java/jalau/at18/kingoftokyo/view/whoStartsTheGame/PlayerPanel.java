package jalau.at18.kingoftokyo.view.whoStartsTheGame;

import javax.swing.*;
import javax.swing.border.LineBorder;

import jalau.at18.kingoftokyo.Player;
import jalau.at18.kingoftokyo.controller.WhoStartRollDiceController;
import jalau.at18.kingoftokyo.view.rolldicesection.RollDiceSectionUI;

import java.awt.*;

public class PlayerPanel extends JPanel {

    private WhoStartRollDiceController whoStartRollDiceController;
    private JLabel playerLabel;

    public PlayerPanel(Player player) {
        playerLabel = new JLabel(player.getMonster().getName());
        add(playerLabel);

        RollDiceSectionUI rollDiceSectionUI = new RollDiceSectionUI();
        add(rollDiceSectionUI);
        whoStartRollDiceController = new WhoStartRollDiceController(rollDiceSectionUI);

        setBorder(new LineBorder(Color.BLACK, 1));
    }

    public WhoStartRollDiceController getWhoStartRollDiceController() {
        return whoStartRollDiceController;
    }
}