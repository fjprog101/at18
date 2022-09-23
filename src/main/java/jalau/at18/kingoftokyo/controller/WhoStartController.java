package jalau.at18.kingoftokyo.controller;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import jalau.at18.kingoftokyo.view.GameFrame;
import jalau.at18.kingoftokyo.view.whoStartsTheGame.WhoStartFrame;

public class WhoStartController implements ActionListener {
    private WhoStartFrame whostartframe;

    public WhoStartController(WhoStartFrame whostartframe) {
        this.whostartframe = whostartframe;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        whostartframe.setVisible(false);
        new GameFrame();
    }
}
