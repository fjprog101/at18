package jalau.at18.kingoftokyo.view.board;

import java.awt.Component;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import jalau.at18.kingoftokyo.model.TokyoCity;

public class BoardView extends JLabel {
    private static final int POSITION_X = 0;
    private static final int POSITION_Y = 0;
    private static final int SIZE = 500;

    public BoardView(TokyoCity tokyoCity) {
        setBounds(POSITION_X, POSITION_Y, SIZE, SIZE);
        ImageIcon image = new ImageIcon("src/main/resources/kingoftokyo/board.png");
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(SIZE, SIZE,
                SIZE));
        setIcon(icon);
        setAlignmentX(Component.CENTER_ALIGNMENT);
        setVisible(true);
        add(new MonsterLabel(tokyoCity));
    }
}