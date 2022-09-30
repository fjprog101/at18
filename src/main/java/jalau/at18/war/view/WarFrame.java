package jalau.at18.war.view;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

public class WarFrame extends JFrame {

    public WarFrame() {
        initialize();
    }

    private void initialize() {
        // Add 4 players
        add(new PlayerPanel(), BorderLayout.PAGE_START);
        add(new PlayerPanel(), BorderLayout.LINE_END);
        add(new PlayerPanel(), BorderLayout.PAGE_END);
        add(new PlayerPanel(), BorderLayout.LINE_START);

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
