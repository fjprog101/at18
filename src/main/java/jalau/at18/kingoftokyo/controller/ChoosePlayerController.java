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
    private Game game;

    public ChoosePlayerController(ChoosePlayersFrame choosePlayersFrame, PlayersNumbersSpinner spinner) {
        this.choosePlayersFrame = choosePlayersFrame;
        this.spinner = spinner;
        this.game = new Game();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        game.setPlayers((Integer) spinner.getValue());
        choosePlayersFrame.setVisible(false);
        new ChooseMonstersFrame(game);
    }
}
