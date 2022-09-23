package jalau.at18.war.view;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

import jalau.at18.war.model.Game;

public class WarFrame extends JFrame {

    public WarFrame() {
        // Initialize controller with reference to this ui frame
        // so that controller can update the frame components
        Game theGame = new Game();
        initialize(theGame);
    }

    private void initialize(Game game) {
        // Add 4 players
        add(new PlayerPanel(game), BorderLayout.NORTH);
        add(new PlayerPanel(game), BorderLayout.EAST);
        add(new PlayerPanel(game), BorderLayout.WEST);
        add(new PlayerPanel(game), BorderLayout.SOUTH);

        // Add world map
        JLabel worldMap = new JLabel(new ImageIcon("src/main/resources/war/world-map.png"));
        worldMap.setBorder(new LineBorder(Color.BLUE));
        add(worldMap, BorderLayout.CENTER);

        // Configure frame
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
