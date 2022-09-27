package jalau.at18.kingoftokyo.view.whoStartsTheGame;

import javax.swing.*;
import javax.swing.border.LineBorder;

import jalau.at18.kingoftokyo.controller.WhoStartRollDiceController;
import jalau.at18.kingoftokyo.model.Player;
import jalau.at18.kingoftokyo.view.rolldicesection.RollDiceSectionUI;

import java.awt.*;

public class ShowDicesPanel extends JPanel { //player1

    private WhoStartRollDiceController whoStartRollDiceController;
    private JLabel playerLabel;
    private RollDiceSectionUI rollDiceSectionUI;


    public ShowDicesPanel(Player player) {
        playerLabel = new JLabel(player.getMonster().getName());
        add(playerLabel);

        rollDiceSectionUI = new RollDiceSectionUI();
        add(rollDiceSectionUI);

        //PlayerNameLabel playerNameLabel = new PlayerNameLabel(player.getMonster().getName());
        //add(playerNameLabel);
        //whoStartRollDiceController = new WhoStartRollDiceController(rollDiceSectionUI, playerNameLabel);

        setBorder(new LineBorder(Color.BLACK, 1));
    }

    public WhoStartRollDiceController getWhoStartRollDiceController() {
        return whoStartRollDiceController;
    }

    public RollDiceSectionUI getRolldiceSeccionUI() {
        return rollDiceSectionUI;
    }
}