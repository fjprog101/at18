package jalau.at18.kingoftokyo.controller;

import jalau.at18.kingoftokyo.model.Monster;
import jalau.at18.kingoftokyo.model.Player;
//import jalau.at18.kingoftokyo.view.choosesecondplayer.ChooseSecondPlayerFrame;
import jalau.at18.kingoftokyo.view.whoStartsTheGame.WhoStartFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/* 
public class ChooseSecondPlayerController implements ActionListener {
    private ChooseSecondPlayerController chooseSecondPlayersFrame;
    //private WhoStartController whoStartController;

    // We need to implement the chain from where someone send us the Players.
    // for Open/close we need to receive a list<Player>
    private Player player1;
    private Player player2;
    private Player player3;
    private WhoStartFrame whoStartFrame;
    public ChooseSecondPlayerController(ChooseSecondPlayerFrame chooseSecondPlayersFrame) {
        this.chooseSecondPlayersFrame = chooseSecondPlayersFrame;
        player1 = new Player();
        player2 = new Player();
        player3 = new Player();

        //Right Now the code is HardCode
        player1.addMonster(Monster.ALIENOID);
        player2.addMonster(Monster.SPACE_PENGUIN);
        player3.addMonster(Monster.CYBER_KITTY);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Player[] playerList = {player1, player2, player3};

        chooseSecondPlayersFrame.setVisible(false);
        //Should send two players

       // whoStartController = new WhoStartController(playerList);
        //whoStartController.showFrame();

        new WhoStartFrame(playerList);


    }
}*/
