package jalau.at18.kingoftokyo.view.whoStartsTheGame;

import javax.swing.*;
import javax.swing.border.LineBorder;

import jalau.at18.kingoftokyo.Player;
import jalau.at18.kingoftokyo.controller.RollDiceSectionController;
import jalau.at18.kingoftokyo.view.rolldicesection.RollDiceSectionUI;
import java.awt.*;

public class PlayerPanel extends JPanel {

    private RollDiceSectionController rollDiceSectionController;
    private JLabel playerLabel;

    public PlayerPanel(Player player) {
        playerLabel = new JLabel(player.getMonster().getName());
        add(playerLabel);

        RollDiceSectionUI rollDiceSectionUI = new RollDiceSectionUI();
        add(rollDiceSectionUI);
        rollDiceSectionController = new RollDiceSectionController(rollDiceSectionUI, null);

        setBorder(new LineBorder(Color.BLACK, 1));
    }

    public RollDiceSectionController getRollDiceSectionController() {
        return rollDiceSectionController;
    }
}