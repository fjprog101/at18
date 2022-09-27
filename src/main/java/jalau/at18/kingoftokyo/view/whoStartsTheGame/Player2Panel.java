package jalau.at18.kingoftokyo.view.whoStartsTheGame;

import javax.swing.*;
import javax.swing.border.LineBorder;

import jalau.at18.kingoftokyo.controller.RollDiceSectionController;
import jalau.at18.kingoftokyo.model.Player;
import jalau.at18.kingoftokyo.view.rolldicesection.RollDiceSectionUI;
import java.awt.*;

public class Player2Panel extends JPanel  {
    private RollDiceSectionController rollDiceSectionController;
    private JLabel player2 = new JLabel("Player 2");
    public Player2Panel(Player player) {
        add(player2);
        RollDiceSectionUI rollDiceSectionUI = new RollDiceSectionUI();
        add(rollDiceSectionUI);
        //rollDiceSectionController = new RollDiceSectionController(rollDiceSectionUI);
        setBorder(new LineBorder(Color.BLACK, 1));
    }
}