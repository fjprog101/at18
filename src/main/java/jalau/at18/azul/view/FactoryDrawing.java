package jalau.at18.azul.view;


import java.awt.*;

import javax.swing.JLabel;

public class FactoryDrawing extends JLabel {
    private static final int OVAL_WIDTH = 90;
    private static final int OVAL_HEIGHT = 130;

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.GRAY);
        g.fillOval(0, 0, OVAL_WIDTH, OVAL_HEIGHT);
    }
}
