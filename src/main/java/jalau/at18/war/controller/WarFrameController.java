package jalau.at18.war.controller;

import jalau.at18.war.model.Die;
import jalau.at18.war.model.Game;
import jalau.at18.war.view.WarFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class WarFrameController implements ActionListener {

    private WarFrame warFrame;
    private Game game;

    public WarFrameController(WarFrame frame, Game game) {
        this.warFrame = frame;
        this.game = game;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        List<Die> rolledDice = game.rollDice();
        warFrame.getDiceLabelGroup().updateDiceGroup(rolledDice);
    }
}
