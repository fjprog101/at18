package jalau.at18.architects.view;

import java.awt.*;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BoardFrame extends JFrame{
    public static final int DEFAULT_POS_X = 100;
    public static final int DEFAULT_POS_Y = 100;
    public static final int DEFAULT_SIZE_1 = 1000;
    public static final int DEFAULT_SIZE_2 = 600;
    public static final String WINDOW_NAME = "7 Wonders Architect";
    public String direction = "src/main/resources/architects/images/reverse.jpg";
    private MiddleDeck middleDeck;
    public BoardFrame() {
        initialize();
    }
    private void initialize() {
        middleDeck = new MiddleDeck();
        //add(middleDeck);
        JLabel mazo = new JLabel();
        mazo.setBounds(410, 10, 100, 150);
        ImageIcon image = new ImageIcon(direction);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(mazo.getWidth(), mazo.getHeight(), Image.SCALE_DEFAULT));
        mazo.setIcon(icon);
        add(mazo);
        repaint();
        setTitle(WINDOW_NAME);
        setBounds(DEFAULT_POS_Y, DEFAULT_POS_Y, DEFAULT_SIZE_1, DEFAULT_SIZE_2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(255, 245,230));
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);
    }
}
