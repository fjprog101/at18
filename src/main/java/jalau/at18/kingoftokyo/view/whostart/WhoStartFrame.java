package jalau.at18.kingoftokyo.view.whostart;

import jalau.at18.kingoftokyo.model.Player;
import jalau.at18.kingoftokyo.view.general.FooterPanel;
import jalau.at18.kingoftokyo.view.general.HeaderPanel;

import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.*;

public class WhoStartFrame extends JFrame {

    private static final int DEFAULT_POS = 30;
    private static final int DEFAULT_WIDTH = 700;
    private static final int DEFAULT_HEIGHT = 600;
    private ShowDicesPanel player1Panel;

    public WhoStartFrame(ArrayList<Player> playerList) {
        HeaderPanel headerPanel = new HeaderPanel();
        CenterPanel centerPanel = new CenterPanel(this, playerList);
        FooterPanel footerPanel = new FooterPanel();
        initialize();
        add(headerPanel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);
        add(footerPanel, BorderLayout.SOUTH);
    }

    private void initialize() {
        setBounds(DEFAULT_POS, DEFAULT_POS, DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setTitle("King of Tokyo");
        setVisible(true);
    }

    public ShowDicesPanel getPlayer1Panel() {
        return player1Panel;
    }
}