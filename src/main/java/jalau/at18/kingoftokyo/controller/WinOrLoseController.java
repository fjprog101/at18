package jalau.at18.kingoftokyo.controller;

import jalau.at18.kingoftokyo.model.Observer;
import jalau.at18.kingoftokyo.model.Player;
import jalau.at18.kingoftokyo.model.Turn;
import jalau.at18.kingoftokyo.view.GameFrame;
import jalau.at18.kingoftokyo.view.GameOverFrame;

public class WinOrLoseController implements Observer {
    private static final int WIN_POINTS = 20;
    private Turn turn;
    private DialogsController dialog;
    private GameFrame gameFrame;

    public WinOrLoseController(Turn turn, GameFrame gameFrame) {
        this.turn = turn;
        this.gameFrame = gameFrame;
        dialog = new DialogsController();
    }

    @Override
    public void update() {
        for (Player player : turn.getPlayersList()) {
            if (player.getLifePoints() == 0) {
                playerLose(player);
            } else if (player.getVictoryPoints() == WIN_POINTS) {
                playerWin(player);
                break;
            }
        }
    }

    public void playerWin(Player player) {
        dialog.showMessageToWin(player);
        new GameOverFrame();
        gameFrame.dispose();
    }

    public void playerLose(Player player) {
        dialog.showMessageToLose(player);
        turn.removePlayer(player);
    }
}
