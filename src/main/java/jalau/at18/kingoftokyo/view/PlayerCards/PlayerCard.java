package jalau.at18.kingoftokyo.view.playercards;

import java.awt.Color;
import javax.swing.JPanel;

import jalau.at18.kingoftokyo.Monster;
import jalau.at18.kingoftokyo.Player;

public class PlayerCard extends JPanel {
    private static final int WIDTH = 300;
    private static final int HEIGHT = 150;
    private static final int POSITION = 20;

    public PlayerCard(Monster monster, int playerNumber, Player player) {
        setBackground(Color.BLUE);
        setBounds(POSITION, POSITION + (HEIGHT + POSITION) * playerNumber, WIDTH,
                HEIGHT);
        setLayout(null);
        add(new PlayerCardName(monster.getName()));
        add(new PlayerCardLifePoints(monster.getLifePoints()));
        add(new PlayerCardEnergyPoints(player.getEnergy()));
        add(new PlayerCardVictoryPoints(monster.getVictoryPoints()));
        add(new PlayerCardMonsterIcon(monster.getIconPath()));
    }

}
