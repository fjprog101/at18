package jalau.at18.kingoftokyo.view.whoStartsTheGame;

import javax.swing.*;
import javax.swing.border.LineBorder;
import jalau.at18.kingoftokyo.controller.RollDiceSectionController;
import jalau.at18.kingoftokyo.view.RollDiceSectionUI;
import java.awt.*;

public class Player1Panel extends JPanel {
    private RollDiceSectionController rollDiceSectionController;
    private JLabel player1 = new JLabel("Player 1");
    public Player1Panel() {
        add(player1);
        RollDiceSectionUI rollDiceSectionUI = new RollDiceSectionUI();
        add(rollDiceSectionUI);
        rollDiceSectionController = new RollDiceSectionController(rollDiceSectionUI);
        setBorder(new LineBorder(Color.BLACK, 1));
    }
}