package jalau.at18.kingoftokyo.view;

import javax.swing.*;

import jalau.at18.kingoftokyo.controller.GameFrameController;
import jalau.at18.kingoftokyo.*;
import jalau.at18.kingoftokyo.view.board.BoardPanel;
import jalau.at18.kingoftokyo.view.card.CardsGroupPanel;
import jalau.at18.kingoftokyo.view.playercards.PlayerCard;
import jalau.at18.kingoftokyo.view.rolldicesection.DiceSectionUI;

public class GameFrame extends JFrame {
    private static final int DEFAULT_POS = 30;
    private static final int DEFAULT_WIDTH = 1500;
    private static final int DEFAULT_HEIGHT = 700;

    // Controller
    private GameFrameController gameFrameController;
    private JLabel labelDisplayWhoStart;
    private Turn turn;

    public GameFrame(Turn turn) {
        this.turn = turn;
        add(new DiceSectionUI());
        initialize();
        add(new DeckImagePanel());
        //add(new PlayerCard(Monster.ALIENOID, 0, player1));
        //add(new PlayerCard(Monster.SPACE_PENGUIN, 1, player2));

        //add(new PlayerCard(player1.getMonster(), 0, player1));
        //add(new PlayerCard(player2.getMonster(), 1, player2));
        /*String whoWon = displayPlayerWinner(player1, player2);
        add(new JLabel(whoWon));
        JOptionPane.showMessageDialog(this,
                whoWon,
                "Warning",
                JOptionPane.WARNING_MESSAGE);*/

        add(new CardsGroupPanel());
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

    public String displayPlayerWinner(Player playerr1, Player playerr2) {
        if (playerr1.isStart() && !playerr2.isStart()) {
            return "Player 1 Start";
        } else {
            return "Player 2 Start";
        }
    }
}
