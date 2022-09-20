package jalau.at18.kingoftokyo.view;

import javax.swing.JFrame;

import jalau.at18.kingoftokyo.CompleteCard;
import jalau.at18.kingoftokyo.DiscardCards;

public class GameFrame extends JFrame {
    private static final int DEFAULT_POS = 30;
    private static final int DEFAULT_WIDTH = 1200;
    private static final int DEFAULT_HEIGHT = 700;
    public GameFrame() {
        setResizable(false);
        initialize();
        add(new CardPanel(0, new CompleteCard(DiscardCards.ENERGIZE)));
        add(new CardPanel(1, new CompleteCard(DiscardCards.COMMUTER_TRAIN)));
        add(new CardPanel(2, new CompleteCard(DiscardCards.NUCLEAR_POWER_PLANT)));
    }

    private void initialize() {
        setBounds(DEFAULT_POS, DEFAULT_POS, DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
    }
}