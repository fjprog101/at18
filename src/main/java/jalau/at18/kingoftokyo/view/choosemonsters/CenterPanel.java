package jalau.at18.kingoftokyo.view.choosemonsters;

import jalau.at18.kingoftokyo.Game;

import javax.swing.*;
import java.awt.*;

public class CenterPanel extends JPanel {

    private static final int DEFAULT_WIDTH = 100;
    private static final int DEFAULT_HEIGHT = 100;

    public CenterPanel(ChooseMonstersFrame frame, Game game) {
        FieldSetPanel fieldSetPanel = new FieldSetPanel(game);
        ButtonsPanel buttonsPanel = new ButtonsPanel(frame, game, fieldSetPanel.getUserList(), fieldSetPanel.getMonsterList());
        initialize();
        add(fieldSetPanel, BorderLayout.CENTER);
        add(buttonsPanel, BorderLayout.SOUTH);
    }

    private void initialize() {
        setPreferredSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
        setLayout(new BorderLayout());
    }
}
