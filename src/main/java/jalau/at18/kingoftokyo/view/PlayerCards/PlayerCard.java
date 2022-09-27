package jalau.at18.kingoftokyo.view.playercards;

import java.awt.*;
import javax.swing.JPanel;

import jalau.at18.kingoftokyo.Player;

public class PlayerCard extends JPanel {
    private static final int WIDTH = 300;
    private static final int HEIGHT = 150;
    private static final int POSITION = 20;

    public PlayerCard(Player player) {
        setBackground(Color.BLUE);
        setAlignmentX(Component.CENTER_ALIGNMENT);
        setSize(WIDTH, HEIGHT);
        setLayout(null);
        add(new PlayerCardName(player.getMonster().getName()));
        add(new PlayerCardLifePoints(player.getLifePoints()));
        add(new PlayerCardEnergyPoints(player.getEnergy()));
        add(new PlayerCardVictoryPoints(player.getVictoryPoints()));
        add(new PlayerCardMonsterIcon(player.getMonster().getIconPath()));
    }
}
