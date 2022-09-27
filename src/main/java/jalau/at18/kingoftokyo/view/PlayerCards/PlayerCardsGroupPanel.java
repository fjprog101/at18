package jalau.at18.kingoftokyo.view.playercards;

import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

import jalau.at18.kingoftokyo.model.Monster;
import jalau.at18.kingoftokyo.model.Player;

public class PlayerCardsGroupPanel extends JPanel {
    private static final int[] SIZE = {300, 650};
    private static final int[] POS = {0, 0};
    private static final int CARDS_SEPARATION = 5;
    private Player[] playersArray;

    public PlayerCardsGroupPanel(Player[] playersArray) {
        this.playersArray = playersArray;
        setBounds(POS[0], POS[1], SIZE[0], SIZE[1]);
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        addComponents();
        initializePlayerCards();
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
        for (int index = 0; index < playersArray.length; index++) {
            getComponent(index * 2).setVisible(true);
            playersArray[index].addSubscriber((PlayerCard) getComponent(index * 2));
            ((PlayerCard) getComponent(index * 2)).setPlayer(playersArray[index]);
            ((PlayerCard) getComponent(index * 2)).updatePlayerStatus();
        }
    }
}
