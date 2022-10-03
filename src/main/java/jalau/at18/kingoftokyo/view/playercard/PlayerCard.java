package jalau.at18.kingoftokyo.view.playercard;

import java.awt.*;
import javax.swing.JPanel;

import jalau.at18.kingoftokyo.model.Observer;
import jalau.at18.kingoftokyo.model.Player;

public class PlayerCard extends JPanel implements Observer {
    private static final int THREE = 3;
    private static final int RED = 104;
    private static final int GREEN = 2;
    private static final int BLUE = 155;
    private static final int WIDTH = 300;
    private static final int HEIGHT = 150;
    private static final int VICTORY_INDEX = 3;
    private static final int ICON_INDEX = 4;

    private Player player;

    public PlayerCard(Player player) {
        this.player = player;
        float[] hsb = new float[THREE];
        hsb = Color.RGBtoHSB(RED, GREEN, BLUE, hsb);
        setBackground(Color.getHSBColor(hsb[0], hsb[1], hsb[2]));
        setAlignmentX(Component.CENTER_ALIGNMENT);
        setSize(WIDTH, HEIGHT);
        setLayout(null);
        add(new PlayerCardName());
        add(new PlayerCardLifePoints());
        add(new PlayerCardEnergyPoints());
        add(new PlayerCardVictoryPoints());
        add(new PlayerCardMonsterIcon(player.getMonster().getIconPath()));
        update();
        setVisible(false);
    }
    public void setPlayer(Player newPlayer) {
        this.player = newPlayer;
        ((PlayerCardName) getComponent(0)).setMonsterName(player.getUserName(), player.getMonster().getName());
        ((PlayerCardMonsterIcon) getComponent(ICON_INDEX)).setMonsterImage(player.getMonster().getIconPath());
    }
    @Override
    public void update() {
        ((PlayerCardLifePoints) getComponent(1)).setLifePoints(player.getLifePoints());
        ((PlayerCardEnergyPoints) getComponent(2)).setEnergyPoints(player.getEnergy());
        ((PlayerCardVictoryPoints) getComponent(VICTORY_INDEX)).setVictoryPoints(player.getVictoryPoints());
        if (player.getLifePoints() == 0) {
            setEnabled(false);
            setBackground(Color.RED);
        }
    }
}
