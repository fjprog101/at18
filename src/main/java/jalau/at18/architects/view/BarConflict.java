package jalau.at18.architects.view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;

public class BarConflict extends JPanel {
    public static final int POS_X = 5;
    public static final int POS_Y = 5;
    public static final int WIDTH = 275;
    public static final int HEIGHT = 75;
    public static final int SPACE_SIZE = 2;
    public static final int COLOR1 = 255;
    public static final int COLOR2 = 245;
    public static final int COLOR3 = 230;
    private static final int FOUR = 4;
    private static final int SIX = 6;

    public BarConflict(int quantityOfPlayers) {
        initComponets();
        setBackground(new Color(COLOR1, COLOR2, COLOR3));
        loadTokens(quantityOfPlayers);
    }

    private void initComponets() {
        setLayout(new GridLayout(1, SIX));
    }

    private void loadTokens(int quantityOfPlayers) {
        setBorder(new EmptyBorder(SPACE_SIZE, 0, SPACE_SIZE, SPACE_SIZE));
        setBounds(POS_X, POS_Y, WIDTH, HEIGHT);
        JLabel peacetoken = new ConflictTokenLabel();
        JLabel peacetoken2 = new ConflictTokenLabel();
        JLabel peacetoken3 = new ConflictTokenLabel();
        JLabel peacetoken4 = new ConflictTokenLabel();
        switch (quantityOfPlayers) {
            case FOUR:
                add(peacetoken);
                add(peacetoken2);
                add(peacetoken3);
                add(peacetoken4);
            default:
                add(peacetoken);
                add(peacetoken2);
                add(peacetoken3);
        }
        setVisible(true);
    }
}
