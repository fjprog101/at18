package jalau.at18.kingoftokyo.view.board;

import java.awt.Color;
import javax.swing.JPanel;

import jalau.at18.kingoftokyo.model.TokyoCity;

public class BoardPanel extends JPanel {
    private static final int SIZE = 500;
    private static final int POSITION_X = 390;
    private static final int POSITION_Y = 10;
    private TokyoCity tokyoCity;

    public BoardPanel() {
        tokyoCity = new TokyoCity();
        setBackground(Color.LIGHT_GRAY);
        setBounds(POSITION_X, POSITION_Y, SIZE,
                SIZE);
        setLayout(null);
        add(new BoardView(tokyoCity));
    }

}