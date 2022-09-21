package jalau.at18.kingoftokyo.view;

import java.awt.Color;
import javax.swing.JPanel;

import jalau.at18.kingoftokyo.Monster;

public class PlayerCard extends JPanel {
    private static final int WIDTH = 300;
    private static final int HEIGHT = 150;
    private static final int POSITION = 20;

    public PlayerCard(Monster monster, int playerNumber) {
        setBackground(Color.BLUE);
        setBounds(POSITION, POSITION + (HEIGHT + POSITION) * playerNumber, WIDTH,
                HEIGHT);
        setLayout(null);
        add(new PlayerCardName(monster.getName()));
    }

}
