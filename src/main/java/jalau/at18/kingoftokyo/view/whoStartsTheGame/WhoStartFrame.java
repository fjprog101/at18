package jalau.at18.kingoftokyo.view.whoStartsTheGame;

import jalau.at18.kingoftokyo.controller.WhoStartController;

import java.awt.BorderLayout;

import javax.swing.*;

public class WhoStartFrame extends JFrame {
    private static final int DEFAULT_POS = 30;
    private static final int DEFAULT_WIDTH = 1200;
    private static final int DEFAULT_HEIGHT = 700;
    private PlayerPanel player1Panel;
    private PlayerPanel player2Panel;

    public WhoStartFrame(WhoStartController whoStartController) {
        PanelSouth panelSouth = new PanelSouth(whoStartController);
        setResizable(false);

        ShowResultsLabel whoStartLabel = new ShowResultsLabel();
        initialize();
        JButton calculateWinnerButton = new JButton("Calculate winner");
        calculateWinnerButton.addActionListener(e -> whoStartController.clickCalculateWinnerButton());
        add(calculateWinnerButton, BorderLayout.PAGE_START);
        add(whoStartLabel, BorderLayout.CENTER);
        add(panelSouth, BorderLayout.SOUTH);

        player1Panel = new PlayerPanel(whoStartController.getPlayer1());
        player2Panel = new PlayerPanel(whoStartController.getPlayer2());
        add(player1Panel, BorderLayout.WEST);
        add(player2Panel, BorderLayout.EAST);
    }

    private void initialize() {
        setBounds(DEFAULT_POS, DEFAULT_POS, DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setTitle("King of Tokyo");
    }

    public PlayerPanel getPlayer1Panel() {
        return player1Panel;
    }

    public PlayerPanel getPlayer2Panel() {
        return player2Panel;
    }
}