package jalau.at18.kingoftokyo.view.choosemonsters;

import jalau.at18.kingoftokyo.view.general.MonsterLabel;
import jalau.at18.kingoftokyo.view.general.MonsterList;
import jalau.at18.kingoftokyo.view.general.UsernameLabel;
import jalau.at18.kingoftokyo.view.general.UsernameTextBox;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class PlayerPanel extends JPanel {
    private static final int THREE = 3;
    private static final int RED = 176;
    private static final int GREEN = 82;
    private static final int BLUE = 122;
    private static final String NAME = "Serif";
    private static final int SIZE = 20;

    private UsernameTextBox playerUsername;
    private MonsterList monsterList;

    public PlayerPanel() {
        SpringLayout springLayout = new SpringLayout();
        this.playerUsername = new UsernameTextBox();
        this.monsterList = new MonsterList();
        springLayout.putConstraint(SpringLayout.WEST, add(new UsernameLabel()), 0, SpringLayout.EAST, add(playerUsername));
        springLayout.putConstraint(SpringLayout.NORTH, add(new MonsterLabel()), 0, SpringLayout.NORTH, add(monsterList));
    }

    public void setPanelBorder(String str) {
        Font font = new Font(NAME, Font.BOLD, SIZE);
        setBorder(BorderFactory.createTitledBorder(null, str, TitledBorder.LEFT, 0, font));
    }

    public void setPanelColor() {
        float[] hsb = new float[THREE];
        hsb = Color.RGBtoHSB(RED, GREEN, BLUE, hsb);
        setBackground(Color.getHSBColor(hsb[0], hsb[1], hsb[2]));
    }

    public UsernameTextBox getPlayerUsername() {
        return playerUsername;
    }

    public MonsterList getMonsterList() {
        return monsterList;
    }

}
