package jalau.at18.kingoftokyo.view.whostart;

import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;

import jalau.at18.kingoftokyo.controller.WhoStartRollDiceController;
import jalau.at18.kingoftokyo.model.Player;

public class CenterPanel extends JPanel {
    private static final int SIZE_FONT = 25;
    private static final int THREE = 3;
    private static final int RED = 176;
    private static final int GREEN = 82;
    private static final int BLUE = 122;
    private static final int EDGE_SPACE = 15;

    private WhoStartRollDiceController whoStartRollDiceController;

    public CenterPanel(WhoStartFrame whoStartFrame, ArrayList<Player> playerList) {
        ShowResultsPanel showResultsPanel = new ShowResultsPanel(playerList);
        ShowDicesPanel player1Panel = new ShowDicesPanel();
        PanelSouth panelSouth = new PanelSouth(whoStartRollDiceController);
        JLabel titleLabel = new JLabel("Roll the dice for know the players order.");
        titleLabel.setFont(new Font("Times New Roman", Font.BOLD, SIZE_FONT));
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        add(Box.createRigidArea(new Dimension(0, EDGE_SPACE)));
        add(titleLabel);
        add(Box.createRigidArea(new Dimension(0, EDGE_SPACE)));
        add(player1Panel);
        add(Box.createRigidArea(new Dimension(0, EDGE_SPACE)));
        add(showResultsPanel);
        add(Box.createRigidArea(new Dimension(0, EDGE_SPACE)));
        add(panelSouth);
        whoStartRollDiceController = new WhoStartRollDiceController(whoStartFrame, player1Panel.getRolldiceSeccionUI(),
                    showResultsPanel, panelSouth.getButton());
        panelSouth.getButton().addActionListener(e -> whoStartRollDiceController.clickStartGameButton());
        float[] hsb = new float[THREE];
        hsb = Color.RGBtoHSB(RED, GREEN, BLUE, hsb);
        setBackground(Color.getHSBColor(hsb[0], hsb[1], hsb[2]));
    }

}
