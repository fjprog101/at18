package jalau.at18.kingoftokyo.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import jalau.at18.kingoftokyo.model.TokyoCity;
import jalau.at18.kingoftokyo.model.Turn;
import jalau.at18.kingoftokyo.view.TurnPanel;

public class EndTurnButtonController implements ActionListener {
    private Turn turn;
    private TurnPanel turnPanel;
    private RollDiceSectionController rollDiceSectionController;
    private TokyoCity tokyoCity;
    private boolean isFirstTurn;

    public EndTurnButtonController(Turn turn, TurnPanel turnPanel, TokyoCity tokyoCity) {
        this.turn = turn;
        this.tokyoCity = tokyoCity;
        this.turnPanel = turnPanel;
        isFirstTurn = true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (isFirstTurn) {
            tokyoCity.addMonster(turn.getPlayerWithTheTurn());
            isFirstTurn = false;
        }
        turn.changePlayerWithTheTurn();
        turnPanel.setPlayerWithTurnLabel();
        turnPanel.getComponent(1).setEnabled(false);
        rollDiceSectionController.resetUI();

    }

    public void addRollDiceSectionController(RollDiceSectionController newRollDiceSectionController) {
        this.rollDiceSectionController = newRollDiceSectionController;
    }
}
