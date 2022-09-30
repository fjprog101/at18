package jalau.at18.architects.view;

import java.awt.*;
import javax.swing.*;

import jalau.at18.architects.controller.BarConflictController;
import jalau.at18.architects.controller.WonderController;
import jalau.at18.architects.model.BuildStage;

public class BoardFrame extends JFrame {
    public static final int WIDTH = 840;
    public static final int HEIGHT = 780;
    public static final String WINDOW_NAME = "7 Wonders Architect";
    public static final int COLOR1 = 125;
    public static final int COLOR2 = 245;
    public static final int COLOR3 = 230;
    private String numbersOfPlayers;
    private MiddleDeck middleDeck;
    private CheckTheConflictTokens checkTheConflictTokens;
    private BarConflictController barConflictController;
    private WonderController wonderController;
    private WarWinnerPointsView warWinnerPointsView;
    private BluePointsView bluePointsView;
    private WonderStructure wonderStructure;
    private AddStageButton addStage;
    //private BuildStage buildStage;
    public BoardFrame(String numberOfPlayers) {
        setResizable(false);
        barConflictController = new BarConflictController(this);
        wonderController = new WonderController(this, new BuildStage());
        this.numbersOfPlayers = numberOfPlayers;
        initialize();
    }

    private void initialize() {
        middleDeck = new MiddleDeck();
        MiddleDeck middleDeck1 = new MiddleDeck();
        MiddleDeck middleDeck2 = new MiddleDeck();
        BluePointsView bluePointsView1 = new BluePointsView();
        
        setContentPane(new JLabel(new ImageIcon("src/main/resources/architects/images/backimage.jpg")));
        
        checkTheConflictTokens = new CheckTheConflictTokens(barConflictController);
        
        wonderStructure = new WonderStructure();
        addStage = new AddStageButton(wonderController);

        warWinnerPointsView = new WarWinnerPointsView();
        WarWinnerPointsView warWinnerPointsView1 = new WarWinnerPointsView();
        bluePointsView = new BluePointsView();

        add(addStage);//button
        middleDeck.setBounds(360, 0, 140, 200);
        add(middleDeck);
        middleDeck1.setBounds(60, 250, 140, 200);
        add(middleDeck1);
        middleDeck2.setBounds(660, 250, 140, 200);
        add(middleDeck2);

        checkTheConflictTokens.setBounds(60, 80, 180, 60);
        add(checkTheConflictTokens);

        wonderStructure.setBounds(270, 240, 300, 240);
        add(wonderStructure);

        warWinnerPointsView.setBounds(600, 600, 80, 80);
        add(warWinnerPointsView);
        // setBounds(800, 400, 800, 80);
        warWinnerPointsView1.setBounds(600, 500, 80, 80);
        add(warWinnerPointsView1);

        bluePointsView.setBounds(500, 600, 80, 80);
        add(bluePointsView);
        bluePointsView1.setBounds(500, 500, 80, 80);
        add(bluePointsView1);
        
        JPanel sience = new JPanel();
        JPanel resource = new JPanel();

        sience.setBounds(80, 600, 400, 80);
        sience.setBackground(Color.WHITE);
        add(sience);
        resource.setBounds(80, 500, 400, 80);
        resource.setBackground(Color.WHITE);
        add(resource);



        setTitle(WINDOW_NAME);
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // getContentPane().setBackground(new Color(COLOR1, COLOR2, COLOR3));
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
