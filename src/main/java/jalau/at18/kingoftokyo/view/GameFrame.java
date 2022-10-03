package jalau.at18.kingoftokyo.view;

import javax.swing.*;
import java.awt.*;
import jalau.at18.kingoftokyo.controller.PlayerStatusController;
import jalau.at18.kingoftokyo.controller.WinOrLoseController;
import jalau.at18.kingoftokyo.model.*;
import jalau.at18.kingoftokyo.view.board.BoardPanel;
import jalau.at18.kingoftokyo.view.card.CardsGroupPanel;
import jalau.at18.kingoftokyo.view.playercard.PlayerCardsGroupPanel;
import jalau.at18.kingoftokyo.view.rolldicesection.DiceSectionUI;

public class GameFrame extends JFrame {
    private static final int THREE = 3;
    private static final int RED = 176;
    private static final int GREEN = 82;
    private static final int BLUE = 122;
    private static final int DEFAULT_POS = 30;
    private static final int DEFAULT_WIDTH = 1600;
    private static final int DEFAULT_HEIGHT = 700;

    private Turn turn;
    private PlayerStatusController playerController;
    private WinOrLoseController winOrLoseController;
    private TokyoCity tokyoCity;

    public GameFrame(Turn turn) {
        this.turn = turn;
        initialize();
        winOrLoseController = new WinOrLoseController(turn, this);
        tokyoCity = new TokyoCity();
        playerController = new PlayerStatusController(turn, tokyoCity);
        playerController.addObserver(winOrLoseController);
        add(new PlayerCardsGroupPanel(turn.getPlayersList()));
        add(new DeckImagePanel());
        TurnPanel turnPanel = new TurnPanel(turn, tokyoCity);
        DiceSectionUI diceSectionUI = new DiceSectionUI(turnPanel, playerController);
        add(diceSectionUI);
        add(new CardsGroupPanel(turn, playerController));
        add(new BoardPanel(tokyoCity));
        turnPanel.addRollDiceController(diceSectionUI.getController());
        add(turnPanel);
        float[] hsb = new float[THREE];
        hsb = Color.RGBtoHSB(RED, GREEN, BLUE, hsb);
        getContentPane().setBackground(Color.getHSBColor(hsb[0], hsb[1], hsb[2]));
    }

    private void initialize() {
        setResizable(false);
        setBounds(DEFAULT_POS, DEFAULT_POS, DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setTitle("King of Tokyo");
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
