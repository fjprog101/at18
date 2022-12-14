package jalau.at18.kingoftokyo.view.general;

import jalau.at18.kingoftokyo.model.Monster;

import javax.swing.*;
import java.awt.*;

public class MonsterList extends JComboBox<Monster> {
    private static final String FONT_NAME = "Serif";
    private static final int FONT_SIZE = 15;
    private Monster[] allMonsters = new Monster[]{Monster.ALIENOID, Monster.CYBER_KITTY, Monster.SPACE_PENGUIN,
        Monster.GIGAZAUR, Monster.MEKA_DRAGON, Monster.THE_KING };

    public MonsterList() {
        super();
        new JComboBox<Monster>();
        addItem(null);
        for (Monster monster : allMonsters) {
            addItem(monster);
        }
        setFont(new Font(FONT_NAME, Font.PLAIN, FONT_SIZE));
    }

    public Monster getMonster() {
        return getItemAt(getSelectedIndex());
    }
}
