package jalau.at18.kingoftokyo.controller;

import jalau.at18.kingoftokyo.view.GameFrame;
import jalau.at18.kingoftokyo.view.whoStartsTheGame.WhoStartFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameFrameController implements ActionListener {
    private GameFrame gameFrame;

    public GameFrameController(GameFrame gameFrame) {
        this.gameFrame = gameFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        gameFrame.setVisible(false);
        new WhoStartFrame();
    }
}
