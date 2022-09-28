package jalau.at18.kingoftokyo.view.choosemonsters;

import jalau.at18.kingoftokyo.Game;
import jalau.at18.kingoftokyo.view.general.FooterPanel;
import jalau.at18.kingoftokyo.view.general.HeaderPanel;

import javax.swing.*;
import java.awt.*;

public class ChooseMonstersFrame extends JFrame {
    private static final int DEFAULT_POS = 30;
    private static final int DEFAULT_WIDTH = 700;
    private static final int DEFAULT_HEIGHT = 500;

    public ChooseMonstersFrame(Game game) {
        HeaderPanel headerPanel = new HeaderPanel();
        CenterPanel centerPanel = new CenterPanel(this, game);
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
