package jalau.at18.architects.view;
import java.awt.*;
import javax.swing.*;
import static jalau.at18.architects.view.Constants.WonderStructure.*;
class WonderStructure extends JPanel {
    public static final int HEIGHT = 100;
    public static final int MIDDLE = 50;
    public static final int TRIANGLE_TIPS = 3;
    WonderStructure() {
        setBounds(DEFAULT_POSX, DEFAULT_POSY, DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
    public void paintComponent(Graphics g) {
        int[] xPos = {MIDDLE, HEIGHT, 0};
        int[] yPos = {0, HEIGHT, HEIGHT};
        g.drawPolygon(xPos, yPos, TRIANGLE_TIPS);
    }
}
