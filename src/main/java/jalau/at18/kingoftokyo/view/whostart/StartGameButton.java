package jalau.at18.kingoftokyo.view.whostart;

import jalau.at18.kingoftokyo.controller.WhoStartRollDiceController;

import javax.swing.*;

public class StartGameButton extends JButton {

    public StartGameButton(WhoStartRollDiceController whoStartRollDiceController) {
        super("Start Game");
        setEnabled(false);
    }
}