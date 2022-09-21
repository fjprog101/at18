package jalau.at18.kingoftokyo.view;

import java.awt.Color;
import java.awt.Component;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import jalau.at18.kingoftokyo.Monster;
import jalau.at18.kingoftokyo.Player;

public class PlayerCard extends JPanel {
    private final int DEFAULT_WIDTH = 300;
    private final int DEFAULT_HEIGHT = 150;
    private final int INIT_POSITION = 20;

    public PlayerCard(Monster monster, int playerNumber) {
        setBackground(Color.lightGray);
        setBounds(INIT_POSITION, INIT_POSITION + (DEFAULT_HEIGHT + INIT_POSITION) * playerNumber, DEFAULT_WIDTH,
                DEFAULT_HEIGHT);
        add(new PlayerCardName(monster.getName()));
    }

}
