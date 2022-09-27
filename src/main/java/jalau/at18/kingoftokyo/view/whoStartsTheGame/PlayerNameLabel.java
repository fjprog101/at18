package jalau.at18.kingoftokyo.view.whoStartsTheGame;

import javax.swing.JLabel;

public class PlayerNameLabel extends JLabel {
    private String playername;

    public PlayerNameLabel(String playername) { //primer player
        super("Player : " + playername);
        this.playername = playername; //guardar
        setVisible(true);
    }

    public void setPlayerName(int cantPunching) { //
        setText("Player : " + playername + " punching amount = " + cantPunching);
    }
}