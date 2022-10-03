package jalau.at18.architects.view;

import javax.swing.*;
import java.util.List;
import jalau.at18.architects.controller.BarConflictController;
import jalau.at18.architects.model.BuildStage;
import jalau.at18.architects.model.Game;
import jalau.at18.architects.model.player.Player;

public class BoardFrame extends JFrame {
    public static final int WIDTH = 840;
    public static final int HEIGHT = 780;
    public static final String WINDOW_NAME = "7 Wonders Architect";
    public static final int COLOR1 = 125;
    public static final int COLOR2 = 245;
    public static final int COLOR3 = 230;

    private Game game;
    private List<Player> players;
    private int numbersOfPlayers;
    private MiddleDeck middleDeck;
    private CheckTheConflictTokens checkTheConflictTokens;
    private BarConflictController barConflictController;
    private WonderStructure wonderStructure;
    private ResourcePanel resourcePanel = new ResourcePanel();
    private SciencePanel sciencePanel = new SciencePanel();
    private static boolean gameOver = false;

    private static final int DECK_POSITION_X = 360;
    private static final int DECK_POSITION_Y = 0;
    private static final int DECK_WIDTH = 140;
    private static final int DECK_HEIGHT = 200;

    private static final int POS_X_BAR_CONFLICT = 50;
    private static final int POS_Y_BAR_CONFLICT = 25;
    private static final int WIDTH_BAR_CONFLICT = 275;
    private static final int HEIGHT_Y_BAR_CONFLICT = 75;

    private static final int QUANTITY_ELEMENTS_ON_BOARD = 4;

    private PlayerStatus playerStatus1;
    private PlayerStatus playerStatus2;
    private PlayerStatus playerStatus3;
    private PlayerStatus playerStatus4;
    private Boolean initialConfiguration = true;

    private ResourcePanel resourcePanel1 = new ResourcePanel();
    private SciencePanel sciencePanel1 = new SciencePanel();
    private ResourcePanel resourcePanel2 = new ResourcePanel();
    private SciencePanel sciencePanel2 = new SciencePanel();
    private ResourcePanel resourcePanel3 = new ResourcePanel();
    private SciencePanel sciencePanel3 = new SciencePanel();
    private ResourcePanel resourcePanel4 = new ResourcePanel();
    private SciencePanel sciencePanel4 = new SciencePanel();

    private BuildStage buildStage1 = new BuildStage();
    private BuildStage buildStage2 = new BuildStage();
    private BuildStage buildStage3 = new BuildStage();
    public static BarConflict barconflict;
    private int numberPlayer;

    public BoardFrame(Game game) {
        System.out.println(game.getPlayers().size());
        setResizable(false);
        this.game = game;
        barConflictController = new BarConflictController(this, game);
        players = game.getPlayers();
        barconflict = new BarConflict(game.getPlayers().size());
        this.numbersOfPlayers = game.getPlayers().size();
        numberPlayer = 0;
        initialize();
    }

