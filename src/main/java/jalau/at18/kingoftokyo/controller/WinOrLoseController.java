package jalau.at18.kingoftokyo.controller;

import jalau.at18.kingoftokyo.model.Observer;
import jalau.at18.kingoftokyo.model.Player;
import jalau.at18.kingoftokyo.model.Turn;

public class WinOrLoseController implements Observer {
    private static final int WIN_POINTS = 20;
    private Turn turn;
    private DialogsController dialog;

    public WinOrLoseController(Turn turn) {
        this.turn = turn;
        dialog = new DialogsController();
    }

    @Override
    public void update() {
        for (Player player : turn.getPlayersList()) {
            if (player.getLifePoints() == 0) {
                playerLose(player);
                turn.removePlayer(player);
            } else if (player.getLifePoints() == WIN_POINTS) {
                playerWin(player);
                break;
            }
        }
    }

    public void playerWin(Player player) {
    }

    public void playerLose(Player player) {
        dialog.showMessageToLose(player);
    }
}
