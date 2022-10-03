package jalau.at18.architects.view;

import javax.swing.JPanel;

import jalau.at18.architects.model.cards.WarWinnerPoints;

public class WarWinnerPointsView extends JPanel {

    private static final int WIDTH = 40;
    private static final int HEIGHT = 40;
    private static final int POSITION_X = 700;
    private static final int POSITION_Y = 450;
    private WarWinnerNumber warWinnerNumber;
    public WarWinnerPointsView(WarWinnerPoints warWinnerPoints) {
        setOpaque(false);
        setBounds(POSITION_X, POSITION_Y, WIDTH, HEIGHT);
        setLayout(null);
        warWinnerNumber = new WarWinnerNumber(warWinnerPoints);
        initialize();
    }
    public void setNumber(int number) {
        warWinnerNumber.setNumber(number);
    }
    public void initialize() {
        add(warWinnerNumber);
        add(new WarWinnerIcon());
    }
}
