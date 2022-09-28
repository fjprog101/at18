package jalau.at18.kingoftokyo.view.whostart;

import javax.swing.*;
import java.awt.*;

public class PlayerNameLabel extends JLabel {
    private String playername;
    public static final int SIZE_FONT = 15;
    public PlayerNameLabel(String playername) {
        super(playername);
        this.playername = playername;
        setFont(new Font("Times New Roman", Font.PLAIN, SIZE_FONT));
    }

    public void setPlayerName(int cantPunching) {
        setText(" * " + playername + " punching amount  =  " + cantPunching);
        setFont(new Font("Times New Roman", Font.CENTER_BASELINE, SIZE_FONT));
        setVisible(true);
    }
}