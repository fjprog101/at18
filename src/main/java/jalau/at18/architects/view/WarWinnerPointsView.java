package jalau.at18.architects.view;

import java.awt.Color;
import javax.swing.JPanel;
import jalau.at18.architects.WarWinnerPoints;

public class WarWinnerPointsView extends JPanel {

    private static final int WIDTH = 150;
    private static final int HEIGHT = 150;
    private static final int POSITION = 20;

    public WarWinnerPointsView(WarWinnerPoints warwinnerpoints) {
        setBackground(Color.WHITE);
        setBounds(POSITION, POSITION, WIDTH, HEIGHT);
        setLayout(null);
        add(new WarWinnerIcon());
        add(new WarWinnerNumber(warwinnerpoints.getPoints()));
    }
}
