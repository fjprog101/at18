package jalau.at18.architects.view;
import javax.swing.JPanel;

import jalau.at18.architects.model.cards.BluePoints;

public class BluePointsView extends JPanel {
    private static final int WIDTH = 40;
    private static final int HEIGHT = 40;
    private static final int POSITION_X = 800;
    private static final int POSITION_Y = 450;
    private BluePointsNumber bluePointsNumber;
    public BluePointsView(BluePoints bluePoints) {
        setOpaque(false);
        setBounds(POSITION_X, POSITION_Y, WIDTH, HEIGHT);
        setLayout(null);
        bluePointsNumber =  new BluePointsNumber(bluePoints);
        initialize();
    }
    public void setNumber(int number) {
        bluePointsNumber.setNumber(number);
    }
    public void initialize() {
        add(bluePointsNumber);
        add(new BluePointsIcon());
    }
}
