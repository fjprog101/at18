package jalau.at18.architects.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Component;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class IcoColumn extends JPanel {
    private static final int SIENCE_POSITION_X = 130;
    private static final int SIENCE_POSITION_Y = 80;
    private static final int SIENCE_WIDTH = 480;
    private static final int SIENCE_HEIGHT = 80;

    private static final int POSITION_X = 0;
    private static final int POSITION_Y = 0;
    private static final int WIDTH = 80;
    private static final int HEIGHT = 80;

    public IcoColumn() {
        int pos = 0;
        setOpaque(false);
        // setForeground(Color.BLACK);
        setBounds(SIENCE_POSITION_X, SIENCE_POSITION_Y, SIENCE_WIDTH, SIENCE_HEIGHT);
        setLayout(null);
        add(elementLabel("a.png", pos++));
        add(elementLabel("esc.png", pos++));
        add(elementLabel("stage.png", pos++));
        add(elementLabel("cat.png", pos++));
        add(elementLabel("sum.png", pos++));

    }

    public JLabel elementLabel(String text, int size) {
        JLabel puntaje = new JLabel();
        puntaje.setBounds(((POSITION_X + HEIGHT) * size), POSITION_Y, WIDTH, HEIGHT);
        ImageIcon image = new ImageIcon("src/main/resources/architects/icons/" + text);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(WIDTH, HEIGHT, WIDTH));
        puntaje.setIcon(icon);
        puntaje.setAlignmentX(Component.CENTER_ALIGNMENT);
        puntaje.setVisible(true);
        return puntaje;
    }
}
