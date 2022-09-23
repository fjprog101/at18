package jalau.at18.kingoftokyo.view.whoStartsTheGame;
import javax.swing.*;
import javax.swing.border.LineBorder;

import jalau.at18.kingoftokyo.controller.RollDiceSectionController;
import jalau.at18.kingoftokyo.view.RollDiceSectionUI;

import java.awt.*;

public class Player2 extends JPanel  {
    private static final int DEFAULT_POSX = 600;
    private static final int DEFAULT_POSY = 450;
    private static final int DEFAULT_WIDTH = 1186;
    private static final int DEFAULT_HEIGHT = 300 - 1;
    private RollDiceSectionController rollDiceSectionController;
    public Player2() {
        RollDiceSectionUI rollDiceSectionUI = new RollDiceSectionUI();
        add(rollDiceSectionUI);
        rollDiceSectionController = new RollDiceSectionController(rollDiceSectionUI);
        //Position of this Panel DiceSectionUI
        setBounds(DEFAULT_POSX, DEFAULT_POSY, DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setBorder(new LineBorder(Color.BLACK, 1));
    }
}