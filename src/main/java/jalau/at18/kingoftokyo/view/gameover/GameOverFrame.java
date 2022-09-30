package jalau.at18.kingoftokyo.view.gameover;

import javax.swing.*;

public class GameOverFrame extends JFrame {
    private static final int DEFAULT_POS = 200;
    private static final int DEFAULT_WIDTH = 500;
    private static final int DEFAULT_HEIGHT = 300;

    public GameOverFrame() {
        LabelsPanel labelsPanel = new LabelsPanel();
        ButtonsPanel buttonsPanel = new ButtonsPanel();
        add(labelsPanel);
        add(buttonsPanel);
        initialize();
    }

    private void initialize() {
        setResizable(false);
        setBounds(DEFAULT_POS, DEFAULT_POS, DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
    }
}
