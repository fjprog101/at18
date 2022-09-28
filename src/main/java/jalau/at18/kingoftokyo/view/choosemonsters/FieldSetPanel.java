package jalau.at18.kingoftokyo.view.choosemonsters;

import jalau.at18.kingoftokyo.view.general.MonsterList;
import jalau.at18.kingoftokyo.view.general.UsernameTextBox;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class FieldSetPanel extends JPanel {
    private static final String PLAYER_ONE = "Player 1";
    private static final String PLAYER_TWO = "Player 2";
    private static final String PLAYER_THREE = "Player 3";
    private static final String PLAYER_FOUR = "Player 4";

    private PlayerPanel playerOne;
    private PlayerPanel playerTwo;
    private PlayerPanel playerThree;
    private PlayerPanel playerFour;
    public FieldSetPanel() {
        initialize();
        playerOne = new PlayerPanel();
        playerOne.setPanelBorder(PLAYER_ONE);
        playerOne.setPanelColor(Color.GRAY);
        playerTwo = new PlayerPanel();
        playerTwo.setPanelBorder(PLAYER_TWO);
        playerTwo.setPanelColor(Color.CYAN);
        playerThree = new PlayerPanel();
        playerThree.setPanelBorder(PLAYER_THREE);
        playerThree.setPanelColor(Color.MAGENTA);
        playerFour = new PlayerPanel();
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

    public ArrayList<UsernameTextBox> getUserList() {
        ArrayList<UsernameTextBox> list = new ArrayList<>();
        System.out.println(playerOne.getPlayerUsername());
        list.add(playerOne.getPlayerUsername());
        list.add(playerTwo.getPlayerUsername());
        list.add(playerThree.getPlayerUsername());
        list.add(playerFour.getPlayerUsername());
        return list;
    }

    public ArrayList<MonsterList> getMonsterList() {
        ArrayList<MonsterList> list = new ArrayList<>();
        list.add(playerOne.getMonsterList());
        list.add(playerTwo.getMonsterList());
        list.add(playerThree.getMonsterList());
        list.add(playerFour.getMonsterList());
        return list;
    }
}
