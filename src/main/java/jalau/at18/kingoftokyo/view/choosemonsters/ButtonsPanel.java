package jalau.at18.kingoftokyo.view.choosemonsters;

import jalau.at18.kingoftokyo.Game;
import jalau.at18.kingoftokyo.controller.ChooseMonstersController;
import jalau.at18.kingoftokyo.view.general.ExitButton;
import jalau.at18.kingoftokyo.view.general.MonsterList;
import jalau.at18.kingoftokyo.view.general.UsernameTextBox;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ButtonsPanel extends JPanel {
    private static final int ONE_HUNDRED = 100;

    public ButtonsPanel(ChooseMonstersFrame frame, Game game, ArrayList<UsernameTextBox> playersList, ArrayList<MonsterList> monstersList) {
        setLayout(new FlowLayout());
        ChooseMonstersController chooseMonstersController = new ChooseMonstersController(frame, game, playersList, monstersList);
        add(Box.createRigidArea(new Dimension(0, ONE_HUNDRED)));
        add(new ExitButton());
        add(Box.createRigidArea(new Dimension(ONE_HUNDRED, 0)));
        add(new StartGameButton(chooseMonstersController));
        add(Box.createRigidArea(new Dimension(0, ONE_HUNDRED)));
        setBackground(Color.BLUE);
    }
}
