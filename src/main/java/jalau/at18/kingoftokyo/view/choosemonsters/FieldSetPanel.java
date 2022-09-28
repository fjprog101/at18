package jalau.at18.kingoftokyo.view.choosemonsters;

import javax.swing.*;
import java.awt.*;

public class FieldSetPanel extends JPanel {
    private static final String PLAYER_ONE = "Player 1";
    private static final String PLAYER_TWO = "Player 2";
    private static final String PLAYER_THREE = "Player 3";
    private static final String PLAYER_FOUR = "Player 4";

    public FieldSetPanel() {
        initialize();
        PlayerPanel playerOne = new PlayerPanel();
        playerOne.setPanelBorder(PLAYER_ONE);
        playerOne.setPanelColor(Color.GRAY);
        PlayerPanel playerTwo = new PlayerPanel();
        playerTwo.setPanelBorder(PLAYER_TWO);
        playerTwo.setPanelColor(Color.CYAN);
        PlayerPanel playerThree = new PlayerPanel();
        playerThree.setPanelBorder(PLAYER_THREE);
        playerThree.setPanelColor(Color.MAGENTA);
        PlayerPanel playerFour = new PlayerPanel();
        playerFour.setPanelBorder(PLAYER_FOUR);
        playerFour.setPanelColor(Color.PINK);
        add(playerOne);
        add(playerTwo);
        add(playerThree);
        add(playerFour);
    }

    private void initialize() {
        setLayout(new GridLayout(2, 2));
    }
}
