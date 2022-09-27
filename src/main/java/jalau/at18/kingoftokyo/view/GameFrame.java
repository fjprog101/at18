package jalau.at18.kingoftokyo.view;

import javax.swing.*;

import jalau.at18.kingoftokyo.controller.PlayerStatusController;
import jalau.at18.kingoftokyo.model.Monster;
import jalau.at18.kingoftokyo.model.Turn;
import jalau.at18.kingoftokyo.*;
import jalau.at18.kingoftokyo.view.board.BoardPanel;
import jalau.at18.kingoftokyo.view.card.CardsGroupPanel;
import jalau.at18.kingoftokyo.view.playercards.PlayerCardsGroupPanel;
import jalau.at18.kingoftokyo.view.rolldicesection.DiceSectionUI;

public class GameFrame extends JFrame {
    private static final int DEFAULT_POS = 30;
    private static final int DEFAULT_WIDTH = 1500;
    private static final int DEFAULT_HEIGHT = 700;

    private Turn turn;
    private PlayerStatusController playerController;

    public GameFrame(Turn turn) {
        this.turn = turn;
        initialize();
        playerController = new PlayerStatusController(this);

        add(new PlayerCardsGroupPanel(turn.getPlayersList()));

        add(new DeckImagePanel());
        add(new DiceSectionUI());
        add(new CardsGroupPanel(playerController));
        add(new BoardPanel(Monster.ALIENOID));
        add(new TurnPanel(turn));
    }

    private void initialize() {
        setResizable(false);
        setBounds(DEFAULT_POS, DEFAULT_POS, DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
    }

    public Turn getTurns() {
        return turn;
    }

    public PlayerStatusController getPlayerController() {
        return playerController;
    }
}
