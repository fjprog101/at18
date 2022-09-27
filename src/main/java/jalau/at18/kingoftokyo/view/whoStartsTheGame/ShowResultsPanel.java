package jalau.at18.kingoftokyo.view.whoStartsTheGame;

import javax.swing.*;

import jalau.at18.kingoftokyo.model.Player;
//import jalau.at18.kingoftokyo.controller.RollDiceSectionController;
//import jalau.at18.kingoftokyo.view.rolldicesection.RollDiceSectionUI;

public class ShowResultsPanel extends JPanel  {
    //private RollDiceSectionController rollDiceSectionController;
    //private JLabel player2 = new JLabel("Player 2");

    private static final int DEFAULT_LABEL_POSX = 650;
    private static final int DEFAULT_LABEL_POSY = 50;
    private static final int DEFAULT_LABEL_WIDTH = 300;
    private static final int DEFAULT_LABEL_HEIGHT = 200;

    private Player[] playerList;
    public ShowResultsPanel(Player[] playerList) {
        this.playerList = playerList;
        //add(player2);
        //RollDiceSectionUI rollDiceSectionUI = new RollDiceSectionUI();
        //add(rollDiceSectionUI);

        //rollDiceSectionController = new RollDiceSectionController(rollDiceSectionUI);





        PlayerTitleLabel playerLabel = new PlayerTitleLabel(); //title
        add(playerLabel);

        setBounds(DEFAULT_LABEL_POSX, DEFAULT_LABEL_POSY, DEFAULT_LABEL_WIDTH, DEFAULT_LABEL_HEIGHT);
        initPlayerLabel();

    }

    public void initPlayerLabel() {

        for (int index = 0; index < playerList.length; index++) { //  Monster getMonster
            PlayerNameLabel playerNameLabel = new PlayerNameLabel(playerList[index].getMonster().getName());
            add(playerNameLabel);
        }
    }
    public void setTextComponent(int count, int cantPunching) {
        ((PlayerNameLabel) getComponent(count)).setPlayerName(cantPunching);
    }

    public PlayerNameLabel getPlayerNameLabel(int index) { //for change values of amount
        return (PlayerNameLabel) getComponent(index);
    }
    public Player[] getArrayPlayer() {
        return playerList;
    }
}