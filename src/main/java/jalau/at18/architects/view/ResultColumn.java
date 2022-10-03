package jalau.at18.architects.view;

import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class ResultColumn extends JPanel {
    private static final int SIENCE_POSITION_X = 130;
    private static final int SIENCE_POSITION_Y = 160;
    private static final int SIENCE_WIDTH = 480;
    private static final int SIENCE_HEIGHT = 80;

    private static final int POSITION_X = 0;
    private static final int POSITION_Y = 0;
    private static final int WIDTH = 80;
    private static final int HEIGHT = 80;
    private static final int FONT_SIZE_L = 20;
    private static final int FONT_STYLE_L = 10;

    public ResultColumn(int glory, int victory, int wonder, int cat, int sum, int posY) {
        int pos = 0;
        setOpaque(false);
        setBounds(SIENCE_POSITION_X, (SIENCE_POSITION_Y + posY), SIENCE_WIDTH, SIENCE_HEIGHT);
        setLayout(null);
        add(elementLabel(glory, pos++));
        add(elementLabel(victory, pos++));
        add(elementLabel(wonder, pos++));
        add(elementLabel(cat, pos++));
        add(elementLabel(sum, pos++));
    }

    public JLabel elementLabel(int text, int size) {
        JLabel puntaje = new JLabel();
        puntaje.setText("" + text);
        puntaje.setBounds(((POSITION_X + HEIGHT) * size), POSITION_Y, WIDTH, HEIGHT);
        puntaje.setHorizontalAlignment(SwingConstants.CENTER);
        puntaje.setVerticalAlignment(SwingConstants.CENTER);
        puntaje.setBorder(BorderFactory.createLineBorder(Color.black));
        puntaje.setFont(new Font("Arial Black", FONT_STYLE_L, FONT_SIZE_L));
        puntaje.setForeground(Color.BLACK);
        puntaje.setVisible(true);
        return puntaje;
    }
}
