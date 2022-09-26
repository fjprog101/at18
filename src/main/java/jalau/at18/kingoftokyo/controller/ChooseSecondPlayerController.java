package jalau.at18.kingoftokyo.controller;

import jalau.at18.kingoftokyo.Monster;
import jalau.at18.kingoftokyo.Player;
import jalau.at18.kingoftokyo.view.choosesecondplayer.ChooseSecondPlayerFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChooseSecondPlayerController implements ActionListener {
    private ChooseSecondPlayerFrame chooseSecondPlayersFrame;
    private WhoStartController whoStartController;
    // We need to implement the chain from where someone send us the Players.
    // for Open/close we need to receive a list<Player>
    private Player player1;
    private Player player2;

    public ChooseSecondPlayerController(ChooseSecondPlayerFrame chooseSecondPlayersFrame) {
        this.chooseSecondPlayersFrame = chooseSecondPlayersFrame;
        player1 = new Player();
        player2 = new Player();
        //Right Now the code is HardCode
        player1.addMonster(Monster.ALIENOID);
        player2.addMonster(Monster.SPACE_PENGUIN);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        chooseSecondPlayersFrame.setVisible(false);
        //Should send two players
        whoStartController = new WhoStartController(player1, player2);
        whoStartController.showFrame();
    }
}
