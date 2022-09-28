package jalau.at18.kingoftokyo.view.choosemonsters;

import jalau.at18.kingoftokyo.view.general.MonsterLabel;
import jalau.at18.kingoftokyo.view.general.MonsterList;
import jalau.at18.kingoftokyo.view.general.UsernameLabel;
import jalau.at18.kingoftokyo.view.general.UsernameTextBox;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class PlayerPanel extends JPanel {

    private static final String TITLE = "Number of Players";
    private static final String NAME = "Serif";
    private static final int SIZE = 22;

    public PlayerPanel() {
        initialize();
        SpringLayout springLayout = new SpringLayout();
        springLayout.putConstraint(SpringLayout.WEST, add(new UsernameLabel()),50, SpringLayout.EAST, add(new UsernameTextBox()));
        springLayout.putConstraint(SpringLayout.NORTH, add(new MonsterLabel()),50, SpringLayout.NORTH, add(new MonsterList()));
    }

    private void initialize() {
        Font font = new Font(NAME, Font.BOLD, SIZE);
        setBorder(BorderFactory.createTitledBorder(null, TITLE, TitledBorder.LEFT, 0, font));
    }

    public void setPanelBorder(String str) {
        setBorder(BorderFactory.createTitledBorder(str));
    }

    public void setPanelColor(Color color) {
        setBackground(color);
    }
}
