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

    //private Player2Panel player2Panel;
    private ShowResultsPanel showResultsPanel;

    private Player[] playerList;
    private WhoStartRollDiceController whoStartRollDiceController;

    //public WhoStartFrame(WhoStartController whoStartController) { //no sirve
    public WhoStartFrame(Player[] playerList) { //

        setResizable(false);
        setVisible(true);

        showResultsPanel = new ShowResultsPanel(playerList);

        player1Panel = new ShowDicesPanel(playerList[0]);
        whoStartRollDiceController = new WhoStartRollDiceController(player1Panel.getRolldiceSeccionUI(), showResultsPanel);

        initialize();
        // JButton calculateWinnerButton = new JButton("Calculate winner");
        // calculateWinnerButton.addActionListener(e -> whoStartController.clickCalculateWinnerButton());
        //add(calculateWinnerButton, BorderLayout.PAGE_START);
        //PanelSouth panelSouth = new PanelSouth(whoStartController); //?????????????
        //add(panelSouth, BorderLayout.SOUTH); //panel de respuesta sirve

        add(player1Panel, BorderLayout.WEST);
        add(showResultsPanel, BorderLayout.CENTER);
    }

    private void initialize() {
        setBounds(DEFAULT_POS, DEFAULT_POS, DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setTitle("King of Tokyo");
    }

    public ShowDicesPanel getPlayer1Panel() {
        return player1Panel;
    }
/*//no sirbe
    public ShowDicesPanel getPlayer2Panel() {
        return player2Panel;
    } */
}