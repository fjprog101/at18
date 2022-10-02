package jalau.at18.kingoftokyo.view.whostart;

import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.TitledBorder;

import java.awt.*;
import jalau.at18.kingoftokyo.model.Player;

public class ShowResultsPanel extends JPanel  {
    private static final String NAME = "Serif";
    private static final int SIZE = 22;
    private static final int THREE = 3;
    private static final int RED = 176;
    private static final int GREEN = 82;
    private static final int BLUE = 122;
    private static final int DEFAULT_LABEL_WIDTH = 800;
    private static final int DEFAULT_LABEL_HEIGHT = 200;
    private ArrayList<Player>  playerList;
    public ShowResultsPanel(ArrayList<Player>  playerList) {
        setPreferredSize(new Dimension(DEFAULT_LABEL_WIDTH, DEFAULT_LABEL_HEIGHT));
        setAlignmentX(Component.CENTER_ALIGNMENT);
        this.playerList = playerList;
        Font font = new Font(NAME, Font.BOLD, SIZE);
        setBorder(BorderFactory.createTitledBorder(null, "Results of players", TitledBorder.LEFT, 0, font));
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        add(new PlayerTitleLabel());
        initPlayerLabel();
        float[] hsb = new float[THREE];
        hsb = Color.RGBtoHSB(RED, GREEN, BLUE, hsb);
        setBackground(Color.getHSBColor(hsb[0], hsb[1], hsb[2]));
    }

    public void initPlayerLabel() {
        for (int index = 0; index < playerList.size(); index++) {
            PlayerNameLabel playerNameLabel = new PlayerNameLabel(playerList.get(index).getMonster().getName());
            add(playerNameLabel);
        }
    }

    public void setTextComponent(int count, int cantPunching) {
        ((PlayerNameLabel) getComponent(count)).setPlayerName(cantPunching);
    }

    public ArrayList<Player>  getArrayPlayer() {
        return playerList;
    }
}