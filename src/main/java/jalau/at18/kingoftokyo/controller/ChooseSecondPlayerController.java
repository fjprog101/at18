package jalau.at18.kingoftokyo.controller;

import jalau.at18.kingoftokyo.view.GameFrame;
import jalau.at18.kingoftokyo.view.choosesecondplayer.ChooseSecondPlayerFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChooseSecondPlayerController implements ActionListener {
    private ChooseSecondPlayerFrame chooseSecondPlayersFrame;

    public ChooseSecondPlayerController(ChooseSecondPlayerFrame chooseSecondPlayersFrame) {
        this.chooseSecondPlayersFrame = chooseSecondPlayersFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        chooseSecondPlayersFrame.setVisible(false);
        new GameFrame();
    }
}
