package jalau.at18.war.view;

import java.awt.BorderLayout;
import javax.swing.JFrame;

import jalau.at18.war.model.Game;

public class WarFrame extends JFrame {

    private static final int DEFAULT_SIZE = 500;

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

        // Configure frame
        setSize(DEFAULT_SIZE, DEFAULT_SIZE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
