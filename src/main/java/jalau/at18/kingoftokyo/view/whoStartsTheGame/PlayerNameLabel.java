package jalau.at18.kingoftokyo.view.whoStartsTheGame;

import javax.swing.JLabel;
import javax.swing.*;
import java.awt.*;

public class PlayerNameLabel extends JLabel {
    private String playername;
    public static final int SIZE_FONT = 15;
    public PlayerNameLabel(String playername) { //primer player
        super(playername);
        this.playername = playername; //guardar
        setFont(new Font("Times New Roman", Font.PLAIN, SIZE_FONT));
    }

    public void setPlayerName(int cantPunching) { //
        setText(" * " + playername + " punching amount  =  " + cantPunching);
        setFont(new Font("Times New Roman", Font.CENTER_BASELINE, SIZE_FONT));
        setVisible(true);
    }
}