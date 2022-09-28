package jalau.at18.kingoftokyo.view.whostart;

import javax.swing.*;
import jalau.at18.kingoftokyo.model.Player;

public class ShowResultsPanel extends JPanel  {

    private static final int DEFAULT_LABEL_POSX = 650;
    private static final int DEFAULT_LABEL_POSY = 50;
    private static final int DEFAULT_LABEL_WIDTH = 300;
    private static final int DEFAULT_LABEL_HEIGHT = 200;
    private Player[] playerList;
    public ShowResultsPanel(Player[] playerList) {
        this.playerList = playerList;
        PlayerTitleLabel playerLabel = new PlayerTitleLabel();
        add(playerLabel);
        setBounds(DEFAULT_LABEL_POSX, DEFAULT_LABEL_POSY, DEFAULT_LABEL_WIDTH, DEFAULT_LABEL_HEIGHT);
        initPlayerLabel();
    }

    public void initPlayerLabel() {
        for (int index = 0; index < playerList.length; index++) {
            PlayerNameLabel playerNameLabel = new PlayerNameLabel(playerList[index].getMonster().getName());
            add(playerNameLabel);
        }
    }
    public void setTextComponent(int count, int cantPunching) {
        ((PlayerNameLabel) getComponent(count)).setPlayerName(cantPunching);
    }

    public PlayerNameLabel getPlayerNameLabel(int index) {
        return (PlayerNameLabel) getComponent(index);
    }
    public Player[] getArrayPlayer() {
        return playerList;
    }
}