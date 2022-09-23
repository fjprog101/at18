package jalau.at18.war.controller;

import jalau.at18.war.model.Die;
import jalau.at18.war.model.Game;
import jalau.at18.war.view.PlayerPanel;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class PlayerPanelController implements ActionListener {

    private Game game;
    private PlayerPanel playerPanel;

    public PlayerPanelController(Game game, PlayerPanel playerPanel) {
        this.game = game;
        this.playerPanel = playerPanel;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        List<Die> newValues = game.rollDice();
        playerPanel.getDiceLabelGroup().updateDiceGroup(newValues);
    }
}
