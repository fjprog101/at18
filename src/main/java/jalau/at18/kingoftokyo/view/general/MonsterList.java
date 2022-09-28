package jalau.at18.kingoftokyo.view.general;


import jalau.at18.kingoftokyo.model.Monster;

import javax.swing.*;
import java.awt.*;

public class MonsterList extends JComboBox<Monster> {
    private static final String FONT_NAME = "Serif";
    private static final int FONT_SIZE = 18;
    public MonsterList() {
        super();
        new JComboBox<Monster>();
        addItem(null);
        addItem(Monster.ALIENOID);
        addItem(Monster.SPACE_PENGUIN);
        addItem(Monster.CYBER_KITTY);
        addItem(Monster.ALIENOID);
        setFont(new Font(FONT_NAME, Font.BOLD, FONT_SIZE));
    }

    public Monster getMonster() {
        return getItemAt(getSelectedIndex());
    }
}
