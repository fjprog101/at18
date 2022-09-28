package jalau.at18.kingoftokyo.view.whoStartsTheGame;
//import jalau.at18.kingoftokyo.Player;
//import jalau.at18.kingoftokyo.controller.WhoStartController;
import jalau.at18.kingoftokyo.controller.WhoStartRollDiceController;

import javax.swing.*;

public class StartGameButton extends JButton {
    //public StartGameButton(WhoStartController whoStartController) {
    public StartGameButton(WhoStartRollDiceController whoStartRollDiceController) {

        super("Start Game");
        //addActionListener(e -> whoStartController.clickStartGameButton());
        addActionListener(e -> whoStartRollDiceController.clickStartGameButton());
        //setEnabled(false);
        //setVisible(true);
    }
}