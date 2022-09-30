package jalau.at18.kingoftokyo.view.choosemonsters;

import jalau.at18.kingoftokyo.controller.ChooseMonstersController;
import jalau.at18.kingoftokyo.view.general.ExitButton;
import jalau.at18.kingoftokyo.view.general.MonsterList;
import jalau.at18.kingoftokyo.view.general.UsernameTextBox;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ButtonsPanel extends JPanel {
    private static final int ONE_HUNDRED = 100;
    private static final int THREE = 3;
    private static final int RED = 176;
    private static final int GREEN = 82;
    private static final int BLUE = 122;

    public ButtonsPanel(ChooseMonstersFrame frame, ArrayList<UsernameTextBox> playersList, ArrayList<MonsterList> monstersList) {
        setLayout(new FlowLayout());
        ChooseMonstersController chooseMonstersController = new ChooseMonstersController(frame, playersList, monstersList);
        add(Box.createRigidArea(new Dimension(0, ONE_HUNDRED)));
        add(new ExitButton());
        add(Box.createRigidArea(new Dimension(ONE_HUNDRED, 0)));
        add(new StartGameButton(chooseMonstersController));
        add(Box.createRigidArea(new Dimension(0, ONE_HUNDRED)));
        float[] hsb = new float[THREE];
        hsb = Color.RGBtoHSB(RED, GREEN, BLUE, hsb);
        setBackground(Color.getHSBColor(hsb[0], hsb[1], hsb[2]));
    }
}
