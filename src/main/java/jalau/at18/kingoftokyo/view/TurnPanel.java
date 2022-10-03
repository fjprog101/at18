package jalau.at18.kingoftokyo.view;

import javax.swing.*;
import jalau.at18.kingoftokyo.controller.EndTurnButtonController;
import jalau.at18.kingoftokyo.controller.RollDiceSectionController;
import jalau.at18.kingoftokyo.model.TokyoCity;
import jalau.at18.kingoftokyo.model.Turn;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;

public class TurnPanel extends JPanel {
    private static final int THREE = 3;
    private static final int RED = 176;
    private static final int GREEN = 82;
    private static final int BLUE = 122;
    private static final int RED_BUTTON = 249;
    private static final int GREEN_BUTTON = 156;
    private static final int BLUE_BUTTON = 0;
    private static final int POS_X = 330;
    private static final int POS_Y = 600;
    private static final int WIDTH = 980;
    private static final int HEIGHT = 40;
    private static final int FONT_STYLE = 1;
    private static final int FONT_SIZE = 24;

    private JLabel turnOfLabel;
    private JButton endTurnButton;
    private Turn turn;
    // private RollDiceSectionController rollDiceSectionController;
    private EndTurnButtonController endButtonController;

    public TurnPanel(Turn turn, TokyoCity tokyoCity) {
        this.turn = turn;
        setLayout(new BorderLayout());
        setBounds(POS_X, POS_Y, WIDTH, HEIGHT);
        turnOfLabel = new JLabel("Turn of: ");
        turnOfLabel.setFont(new Font("Arial", FONT_STYLE, FONT_SIZE));
        setPlayerWithTurnLabel();
        add(turnOfLabel, BorderLayout.LINE_START);
        endTurnButton = new JButton("End Turn");
        add(endTurnButton, BorderLayout.LINE_END);
        endButtonController = new EndTurnButtonController(turn, this, tokyoCity);
        endTurnButton.addActionListener(endButtonController);
        endTurnButton.setEnabled(false);
        float[] hsb = new float[THREE];
        hsb = Color.RGBtoHSB(RED, GREEN, BLUE, hsb);
        setBackground(Color.getHSBColor(hsb[0], hsb[1], hsb[2]));
        float[] hsbButton = new float[THREE];
        hsbButton = Color.RGBtoHSB(RED_BUTTON, GREEN_BUTTON, BLUE_BUTTON, hsbButton);
        endTurnButton.setBackground(Color.getHSBColor(hsbButton[0], hsbButton[1], hsbButton[2]));
    }

    public void setPlayerWithTurnLabel() {
        turnOfLabel.setText("Turn of: " + turn.getPlayerWithTheTurn().getMonster().getName());
    }

    public void addRollDiceController(RollDiceSectionController rollDiceSectionController) {
        // this.rollDiceSectionController = rollDiceSectionController;
        endButtonController.addRollDiceSectionController(rollDiceSectionController);
    }
}
