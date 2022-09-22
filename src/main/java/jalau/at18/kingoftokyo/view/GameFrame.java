package jalau.at18.kingoftokyo.view;

import javax.swing.JFrame;
import jalau.at18.kingoftokyo.controller.GameFrameController;
import jalau.at18.kingoftokyo.view.card.CardPanel;
import jalau.at18.kingoftokyo.*;

import jalau.at18.kingoftokyo.view.card.CardsGroupPanel;

public class GameFrame extends JFrame {
    private static final int DEFAULT_POS = 30;
    private static final int DEFAULT_WIDTH = 1200;
    private static final int DEFAULT_HEIGHT = 700;

    //Controller
    private GameFrameController gameFrameController;
    private Player player1 = new Player();
    private Player player2 = new Player();

    public GameFrame() {
        setResizable(false);
        add(new DiceSectionUI());
        gameFrameController = new GameFrameController(this);
        initialize();
        add(new DeckImagePanel());
        add(new PlayerCard(Monster.ALIENOID, 0, player1));
        add(new PlayerCard(Monster.SPACE_PENGUIN, 1, player2));
        add(new CardsGroupPanel());
    }

    private void initialize() {
        setBounds(DEFAULT_POS, DEFAULT_POS, DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
    }

}
