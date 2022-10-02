package jalau.at18.kingoftokyo.view.playercard;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

import jalau.at18.kingoftokyo.model.Monster;
import jalau.at18.kingoftokyo.model.Player;

public class PlayerCardsGroupPanel extends JPanel {
    private static final int THREE = 3;
    private static final int RED = 176;
    private static final int GREEN = 82;
    private static final int BLUE = 122;
    private static final int[] SIZE = {300, 650};
    private static final int[] POS = {0, 0};
    private static final int CARDS_SEPARATION = 5;
    private ArrayList<Player> playersArray;

    public PlayerCardsGroupPanel(ArrayList<Player> playersArray) {
        this.playersArray = playersArray;
        setBounds(POS[0], POS[1], SIZE[0], SIZE[1]);
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        addComponents();
        initializePlayerCards();
        float[] hsb = new float[THREE];
        hsb = Color.RGBtoHSB(RED, GREEN, BLUE, hsb);
        setBackground(Color.getHSBColor(hsb[0], hsb[1], hsb[2]));
    }

    private void addComponents() {
        Player playerDefault = new Player();
        playerDefault.addMonster(Monster.ALIENOID);
        add(new PlayerCard(playerDefault));
        add(Box.createRigidArea(new Dimension(0, CARDS_SEPARATION)));
        add(new PlayerCard(playerDefault));
        add(Box.createRigidArea(new Dimension(0, CARDS_SEPARATION)));
        add(new PlayerCard(playerDefault));
        add(Box.createRigidArea(new Dimension(0, CARDS_SEPARATION)));
        add(new PlayerCard(playerDefault));
    }
    public void initializePlayerCards() {
        for (int index = 0; index < playersArray.size(); index++) {
            getComponent(index * 2).setVisible(true);
            playersArray.get(index).addObserver((PlayerCard) getComponent(index * 2));
            ((PlayerCard) getComponent(index * 2)).setPlayer(playersArray.get(index));
            ((PlayerCard) getComponent(index * 2)).update();
        }
    }
}
