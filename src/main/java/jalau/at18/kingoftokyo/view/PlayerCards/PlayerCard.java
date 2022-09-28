package jalau.at18.kingoftokyo.view.playercards;

import java.awt.*;
import javax.swing.JPanel;

import jalau.at18.kingoftokyo.model.Player;

public class PlayerCard extends JPanel {
    private static final int WIDTH = 300;
    private static final int HEIGHT = 150;
    private static final int VICTORY_INDEX = 3;
    private static final int ICON_INDEX = 4;

    private Player player;

    public PlayerCard(Player player) {
        this.player = player;
        setBackground(Color.BLUE);
        setAlignmentX(Component.CENTER_ALIGNMENT);
        setSize(WIDTH, HEIGHT);
        setLayout(null);
        add(new PlayerCardName());
        add(new PlayerCardLifePoints());
        add(new PlayerCardEnergyPoints());
        add(new PlayerCardVictoryPoints());
        add(new PlayerCardMonsterIcon(player.getMonster().getIconPath()));
        updatePlayerStatus();
        setVisible(false);
    }
    public void setPlayer(Player newPlayer) {
        this.player = newPlayer;
        ((PlayerCardName) getComponent(0)).setMonsterName(player.getMonster().getName());
        ((PlayerCardMonsterIcon) getComponent(ICON_INDEX)).setMonsterImage(player.getMonster().getIconPath());
    }

    public void updatePlayerStatus() {
        ((PlayerCardLifePoints) getComponent(1)).setLifePoints(player.getLifePoints());
        ((PlayerCardEnergyPoints) getComponent(2)).setEnergyPoints(player.getEnergy());
        ((PlayerCardVictoryPoints) getComponent(VICTORY_INDEX)).setVictoryPoints(player.getVictoryPoints());
    }
}
