package jalau.at18.architects.view;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import jalau.at18.architects.controller.WonderController;
import jalau.at18.architects.model.BuildStage;
import jalau.at18.architects.model.cards.BluePoints;
import jalau.at18.architects.model.cards.MilitaryStrengthCounter;
import jalau.at18.architects.model.cards.WarWinnerPoints;
import jalau.at18.architects.model.player.Playcard;
import jalau.at18.architects.model.player.Player;

public class PlayerStatus extends JPanel{
    private WonderStructure wonderStructure;
    private AddStageButton addStage;
    private WonderController wonderController;
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
    private WarWinnerPointsView warWinnerPointsView;
    private BluePointsView bluePointsView;
    private JLabel message;
    private JLabel nameWonder;
    private Player player;
    private JLabel name;
    private BoardFrame frame;
    private Playcard playcard;
    private MilitaryStrengthCounter militarySection;
    private BluePoints bluePoints;
    private WarWinnerPoints warWinnerPoints;
    public PlayerStatus(Player player) {
        this.player = player;
        playcard = player.getPlaycard();
        warWinnerPoints = playcard.getWarWinnerPoints();
        bluePoints = playcard.getBluePoints();
        militarySection = playcard.getMilitarySection();
        setLayout(null);
        setBounds(0, 0, 840, 800);
        wonderController = new WonderController(new BuildStage(), this);
        name = new JLabel("");
        nameWonder =  new JLabel(player.getWonder().getName());
        initialize();
        setName(player.getName());

    }
    public void initialize() {
        MiddleDeck middleDeck1 = new MiddleDeck();
        MiddleDeck middleDeck2 = new MiddleDeck();

        message = new JLabel("Your turn to play:");
        message.setBounds(185,470,250,50);
        message.setFont(new Font("Serif", Font.PLAIN, 30));
        add(message);

        nameWonder.setBounds(370,180,250,50);
        nameWonder.setFont(new Font("Serif", Font.PLAIN, 30));
        add(nameWonder);

        wonderStructure = new WonderStructure();
        wonderStructure.showWonder();
        wonderStructure.setBounds(WONDER_POSITION_X, WONDER_POSITION_Y, WONDER_WIDTH, WONDER_HEIGHT);
        add(wonderStructure);

        addStage = new AddStageButton(wonderController);
        add(addStage);

        middleDeck1.setBounds(DECK1_POSITION_X, DECK1_POSITION_Y, DECK_WIDTH, DECK_HEIGHT);
        add(middleDeck1);
        middleDeck2.setBounds(DECK2_POSITION_X, DECK2_POSITION_Y, DECK_WIDTH, DECK_HEIGHT);
        add(middleDeck2);

        warWinnerPointsView = new WarWinnerPointsView(warWinnerPoints);
        warWinnerPointsView.setBounds(WAR_POINT_POSITION_X, WAR_POINT_POSITION_Y, POINT_WIDTH, POINT_HEIGHT);
        add(warWinnerPointsView);

        bluePointsView = new BluePointsView(bluePoints);
        bluePointsView.setBounds(BLUE_POINT_POSITION_X, BLUE_POINT_POSITION_Y, POINT_WIDTH, POINT_HEIGHT);
        add(bluePointsView);


    }
    public void addStage(int stagesCompleted) {
        wonderStructure.buildStages(stagesCompleted);
        this.validate();
    }
    /*public void setName(String namePlayer) {
        name.setText(namePlayer);
        name.setBounds(400,470,250,50);
        name.setFont(new Font("Serif", Font.PLAIN, 30));
        add(name);
        this.validate();
    }*/

}
