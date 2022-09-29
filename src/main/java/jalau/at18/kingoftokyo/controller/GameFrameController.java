package jalau.at18.kingoftokyo.controller;

import jalau.at18.kingoftokyo.model.Player;

public class GameFrameController {
    private Player player1;
    private Player player2;

    public GameFrameController(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        //this.gameFrame = new GameFrame(player1, player2);
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }
}
