package jalau.at18.architects.controller;
import jalau.at18.architects.model.BuildStage;
import jalau.at18.architects.view.BoardFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WonderController implements ActionListener {
    private BoardFrame boardFrame;
    private BuildStage buildStage;
    public WonderController(BoardFrame frame, BuildStage buildStage) {
        this.boardFrame = frame;
        this.buildStage = buildStage;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        buildStage.buildStage();
        boardFrame.addStage(buildStage.getStagesCompleted());
    }
}