package jalau.at18.architects.controller;

import jalau.at18.architects.model.RedCardForDeck;
import jalau.at18.architects.view.BarConflict;
import jalau.at18.architects.view.BoardFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BarConflictController implements ActionListener {
    private BoardFrame boardFrame;

    public BarConflictController(BoardFrame boardFrame) {
        this.boardFrame = boardFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        BarConflict barconflict = new BarConflict(boardFrame.getNumberOfPlayers());
        RedCardForDeck redCardForDeck = new RedCardForDeck(boardFrame.getNumberOfPlayers());
        barconflict.updateView(redCardForDeck);
        boardFrame.add(barconflict);
        boardFrame.validate();
    }
}
