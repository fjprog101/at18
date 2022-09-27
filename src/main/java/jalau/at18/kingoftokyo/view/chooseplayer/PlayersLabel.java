package jalau.at18.kingoftokyo.view.chooseplayer;

import javax.swing.*;
import java.awt.*;

public class PlayersLabel extends JLabel {
    private static final String FONT_NAME = "Serif";
    private static final int FONT_SIZE = 22;
    private static final int WIDTH = 100;
    private static final int HEIGHT = 200;

    public PlayersLabel() {
        super("Players: ");
        setFont(new Font(FONT_NAME, Font.PLAIN, FONT_SIZE));
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }
}
