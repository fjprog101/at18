package jalau.at18.kingoftokyo.controller;

import jalau.at18.kingoftokyo.model.Dice;
import jalau.at18.kingoftokyo.model.DiceFace;
import jalau.at18.kingoftokyo.model.DiceFaceIdentifier;
import jalau.at18.kingoftokyo.model.DiceFaceSameCounter;
import jalau.at18.kingoftokyo.model.DiceHand;
import jalau.at18.kingoftokyo.model.Monster;
import jalau.at18.kingoftokyo.model.Player;
import jalau.at18.kingoftokyo.model.Turn;
import jalau.at18.kingoftokyo.view.GameFrame;
import jalau.at18.kingoftokyo.view.whoStartsTheGame.WhoStartFrame;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class WhoStartController {
    private WhoStartFrame whoStartFrame;
    private Player player1;
    private Player player2;

    //Here we need to improve the Open/Close principle
    //Should be Arrive a list of players
    public WhoStartController(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.whoStartFrame = new WhoStartFrame(this);
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void showFrame() {
        whoStartFrame.setVisible(true);
    }

    //The button of PanelSouth
    public void clickStartGameButton() {
        whoStartFrame.setVisible(false);
        Player newPlayer1 = new Player();
        newPlayer1.addMonster(Monster.ALIENOID);
        Player newPlayer2 = new Player();
        newPlayer2.addMonster(Monster.SPACE_PENGUIN);
        Player newPlayer3 = new Player();
        newPlayer3.addMonster(Monster.CYBER_KITTY);
        Player[] playerList = {newPlayer2, newPlayer3, newPlayer1};
        //GameFrameController gameFrameController = new GameFrameController(player1, player2);
        new GameFrame(new Turn(playerList));
    }

    public void clickCalculateWinnerButton() {
        List<DiceFace> diceFacesPlayer1 = whoStartFrame.getPlayer1Panel().getWhoStartRollDiceController().getListRandomDiceFace();
        List<DiceFace> diceFacesPlayer2 = whoStartFrame.getPlayer2Panel().getWhoStartRollDiceController().getListRandomDiceFace();
        List<Dice> dicePlayer1 = new ArrayList<>();
        for (DiceFace diceFace : diceFacesPlayer1) {
            dicePlayer1.add(new Dice(diceFace));
        }

        List<Dice> dicePlayer2 = new ArrayList<>();
        for (DiceFace diceFace : diceFacesPlayer2) {
            dicePlayer2.add(new Dice(diceFace));
        }

        DiceHand diceHandPlayer1 = new DiceHand(dicePlayer1);
        DiceHand diceHandPlayer2 = new DiceHand(dicePlayer2);
        DiceFaceSameCounter diceFaceSameCounterPlayer1 = new DiceFaceSameCounter(diceHandPlayer1);
        DiceFaceSameCounter diceFaceSameCounterPlayer2 = new DiceFaceSameCounter(diceHandPlayer2);

        DiceFaceIdentifier diceFaceIdentifier1 = diceFaceSameCounterPlayer1.diceFaceCounter();
        DiceFaceIdentifier diceFaceIdentifier2 = diceFaceSameCounterPlayer2.diceFaceCounter();

        int countPounchingPlayer1 = diceFaceIdentifier1.getCountDiceFace(DiceFace.PUNCHING);
        int countPounchingPlayer2 = diceFaceIdentifier2.getCountDiceFace(DiceFace.PUNCHING);

        if (countPounchingPlayer1 > countPounchingPlayer2) {
            JOptionPane.showMessageDialog(whoStartFrame,
                    "Player 1 is the winner.",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE);
            //player1.setStart(true);
        } else if (countPounchingPlayer2 > countPounchingPlayer1) {
            JOptionPane.showMessageDialog(whoStartFrame,
                    "Player 2 is the winner.",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE);
            //player2.setStart(true);
        } else if (countPounchingPlayer2 == countPounchingPlayer1) {
            JOptionPane.showMessageDialog(whoStartFrame,
                    "Newly start the Roll Dice by Turn.",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE);
        }
    }
    /*@Override
    public void actionPerformed(ActionEvent e) {
        //whostartframe.setVisible(false);
    }*/
}
