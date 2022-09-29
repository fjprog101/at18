package jalau.at18.kingoftokyo.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import jalau.at18.kingoftokyo.model.Turn;
import jalau.at18.kingoftokyo.view.TurnPanel;

public class EndTurnButtonController implements ActionListener {
    private Turn turn;
    private TurnPanel turnPanel;
    private RollDiceSectionController rollDiceSectionController;

    public EndTurnButtonController(Turn turn, TurnPanel turnPanel) {
        this.turn = turn;
        this.turnPanel = turnPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        turn.changePlayerWithTheTurn();
        turnPanel.setPlayerWithTurnLabel();
        turnPanel.getComponent(1).setEnabled(false);
        rollDiceSectionController.resetUI();
    }

    public void addRollDiceSectionController(RollDiceSectionController rollDiceSectionController) {
        this.rollDiceSectionController = rollDiceSectionController;
    }
}
