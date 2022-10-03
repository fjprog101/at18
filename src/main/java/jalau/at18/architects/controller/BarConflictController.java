package jalau.at18.architects.controller;

import jalau.at18.architects.model.Game;
import jalau.at18.architects.view.BoardFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BarConflictController implements ActionListener {
    private BoardFrame boardFrame;
    private Game game;
    public BarConflictController(BoardFrame boardFrame, Game game) {
        this.boardFrame = boardFrame;
        this.game = game;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        boardFrame.addNextPlayer();
        boardFrame.repaint();
        boardFrame.revalidate();
    }
}
