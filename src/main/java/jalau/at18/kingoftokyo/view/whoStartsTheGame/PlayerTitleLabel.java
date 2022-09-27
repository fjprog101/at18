package jalau.at18.kingoftokyo.view.whoStartsTheGame;
import javax.swing.*;
import java.awt.*;
public class PlayerTitleLabel extends JLabel { //title
    private static final int DEFAULT_LABEL_POSX = 650;
    private static final int DEFAULT_LABEL_POSY = 50;
    private static final int DEFAULT_LABEL_WIDTH = 350;
    private static final int DEFAULT_LABEL_HEIGHT = 50;

    public static final int SIZE_FONT = 30;

    public PlayerTitleLabel() {
        super("         Results of players       ");
        setBounds(DEFAULT_LABEL_POSX, DEFAULT_LABEL_POSY, DEFAULT_LABEL_WIDTH, DEFAULT_LABEL_HEIGHT);
        setFont(new Font("Times New Roman", Font.BOLD, SIZE_FONT));
    }
}