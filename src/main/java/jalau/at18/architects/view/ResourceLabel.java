package jalau.at18.architects.view;

import java.awt.Component;

import javax.swing.JLabel;

public class ResourceLabel extends JLabel {
    private static final int POSITION_X = 75;
    private static final int POSITION_Y = 200;
    private static final int WIDTH = 50;
    private static final int HEIGHT = 10;

    public ResourceLabel(String resource) {
        super(resource);
        setBounds(POSITION_X, POSITION_Y, WIDTH, HEIGHT);
        setAlignmentX(Component.CENTER_ALIGNMENT);
        setVisible(true);
    }
}
