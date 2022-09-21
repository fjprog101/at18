package jalau.at18.azul.view;


import java.awt.*;
import javax.swing.JLabel;

public class FactoryLabel extends JLabel {
    private static final int OVAL_WIDTH = 100;
    private static final int OVAL_HEIGHT = 150;

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.GRAY);
        g.fillOval(0, 0, OVAL_WIDTH, OVAL_HEIGHT);
    }

}

