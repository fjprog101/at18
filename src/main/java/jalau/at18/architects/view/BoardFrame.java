package jalau.at18.architects.view;

import java.awt.*;
import javax.swing.JFrame;

public class BoardFrame extends JFrame {
    public static final int WIDTH = 1000;
    public static final int HEIGHT = 600;
    public static final String WINDOW_NAME = "7 Wonders Architect";
    public static final int COLOR1 = 255;
    public static final int COLOR2 = 245;
    public static final int COLOR3 = 230;
    private MiddleDeck middleDeck;
    public BoardFrame() {
        initialize();
    }
    private void initialize() {
        middleDeck = new MiddleDeck();
        add(middleDeck);
        setTitle(WINDOW_NAME);
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(COLOR1, COLOR2, COLOR3));
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);
    }
}
