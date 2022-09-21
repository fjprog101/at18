package jalau.at18.kingoftokyo.view;

import java.awt.Component;

import javax.swing.JFrame;

import jalau.at18.kingoftokyo.*;

public class GameFrame extends JFrame {
    private static final int DEFAULT_POS = 30;
    private static final int DEFAULT_WIDTH = 1200;
    private static final int DEFAULT_HEIGHT = 700;

    PlayerCard playerCard;

    public GameFrame() {
        playerCard = new PlayerCard();
        setResizable(false);
        initialize();

        add(new DeckImagePanel());
        add(new CardPanel(0, new CompleteCard(DiscardCards.ENERGIZE)));
        add(new CardPanel(1, new CompleteCard(DiscardCards.COMMUTER_TRAIN)));
        add(new CardPanel(2, new CompleteCard(DiscardCards.APARTMENT_BULIDING)));
    }

    private void initialize() {
        setBounds(DEFAULT_POS, DEFAULT_POS, DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        add(playerCard.playerOnePanel);
        add(playerCard.playerTwoPanel);

    }
}
