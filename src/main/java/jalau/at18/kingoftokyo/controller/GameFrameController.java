package jalau.at18.kingoftokyo.controller;

import jalau.at18.kingoftokyo.model.Player;
import jalau.at18.kingoftokyo.view.GameFrame;

public class GameFrameController {
    private GameFrame gameFrame;
    private Player player1;
    private Player player2;

    public GameFrameController(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }
}
