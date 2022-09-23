package jalau.at18.kingoftokyo.view.whoStartsTheGame;
import java.awt.BorderLayout;

import javax.swing.*;

public class WhoStartFrame extends JFrame {

    private static final int DEFAULT_POS = 30;
    private static final int DEFAULT_WIDTH = 1200;
    private static final int DEFAULT_HEIGHT = 700;

    public WhoStartFrame() {
        PanelSouth panelSouth = new PanelSouth(this);
        setResizable(false);
        WhoStartLabel whoStartLabel = new WhoStartLabel();
        initialize();
        add(whoStartLabel, BorderLayout.CENTER);
        add(panelSouth, BorderLayout.SOUTH);
        add(new Player1(), BorderLayout.WEST);
        add(new Player2(), BorderLayout.EAST);

    }

    private void initialize() {
        setBounds(DEFAULT_POS, DEFAULT_POS, DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setTitle("King of Tokyo");
        setVisible(true);
    }
}