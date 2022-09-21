package jalau.at18.kingoftokyo.view;

import java.awt.Color;
import javax.swing.JPanel;

public class PlayerCard {
    private final int DEFAULT_WIDTH = 200;
    private final int DEFAULT_HEIGHT = 80;
    private final int INIT_POSITION = 20;
    JPanel playerOnePanel;
    JPanel playerTwoPanel;

    public PlayerCard() {
        this.playerOnePanel = new JPanel();
        this.playerTwoPanel = new JPanel();
        panels();
    }

    public void panels() {
        this.playerOnePanel.setBackground(Color.RED);
        this.playerOnePanel.setBounds(INIT_POSITION, INIT_POSITION, DEFAULT_WIDTH, DEFAULT_HEIGHT);
        this.playerTwoPanel.setBackground(Color.BLUE);
        this.playerTwoPanel.setBounds(INIT_POSITION, playerOnePanel.getY() * 2 +
                playerOnePanel.getHeight(), DEFAULT_WIDTH,
                DEFAULT_HEIGHT);
    }
}
