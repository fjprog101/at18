package jalau.at18.architects.controller;
import jalau.at18.architects.model.BuildStage;
import jalau.at18.architects.view.BoardFrame;
import jalau.at18.architects.view.PlayerStatus;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WonderController implements ActionListener {
    private BoardFrame boardFrame;
    private BuildStage buildStage;
    private PlayerStatus player;
    public WonderController(BuildStage buildStage, PlayerStatus player) {
        //this.boardFrame = frame;
        this.buildStage = buildStage;
        this.player = player;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        buildStage.buildStage();
        player.addStage(buildStage.getStagesCompleted());
        //player.setName("Alvaro");
        //player.nextPLayer();
    }
}