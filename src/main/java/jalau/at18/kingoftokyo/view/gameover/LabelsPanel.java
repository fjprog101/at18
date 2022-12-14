package jalau.at18.kingoftokyo.view.gameover;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.*;

public class LabelsPanel extends JPanel {
    private static final int DEFAULT_WIDTH = 600;
    private static final int DEFAULT_HEIGHT = 100;
    private static final String FONT_NAME = "Serif";
    private static final int FONT_SIZE_GAME = 45;
    private static final int FONT_SIZE_THANKS = 20;
    private static final int THREE = 3;
    private static final int RED = 176;
    private static final int GREEN = 82;
    private static final int BLUE = 122;

    public LabelsPanel() {
        setBounds(0, 0, DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        JLabel gameOverLabel = new JLabel("GAME OVER");
        add(gameOverLabel);
        gameOverLabel.setSize(DEFAULT_WIDTH, FONT_SIZE_GAME);
        gameOverLabel.setFont(new Font(FONT_NAME, Font.BOLD, FONT_SIZE_GAME));
        gameOverLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        JLabel thanksLabel = new JLabel("Thanks for playing");
        add(thanksLabel);
        thanksLabel.setSize(DEFAULT_WIDTH, FONT_SIZE_THANKS);
        thanksLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        thanksLabel.setFont(new Font(FONT_NAME, Font.BOLD, FONT_SIZE_THANKS));
        float[] hsb = new float[THREE];
        hsb = Color.RGBtoHSB(RED, GREEN, BLUE, hsb);
        setBackground(Color.getHSBColor(hsb[0], hsb[1], hsb[2]));
    }
}
