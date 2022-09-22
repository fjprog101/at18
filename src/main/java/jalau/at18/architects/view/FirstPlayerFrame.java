package jalau.at18.architects.view;

import javax.swing.JFrame;

import jalau.at18.architects.GrayCard;
import jalau.at18.architects.Resource;

public class FirstPlayerFrame extends JFrame {
    private static final int DEFAULT_POS = 60;
    private static final int DEFAULT_WIDTH = 750;
    private static final int DEFAULT_HEIGHT = 500;
    private GrayCard grayCard = new GrayCard(Resource.BRICK);

    public FirstPlayerFrame() {
        setResizable(false);
        initialize();
        add(new BarOfProgress(0));
        add(new Wonder("Wonder.png"));
        add(new ResourceFrame(grayCard));
    }

    private void initialize() {
        setBounds(DEFAULT_POS, DEFAULT_POS, DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
    }
}
