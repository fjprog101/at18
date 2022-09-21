package jalau.at18.kingoftokyo.controller;

import jalau.at18.kingoftokyo.view.choosefirstplayer.ChooseFirstPlayerFrame;
import jalau.at18.kingoftokyo.view.choosesecondplayer.ChooseSecondPlayerFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChooseFirstPlayerController implements ActionListener {
    private ChooseFirstPlayerFrame chooseFirstPlayersFrame;

    public ChooseFirstPlayerController(ChooseFirstPlayerFrame chooseFirstPlayersFrame) {
        this.chooseFirstPlayersFrame = chooseFirstPlayersFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        chooseFirstPlayersFrame.setVisible(false);
        new ChooseSecondPlayerFrame();
    }
}
