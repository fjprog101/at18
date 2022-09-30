package jalau.at18.kingoftokyo.view.board;

import java.awt.Component;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import jalau.at18.kingoftokyo.model.Monster;

public class MonsterLabel extends JLabel {
    private static final int POSITION_X = 60;
    private static final int POSITION_Y = 130;
    private static final int SIZE = 100;

    public MonsterLabel(Monster monster) {
        setBounds(POSITION_X, POSITION_Y, SIZE, SIZE);
        ImageIcon image = new ImageIcon(monster.getIconPath());
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(SIZE, SIZE,
                SIZE));
        setIcon(icon);
        setAlignmentX(Component.CENTER_ALIGNMENT);
        setVisible(true);
    }
}
