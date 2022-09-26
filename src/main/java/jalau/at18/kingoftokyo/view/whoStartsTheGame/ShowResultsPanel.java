package jalau.at18.kingoftokyo.view.whoStartsTheGame;

import javax.swing.*;
import javax.swing.border.LineBorder;

import jalau.at18.kingoftokyo.model.Player;
//import jalau.at18.kingoftokyo.controller.RollDiceSectionController;
//import jalau.at18.kingoftokyo.view.rolldicesection.RollDiceSectionUI;
import java.awt.*;

public class ShowResultsPanel extends JPanel  {
    //private RollDiceSectionController rollDiceSectionController;
    //private JLabel player2 = new JLabel("Player 2");

    private Player[] playerList;
    public ShowResultsPanel(Player[] playerList) {
        this.playerList = playerList;
        //add(player2);
        //RollDiceSectionUI rollDiceSectionUI = new RollDiceSectionUI();
        //add(rollDiceSectionUI);

        //rollDiceSectionController = new RollDiceSectionController(rollDiceSectionUI);

        PlayerTitleLabel playerLabel = new PlayerTitleLabel(); //title
        add(playerLabel);
        initPlayerLabel();
        setBorder(new LineBorder(Color.BLACK, 1));
    }

    public void initPlayerLabel() {
        for (int index = 0; index < playerList.length; index++) { //  Monster getMonster
            PlayerNameLabel playerNameLabel = new PlayerNameLabel(playerList[index].getMonster().getName());
            add(playerNameLabel);
        }
    }
}