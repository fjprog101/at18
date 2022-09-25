package jalau.at18.kingoftokyo.view.whoStartsTheGame;
import jalau.at18.kingoftokyo.controller.WhoStartController;

import javax.swing.*;

public class StartGameButton extends JButton {
    public StartGameButton(WhoStartController whoStartController) {
        super("Start Game");
        addActionListener(e -> whoStartController.clickStartGameButton());
    }
}