package jalau.at18.kingoftokyo.view.general;


import jalau.at18.kingoftokyo.model.Monster;

import javax.swing.*;
import java.awt.*;

public class MonsterList extends JComboBox<Monster> {
    private static final String FONT_NAME = "Serif";
    private static final int FONT_SIZE = 18;
    private Monster[] allMonsters = new Monster[]{Monster.ALIENOID, Monster.CYBER_KITTY, Monster.SPACE_PENGUIN, Monster.KOOKIE};
    public MonsterList() {
        super();
        new JComboBox<Monster>();
        addItem(null);
        for (Monster monster: allMonsters) {
            addItem(monster);
        }
        setFont(new Font(FONT_NAME, Font.BOLD, FONT_SIZE));
    }
    public Monster getMonster() {
        return getItemAt(getSelectedIndex());
    }
}
