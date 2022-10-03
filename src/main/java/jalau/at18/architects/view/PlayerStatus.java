package jalau.at18.architects.view;

import static jalau.at18.architects.view.Constants.PlayStatusConstants.*;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;

import jalau.at18.architects.controller.ElementsController;
import jalau.at18.architects.controller.WonderController;
import jalau.at18.architects.model.BuildStage;
import jalau.at18.architects.model.cards.BluePoints;
import jalau.at18.architects.model.cards.MilitaryStrengthCounter;
import jalau.at18.architects.model.cards.WarWinnerPoints;
import jalau.at18.architects.model.player.Playcard;
import jalau.at18.architects.model.player.Player;

public class PlayerStatus extends JPanel {
    private WonderStructure wonderStructure;
    private AddStageButton addStage;
    private WonderController wonderController;
    private JLabel message;
    private JLabel nameWonder;
    private Player player;
    private JLabel name;
    private Playcard playcard;
    private MilitaryStrengthCounter militarySection;
    private ElementsController elementsController;
    private TakeACardButton takeACardButton;
    private WarWinnerPoints warWinnerPoints;
    private BluePoints bluePoints;

    public PlayerStatus(Player player) {
        setOpaque(false);
        this.player = player;
        playcard = player.getPlaycard();
        warWinnerPoints = playcard.getWarWinnerPoints();
        bluePoints = playcard.getBluePoints();
        militarySection = playcard.getMilitarySection();
        name = new JLabel("");
        nameWonder = new JLabel(player.getWonder().getName());
        setLayout(null);
        setBounds(PLAYER_STATUS_POSITION_X, PLAYER_STATUS_POSITION_Y, PLAYER_STATUS_WIDTH, PLAYER_STATUS_HEIGHT);
        initialize();
        setName(player.getName());

    }

    public void initialize() {
        MiddleDeck middleDeck1 = new MiddleDeck();
        MiddleDeck middleDeck2 = new MiddleDeck();
        MilitaryPanelView militaryPanel = new MilitaryPanelView(militarySection);
        message = new JLabel("Your turn to play:");

        message.setBounds(MESSAGE_TURN_X, MESSAGE_TURN_Y, MESSAGE_TURN_WIDTH, MESSAGE_TURN_HEIGHT);
        message.setFont(new Font("Serif", Font.PLAIN, SIZE_LABELS));
        add(message);

        nameWonder.setBounds(NAME_WONDER_X, NAME_WONDER_Y, NAME_WONDER_WIDTH, NAME_WONDER_HEIGHT);
        nameWonder.setFont(new Font("Serif", Font.PLAIN, SIZE_LABELS));
        add(nameWonder);

        wonderStructure = new WonderStructure();
        wonderStructure.showWonder();
        wonderStructure.setBounds(WONDER_POSITION_X, WONDER_POSITION_Y, WONDER_WIDTH, WONDER_HEIGHT);
        add(wonderStructure);

        middleDeck1.setBounds(DECK1_POSITION_X, DECK1_POSITION_Y, DECK_WIDTH, DECK_HEIGHT);
        add(middleDeck1);
        middleDeck2.setBounds(DECK2_POSITION_X, DECK2_POSITION_Y, DECK_WIDTH, DECK_HEIGHT);
        add(middleDeck2);
    }

    public void addStage(int stagesCompleted) {
        wonderStructure.buildStages(stagesCompleted);
        this.validate();
    }

    public void setName(String namePlayer) {
        name.setText(namePlayer);
        name.setBounds(PLAYER_NAME_X, PLAYER_NAME_Y, PLAYER_NAME_WIDTH, PLAYER_NAME_HEIGHT);
        name.setFont(new Font("Serif", Font.PLAIN, SIZE_LABELS));
        add(name);
        this.validate();
    }

    public void setPanels(ResourcePanel resourcePanel, SciencePanel sciencePanel) {
        elementsController = new ElementsController(this, resourcePanel, sciencePanel, player);
        takeACardButton = new TakeACardButton(elementsController);
        add(takeACardButton);
    }

    public void setStagesForWonders(BuildStage buildStage, ResourcePanel resourcePanel) {
        wonderController = new WonderController(buildStage, this, player, resourcePanel);
        addStage = new AddStageButton(wonderController);
        add(addStage);
    }

    public void enableTakeACardButton() {
        takeACardButton.setEnabled(true);
    }

    public void unableTakeCardButton() {
        takeACardButton.setEnabled(false);
    }

    public void enableAddStagesButton() {
        addStage.setEnabled(true);
    }

    public void unableAddStagesButton() {
        addStage.setEnabled(false);
    }

}
