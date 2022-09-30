package jalau.at18.kingoftokyo.view;

import javax.swing.*;
import jalau.at18.kingoftokyo.controller.PlayerStatusController;
import jalau.at18.kingoftokyo.controller.WinOrLoseController;
import jalau.at18.kingoftokyo.model.*;
import jalau.at18.kingoftokyo.view.board.BoardPanel;
import jalau.at18.kingoftokyo.view.card.CardsGroupPanel;
import jalau.at18.kingoftokyo.view.playercard.PlayerCardsGroupPanel;
import jalau.at18.kingoftokyo.view.rolldicesection.DiceSectionUI;

public class GameFrame extends JFrame {
    private static final int DEFAULT_POS = 30;
    private static final int DEFAULT_WIDTH = 1600;
    private static final int DEFAULT_HEIGHT = 700;

    private Turn turn;
    private PlayerStatusController playerController;
    private WinOrLoseController winOrLoseController;

    public GameFrame(Turn turn) {
        this.turn = turn;
        initialize();
        playerController = new PlayerStatusController(turn);
        winOrLoseController = new WinOrLoseController(turn, this);
        playerController.addObserver(winOrLoseController);

        add(new PlayerCardsGroupPanel(turn.getPlayersList()));
        add(new DeckImagePanel());
        TurnPanel turnPanel = new TurnPanel(turn);
        DiceSectionUI diceSectionUI = new DiceSectionUI(turnPanel, playerController);
        add(diceSectionUI);
        add(new CardsGroupPanel(turn, playerController));
        add(new BoardPanel());
        turnPanel.addRollDiceController(diceSectionUI.getController());
        add(turnPanel);
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
    public WinOrLoseController getWinLoseController() {
        return winOrLoseController;
    }
}
