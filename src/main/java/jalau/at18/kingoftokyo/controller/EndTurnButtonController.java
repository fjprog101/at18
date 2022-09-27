package jalau.at18.kingoftokyo.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import jalau.at18.kingoftokyo.Turn;
import jalau.at18.kingoftokyo.view.TurnPanel;

public class EndTurnButtonController implements ActionListener {
    private Turn turn;
    private TurnPanel turnPanel;

    public EndTurnButtonController(Turn turn, TurnPanel turnPanel) {
        this.turn = turn;
        this.turnPanel = turnPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        turn.changePlayerWithTheTurn();
        turnPanel.setPlayerWithTurnLabel();
    }
}