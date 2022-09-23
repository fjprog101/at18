package jalau.at18.architects.view;

import javax.swing.JFrame;

public class BoardFrame extends JFrame{
    public static final int DEFAULT_POS_X = 100;
    public static final int DEFAULT_POS_Y = 100;
    public static final int DEFAULT_SIZE = 700;
    public static final String WINDOW_NAME = "7 Wonders Architect";
    private MiddleDeck middleDeck;
    public BoardFrame() {
        initialize();
    }
    private void initialize() {
        middleDeck = new MiddleDeck();
        add(middleDeck);
        setTitle(WINDOW_NAME);
        setBounds(DEFAULT_POS_Y, DEFAULT_POS_Y, DEFAULT_SIZE, DEFAULT_SIZE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
    }
}