    private void initialize() {
        middleDeck = new MiddleDeck();
        setContentPane(new JLabel(new ImageIcon("src/main/resources/architects/images/backimage.jpg")));
        checkTheConflictTokens = new CheckTheConflictTokens(barConflictController);
        barconflict.setBounds(POS_X_BAR_CONFLICT, POS_Y_BAR_CONFLICT, WIDTH_BAR_CONFLICT, HEIGHT_Y_BAR_CONFLICT);
        add(barconflict);
        middleDeck.setBounds(DECK_POSITION_X, DECK_POSITION_Y, DECK_WIDTH, DECK_HEIGHT);
        add(middleDeck);
        add(checkTheConflictTokens);
        setTitle(WINDOW_NAME);
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);
    }

    public void addStage(int stagesCompleted) {
        wonderStructure.buildStages(stagesCompleted);
        this.validate();
    }

    public static void isCompleted(boolean stat) {
        gameOver = stat;
    }

    public void addNextPlayer() {
        if (gameOver) {
            this.dispose();
            new GameOver(this.game);
        }
        if (this.getContentPane().getComponentCount() == QUANTITY_ELEMENTS_ON_BOARD) {
            this.getContentPane().remove(QUANTITY_ELEMENTS_ON_BOARD - 1);
        }
        if (players.size() == 2) {
            twoPlayers();
        } else {
            threePlayers();
        }
    }

    public void twoPlayers() {
        if (numberPlayer == 0 && initialConfiguration) {
            System.out.println("Two Players Initial, First Player");
            playerStatus1 = new PlayerStatus(players.get(numberPlayer));
            playerStatus1.setPanels(resourcePanel1, sciencePanel1);
            playerStatus1.setStagesForWonders(buildStage1, resourcePanel1);
            numberPlayer++;
            add(playerStatus1);
            this.repaint();
            this.revalidate();
        } else if (numberPlayer == 0 && !initialConfiguration) {
            System.out.println("Two Players, First Player");
            numberPlayer++;
            playerStatus1.enableTakeACardButton();
            playerStatus1.enableAddStagesButton();
            add(playerStatus1);
            this.repaint();
            this.revalidate();
        } else if (numberPlayer == 1 && initialConfiguration) {
            System.out.println("Two Players Initial, Second Player");
            playerStatus2 = new PlayerStatus(players.get(numberPlayer));
            playerStatus2.setPanels(resourcePanel2, sciencePanel2);
            playerStatus2.setStagesForWonders(buildStage2, resourcePanel2);
            numberPlayer++;
            initialConfiguration = false;
            add(playerStatus2);
            this.repaint();
            this.revalidate();
            if (numberPlayer == players.size()) {
                numberPlayer = 0;
            }
        } else if (numberPlayer == 1 && !initialConfiguration) {
            System.out.println("Two Players, Second Player");
            numberPlayer++;
            playerStatus2.enableTakeACardButton();
            playerStatus2.enableAddStagesButton();
            add(playerStatus2);
            this.repaint();
            this.revalidate();
            if (numberPlayer == players.size()) {
                numberPlayer = 0;
            }
        } else {
            System.out.println("No players or a configuration");
        }
    }

    public void threePlayers() {
        if (numberPlayer == 0 && initialConfiguration) {
            playerStatus1 = new PlayerStatus(players.get(numberPlayer));
            playerStatus1.setPanels(resourcePanel1, sciencePanel1);
            playerStatus1.setStagesForWonders(buildStage1, resourcePanel1);
            numberPlayer++;
            add(playerStatus1);
            this.repaint();
            this.revalidate();
        } else if (numberPlayer == 0 && !initialConfiguration) {
            numberPlayer++;
            playerStatus1.enableTakeACardButton();
            playerStatus1.enableAddStagesButton();
            add(playerStatus1);
            this.repaint();
            this.revalidate();
        } else if (numberPlayer == 1 && initialConfiguration) {
            playerStatus2 = new PlayerStatus(players.get(numberPlayer));
            playerStatus2.setPanels(resourcePanel2, sciencePanel2);
            playerStatus2.setStagesForWonders(buildStage2, resourcePanel2);
            numberPlayer++;
            add(playerStatus2);
            this.repaint();
            this.revalidate();
        } else if (numberPlayer == 1 && !initialConfiguration) {
            numberPlayer++;
            playerStatus2.enableTakeACardButton();
            playerStatus2.enableAddStagesButton();
            add(playerStatus2);
            this.repaint();
            this.revalidate();
        } else if (numberPlayer == 2 && initialConfiguration) {
            playerStatus3 = new PlayerStatus(players.get(numberPlayer));
            playerStatus3.setPanels(resourcePanel3, sciencePanel3);
            playerStatus3.setStagesForWonders(buildStage3, resourcePanel3);
            numberPlayer++;
            initialConfiguration = false;
            add(playerStatus3);
            this.repaint();
            this.revalidate();
            if (numberPlayer == players.size()) {
                numberPlayer = 0;
            }
        } else if (numberPlayer == 2 && !initialConfiguration) {
            numberPlayer++;
            playerStatus3.enableTakeACardButton();
            playerStatus3.enableAddStagesButton();
            add(playerStatus3);
            this.repaint();
            this.revalidate();
            if (numberPlayer == players.size()) {
                numberPlayer = 0;
            }
        } else {
            System.out.println("No players or a configuration");
        }
    }
}
