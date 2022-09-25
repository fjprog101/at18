package jalau.at18.architects.view;

import java.awt.*;
import javax.swing.JFrame;

import jalau.at18.architects.controller.BarConflictController;
import jalau.at18.architects.controller.WonderController;

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

    public BoardFrame(String numberOfPlayers) {
        barConflictController = new BarConflictController(this);
        wonderController = new WonderController(this);
        this.numbersOfPlayers = numberOfPlayers;
        initialize();
    }

    private void initialize() {
        middleDeck = new MiddleDeck();
        checkTheConflictTokens = new CheckTheConflictTokens(barConflictController);
        wonderStructure = new WonderStructure();
        //wonderStructure.buildStages(3);
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
    public void addStage() {
        wonderStructure.addStage();
        this.validate();
    }
}
