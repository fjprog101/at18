package jalau.at18.kingoftokyo.controller;

import jalau.at18.kingoftokyo.model.Player;
import jalau.at18.kingoftokyo.view.whostart.WhoStartFrame;

public class WhoStartController {
    private WhoStartFrame whoStartFrame;
    private Player[] playerList;
    public WhoStartController(Player[] playerList) {
        this.playerList = playerList;
    }

    public void showFrame() {
        whoStartFrame.setVisible(true);
    }

}
