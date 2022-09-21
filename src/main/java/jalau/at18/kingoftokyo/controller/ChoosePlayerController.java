package jalau.at18.kingoftokyo.controller;

import jalau.at18.kingoftokyo.view.choosefirstplayer.ChooseFirstPlayerFrame;
import jalau.at18.kingoftokyo.view.chooseplayer.ChoosePlayersFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChoosePlayerController implements ActionListener {
    private ChoosePlayersFrame choosePlayersFrame;

    public ChoosePlayerController(ChoosePlayersFrame choosePlayersFrame) {
        this.choosePlayersFrame = choosePlayersFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        choosePlayersFrame.setVisible(false);
        new ChooseFirstPlayerFrame();
    }
}
