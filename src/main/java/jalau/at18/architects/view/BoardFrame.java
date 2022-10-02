package jalau.at18.architects.view;

import java.awt.*;
import javax.swing.*;

import jalau.at18.architects.controller.BarConflictController;
import jalau.at18.architects.controller.WonderController;
import jalau.at18.architects.model.BuildStage;
import jalau.at18.architects.model.Game;

public class BoardFrame extends JFrame {
    public static final int WIDTH = 840;
    public static final int HEIGHT = 780;
    public static final String WINDOW_NAME = "7 Wonders Architect";
    public static final int COLOR1 = 125;
    public static final int COLOR2 = 245;
    public static final int COLOR3 = 230;

    private Game game;
    private MiddleDeck middleDeck;
    private CheckTheConflictTokens checkTheConflictTokens;
    private BarConflictController barConflictController;
    private WonderController wonderController;
    private WarWinnerPointsView warWinnerPointsView;
    private BluePointsView bluePointsView;
    private WonderStructure wonderStructure;
    private AddStageButton addStage;

    private static final int DECK_POSITION_X = 360;
    private static final int DECK_POSITION_Y = 0;
    private static final int DECK_WIDTH = 140;
    private static final int DECK_HEIGHT = 200;

    private static final int DECK1_POSITION_X = 60;
    private static final int DECK1_POSITION_Y = 250;

    private static final int DECK2_POSITION_X = 660;
    private static final int DECK2_POSITION_Y = 250;

    private static final int WONDER_POSITION_X = 270;
    private static final int WONDER_POSITION_Y = 240;
    private static final int WONDER_WIDTH = 300;
    private static final int WONDER_HEIGHT = 240;

    private static final int WAR_POINT_POSITION_X = 600;
    private static final int WAR_POINT_POSITION_Y = 600;
    private static final int POINT_WIDTH = 80;
    private static final int POINT_HEIGHT = 80;

    private static final int BLUE_POINT_POSITION_X = 500;
    private static final int BLUE_POINT_POSITION_Y = 600;

    private static final int MILITARY_T_POSITION_X = 600;
    private static final int MILITARY_T_POSITION_Y = 500;

    private static final int MILITARY_P_POSITION_X = 500;
    private static final int MILITARY_P_POSITION_Y = 500;

    private static final int SIENCE_POSITION_X = 80;
    private static final int SIENCE_POSITION_Y = 600;
    private static final int SIENCE_WIDTH = 400;
    private static final int SIENCE_HEIGHT = 80;

    private static final int RESOURCE_POSITION_X = 80;
    private static final int RESOURCE_POSITION_Y = 500;
    private static final int RESOURCE_WIDTH = 400;
    private static final int RESOURCE_HEIGHT = 80;

    // private BuildStage buildStage;
    public BoardFrame(Game game) {
        setResizable(false);
        this.game = game;
        barConflictController = new BarConflictController(this, game);
        wonderController = new WonderController(this, new BuildStage());
        initialize();
    }

    private void initialize() {
        middleDeck = new MiddleDeck();
        MiddleDeck middleDeck1 = new MiddleDeck();
        MiddleDeck middleDeck2 = new MiddleDeck();

        setContentPane(new JLabel(new ImageIcon("src/main/resources/architects/images/backimage.jpg")));

        checkTheConflictTokens = new CheckTheConflictTokens(barConflictController);

        wonderStructure = new WonderStructure();
        addStage = new AddStageButton(wonderController);

        warWinnerPointsView = new WarWinnerPointsView();
        bluePointsView = new BluePointsView();

        add(addStage); // button
        middleDeck.setBounds(DECK_POSITION_X, DECK_POSITION_Y, DECK_WIDTH, DECK_HEIGHT);
        add(middleDeck);
        middleDeck1.setBounds(DECK1_POSITION_X, DECK1_POSITION_Y, DECK_WIDTH, DECK_HEIGHT);
        add(middleDeck1);
        middleDeck2.setBounds(DECK2_POSITION_X, DECK2_POSITION_Y, DECK_WIDTH, DECK_HEIGHT);
        add(middleDeck2);

        add(checkTheConflictTokens);

        wonderStructure.setBounds(WONDER_POSITION_X, WONDER_POSITION_Y, WONDER_WIDTH, WONDER_HEIGHT);
        add(wonderStructure);

        JPanel militaryT = new JPanel();
        JPanel militaryP = new JPanel();

        militaryT.setBounds(MILITARY_T_POSITION_X, MILITARY_T_POSITION_Y, POINT_WIDTH, POINT_HEIGHT);
        add(militaryT);

        militaryP.setBounds(MILITARY_P_POSITION_X, MILITARY_P_POSITION_Y, POINT_WIDTH, POINT_HEIGHT);
        add(militaryP);

        warWinnerPointsView.setBounds(WAR_POINT_POSITION_X, WAR_POINT_POSITION_Y, POINT_WIDTH, POINT_HEIGHT);
        add(warWinnerPointsView);

        bluePointsView.setBounds(BLUE_POINT_POSITION_X, BLUE_POINT_POSITION_Y, POINT_WIDTH, POINT_HEIGHT);
        add(bluePointsView);

        JPanel sience = new JPanel();
        JPanel resource = new JPanel();

        sience.setBounds(SIENCE_POSITION_X, SIENCE_POSITION_Y, SIENCE_WIDTH, SIENCE_HEIGHT);
        sience.setBackground(Color.WHITE);
        add(sience);
        resource.setBounds(RESOURCE_POSITION_X, RESOURCE_POSITION_Y, RESOURCE_WIDTH, RESOURCE_HEIGHT);
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

    public void addStage(int stagesCompleted) {
        wonderStructure.buildStages(stagesCompleted);
        this.validate();
    }
}
