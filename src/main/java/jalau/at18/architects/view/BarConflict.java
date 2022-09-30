package jalau.at18.architects.view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import jalau.at18.architects.model.RedCardForDeck;

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
    private JLabel peacetoken = new ConflictTokenLabel();
    private JLabel peacetoken2 = new ConflictTokenLabel();
    private JLabel peacetoken3 = new ConflictTokenLabel();
    private JLabel peacetoken4 = new ConflictTokenLabel();
    private JLabel wartoken = new ConflictTokenLabelWar();
    private JLabel wartoken2 = new ConflictTokenLabelWar();
    private JLabel wartoken3 = new ConflictTokenLabelWar();
    private JLabel wartoken4 = new ConflictTokenLabelWar();

    public BarConflict(int quantityOfPlayers) {
        initComponets();
        setBackground(new Color(COLOR1, COLOR2, COLOR3));
        loadTokens(quantityOfPlayers);
    }

    private void initComponets() {
        setLayout(new GridLayout(1, SIX));
    }

    private void loadTokens(int quantityOfPlayers) {
        setOpaque(false);
        setBorder(new EmptyBorder(SPACE_SIZE, 0, SPACE_SIZE, SPACE_SIZE));
        setBounds(60, 30, WIDTH, HEIGHT);
        // setBounds(POS_X, POS_Y, WIDTH, HEIGHT);
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

    public void updateView(RedCardForDeck redCardForDeck) {
        redCardForDeck.getCard();
        if (redCardForDeck.updateWarToken() == 1) {
            remove(peacetoken);
            add(wartoken);
            setVisible(true);
        } else if (redCardForDeck.updateWarToken() == 2) {
            remove(peacetoken);
            remove(peacetoken2);
            add(wartoken);
            add(wartoken2);
            setVisible(true);
        } else {
            setVisible(true);
        }
    }
}
