package jalau.at18.kingoftokyo.view.board;

import java.awt.Component;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import jalau.at18.kingoftokyo.model.Monster;
import jalau.at18.kingoftokyo.model.Observer;
import jalau.at18.kingoftokyo.model.TokyoCity;

public class MonsterLabel extends JLabel implements Observer {
    private static final int POSITION_X = 60;
    private static final int POSITION_Y = 130;
    private static final int SIZE = 100;
    private TokyoCity tokyoCity;

    public MonsterLabel(TokyoCity tokyoCity) {
        this.tokyoCity = tokyoCity;
        tokyoCity.addObserver(this);
        setBounds(POSITION_X, POSITION_Y, SIZE, SIZE);
        ImageIcon image = new ImageIcon(Monster.ALIENOID.getIconPath());
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(SIZE, SIZE,
                SIZE));
        setIcon(icon);
        setAlignmentX(Component.CENTER_ALIGNMENT);
        setVisible(true);
    }

    @Override
    public void update() {
        ImageIcon image = new ImageIcon(tokyoCity.getMonster().getIconPath());
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(SIZE, SIZE,
                SIZE));
        setIcon(icon);
    }
}
