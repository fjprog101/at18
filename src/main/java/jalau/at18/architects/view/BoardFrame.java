package jalau.at18.architects.view;

import java.awt.*;
import javax.swing.JFrame;

import jalau.at18.architects.controller.BarConflictController;
import jalau.at18.architects.controller.WonderController;
import jalau.at18.architects.model.BuildStage;

public class BoardFrame extends JFrame {
    public static final int WIDTH = 1000;
    public static final int HEIGHT = 600;
    public static final String WINDOW_NAME = "7 Wonders Architect";
    public static final int COLOR1 = 255;
    public static final int COLOR2 = 245;
    public static final int COLOR3 = 230;
    private String numbersOfPlayers;
    private MiddleDeck middleDeck;
    private CheckTheConflictTokens checkTheConflictTokens;
    private BarConflictController barConflictController;
    private WonderController wonderController;
    private WonderStructure wonderStructure;
    private AddStageButton addStage;
    //private BuildStage buildStage;
    public BoardFrame(String numberOfPlayers) {
        barConflictController = new BarConflictController(this);
        wonderController = new WonderController(this, new BuildStage());
        this.numbersOfPlayers = numberOfPlayers;
        initialize();
    }

    private void initialize() {
        middleDeck = new MiddleDeck();
        checkTheConflictTokens = new CheckTheConflictTokens(barConflictController);
        wonderStructure = new WonderStructure();
        addStage = new AddStageButton(wonderController);
        add(addStage);
        add(middleDeck);
        add(checkTheConflictTokens);
        add(wonderStructure);
        setTitle(WINDOW_NAME);
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(COLOR1, COLOR2, COLOR3));
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);
    }

    public int getNumberOfPlayers() {
        int players = Integer.valueOf(numbersOfPlayers);
        return players;
    }
    public void addStage(int stagesCompleted) {
        wonderStructure.buildStages(stagesCompleted);
        this.validate();
    }
}
