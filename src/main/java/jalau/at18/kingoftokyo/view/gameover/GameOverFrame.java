package jalau.at18.kingoftokyo.view.gameover;

import javax.swing.*;
import java.awt.*;

import jalau.at18.kingoftokyo.view.general.FooterPanel;
import jalau.at18.kingoftokyo.view.general.HeaderPanel;

public class GameOverFrame extends JFrame {
    private static final int DEFAULT_POS = 200;
    private static final int DEFAULT_WIDTH = 600;
    private static final int DEFAULT_HEIGHT = 400;

    public GameOverFrame() {
        HeaderPanel headerPanel = new HeaderPanel();
        CenterPanel centerPanel = new CenterPanel();
        FooterPanel footerPanel = new FooterPanel();
        initialize();
        add(headerPanel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);
        add(footerPanel, BorderLayout.SOUTH);
    }

    private void initialize() {
        setBounds(DEFAULT_POS, DEFAULT_POS, DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setTitle("King of Tokyo");
        setVisible(true);
    }
}
