package jalau.at18.architects.view;

import javax.swing.JPanel;

import jalau.at18.architects.model.cards.WarWinnerPoints;

public class WarWinnerPointsView extends JPanel {

    private static final int WIDTH = 40;
    private static final int HEIGHT = 40;
    private static final int POSITION_X = 700;
    private static final int POSITION_Y = 450;

    public WarWinnerPointsView(WarWinnerPoints warWinnerPoints) {
        setOpaque(false);
        setBounds(POSITION_X, POSITION_Y, WIDTH, HEIGHT);
        setLayout(null);
        add(new WarWinnerNumber(warWinnerPoints));
        add(new WarWinnerIcon());
    }
}
