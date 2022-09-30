package jalau.at18.kingoftokyo.view;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Component;
import java.awt.Font;

public class LabelsPanel extends JPanel{
    private static final int DEFAULT_WIDTH = 500;
    private static final int DEFAULT_HEIGHT = 100;
    private static final String FONT_NAME = "Serif";
    private static final int FONT_SIZE_GAME = 45;
    private static final int FONT_SIZE_THANKS = 20;

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
    }

}
