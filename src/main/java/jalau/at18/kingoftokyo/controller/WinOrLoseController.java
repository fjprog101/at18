package jalau.at18.kingoftokyo.controller;

import jalau.at18.kingoftokyo.model.Observer;
import jalau.at18.kingoftokyo.model.Player;
import jalau.at18.kingoftokyo.model.Turn;
import jalau.at18.kingoftokyo.view.GameFrame;
import jalau.at18.kingoftokyo.view.gameover.GameOverFrame;

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
        if (turn.getPlayersList().size() != 1) {
            verifyPlayers();
        } else {
            playerWin(turn.getPlayersList().get(0));
        }
    }

    public void verifyPlayers() {
        for (Player player : turn.getPlayersList()) {
            if (player.getLifePoints() == 0) {
                playerLose(player);
                update();
            } else if (player.getVictoryPoints() == WIN_POINTS) {
                playerWin(player);
                break;
            }
        }
    }

    public void playerWin(Player player) {
        dialog.showMessageToWin(player);
        gameFrame.dispose();
        new GameOverFrame();
    }

    public void playerLose(Player player) {
        turn.removePlayer(player);
        dialog.showMessageToLose(player);
    }
}
