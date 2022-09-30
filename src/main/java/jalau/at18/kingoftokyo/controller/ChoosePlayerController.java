package jalau.at18.kingoftokyo.controller;

import jalau.at18.kingoftokyo.Game;
import jalau.at18.kingoftokyo.view.choosemonsters.ChooseMonstersFrame;
import jalau.at18.kingoftokyo.view.chooseplayer.ChoosePlayersFrame;
import jalau.at18.kingoftokyo.view.chooseplayer.PlayersNumbersSpinner;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChoosePlayerController implements ActionListener {
    private final ChoosePlayersFrame choosePlayersFrame;
    private final PlayersNumbersSpinner spinner;

    public ChoosePlayerController(ChoosePlayersFrame choosePlayersFrame, PlayersNumbersSpinner spinner) {
        this.choosePlayersFrame = choosePlayersFrame;
        this.spinner = spinner;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Game.getInstance().setPlayers((Integer) spinner.getValue());
        choosePlayersFrame.dispose();
        new ChooseMonstersFrame();
    }
}
