package jalau.at18.kingoftokyo.view.whoStartsTheGame;

import jalau.at18.kingoftokyo.controller.WhoStartRollDiceController;
import jalau.at18.kingoftokyo.model.Player;

import java.awt.BorderLayout;

import javax.swing.*;

public class WhoStartFrame extends JFrame {
    private static final int DEFAULT_POS = 30;
    private static final int DEFAULT_WIDTH = 1200;
    private static final int DEFAULT_HEIGHT = 700;
    private ShowDicesPanel player1Panel;
    private ShowResultsPanel showResultsPanel;

    private WhoStartRollDiceController whoStartRollDiceController;

    public WhoStartFrame(Player[] playerList) {

        setResizable(false);
        setVisible(true);

        showResultsPanel = new ShowResultsPanel(playerList);
        PanelSouth panelSouth = new PanelSouth(whoStartRollDiceController);
        add(panelSouth);

        player1Panel = new ShowDicesPanel(playerList[0]);
        initialize();

        whoStartRollDiceController = new WhoStartRollDiceController(this, player1Panel.getRolldiceSeccionUI(),
        showResultsPanel, panelSouth.getButton());
        add(player1Panel, BorderLayout.WEST);
        add(showResultsPanel);
        panelSouth.getButton().addActionListener(e -> whoStartRollDiceController.clickStartGameButton());
    }

    private void initialize() {
        setBounds(DEFAULT_POS, DEFAULT_POS, DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setTitle("King of Tokyo");
    }

    public ShowDicesPanel getPlayer1Panel() {
        return player1Panel;
    }
}