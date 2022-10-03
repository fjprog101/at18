package jalau.at18.kingoftokyo.view.whostart;

import javax.swing.*;
import java.awt.*;

public class PlayerNameLabel extends JLabel {
    private static final int DEFAULT_LABEL_WIDTH = 150;
    private static final int DEFAULT_LABEL_HEIGHT = 80;
    private String playername;
    public static final int SIZE_FONT = 18;
    public PlayerNameLabel(String playername) {
        super(playername);
        this.playername = playername;
        setFont(new Font("Times New Roman", Font.PLAIN, SIZE_FONT));
        setPreferredSize(new Dimension(DEFAULT_LABEL_WIDTH, DEFAULT_LABEL_HEIGHT));
        setAlignmentX(Component.LEFT_ALIGNMENT);
    }

    public void setPlayerName(int cantPunching) {
        setText(" * " + playername + " punching amount  =  " + cantPunching);
        setFont(new Font("Times New Roman", Font.CENTER_BASELINE, SIZE_FONT));
        setVisible(true);
    }
}