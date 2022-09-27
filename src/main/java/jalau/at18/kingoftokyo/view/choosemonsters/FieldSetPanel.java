package jalau.at18.kingoftokyo.view.choosemonsters;

import jalau.at18.kingoftokyo.view.general.MonsterLabel;
import jalau.at18.kingoftokyo.view.general.MonsterList;
import jalau.at18.kingoftokyo.view.general.UsernameLabel;
import jalau.at18.kingoftokyo.view.general.UsernameTextBox;

import javax.swing.*;
import java.awt.*;

public class FieldSetPanel extends JPanel {

    private static final int DEFAULT_WIDTH = 100;
    private static final int DEFAULT_HEIGHT = 300;

    public FieldSetPanel() {
        add(new UsernameLabel());
        add(new UsernameTextBox());
        add(new MonsterLabel());
        add(new MonsterList());
        setBackground(Color.RED);
        initialize();
    }

    private void initialize() {
        setBorder(BorderFactory.createTitledBorder("Player 2"));
        setPreferredSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
    }
}
