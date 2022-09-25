package jalau.at18.architects.controller;
import jalau.at18.architects.view.BoardFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WonderController implements ActionListener {
    private BoardFrame boardFrame;
    public WonderController(BoardFrame frame) {
        this.boardFrame = frame;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        boardFrame.addStage();
    }
}