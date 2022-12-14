package jalau.at18.kingoftokyo.view.board;

import java.awt.Color;
import javax.swing.JPanel;

import jalau.at18.kingoftokyo.model.TokyoCity;

public class BoardPanel extends JPanel {
    private static final int THREE = 3;
    private static final int RED = 176;
    private static final int GREEN = 82;
    private static final int BLUE = 122;
    private static final int SIZE = 500;
    private static final int POSITION_X = 390;
    private static final int POSITION_Y = 10;

    public BoardPanel(TokyoCity tokyoCity) {
        //setBackground(Color.LIGHT_GRAY);
        setBounds(POSITION_X, POSITION_Y, SIZE, SIZE);
        setLayout(null);
        add(new BoardView(tokyoCity));
        float[] hsb = new float[THREE];
        hsb = Color.RGBtoHSB(RED, GREEN, BLUE, hsb);
        setBackground(Color.getHSBColor(hsb[0], hsb[1], hsb[2]));
    }

}