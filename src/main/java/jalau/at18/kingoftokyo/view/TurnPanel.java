package jalau.at18.kingoftokyo.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import jalau.at18.kingoftokyo.controller.EndTurnButtonController;
import jalau.at18.kingoftokyo.model.Turn;
import java.awt.BorderLayout;
import java.awt.Font;

public class TurnPanel extends JPanel {
    private static final int POS_X = 310;
    private static final int POS_Y = 600;
    private static final int WIDTH = 1000;
    private static final int HEIGHT = 40;
    private static final int FONT_STYLE = 1;
    private static final int FONT_SIZE = 24;

    private JLabel turnOfLabel;
    private JButton endTurnButton;
    private Turn turn;

    public TurnPanel(Turn turn) {
        this.turn = turn;
        setLayout(new BorderLayout());
        setBounds(POS_X, POS_Y, WIDTH, HEIGHT);
        turnOfLabel = new JLabel("Turn of: ");
        turnOfLabel.setFont(new Font("Arial", FONT_STYLE, FONT_SIZE));
        setPlayerWithTurnLabel();
        add(turnOfLabel, BorderLayout.LINE_START);
        endTurnButton = new JButton("End Turn");
        add(endTurnButton, BorderLayout.LINE_END);
        endTurnButton.addActionListener(new EndTurnButtonController(turn, this));
    }

    public void setPlayerWithTurnLabel() {
        turnOfLabel.setText("Turn of: " + turn.getPlayerWithTheTurn().getMonster().getName());
    }
}
