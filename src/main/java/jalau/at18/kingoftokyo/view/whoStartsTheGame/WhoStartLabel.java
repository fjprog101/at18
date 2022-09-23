package jalau.at18.kingoftokyo.view.whoStartsTheGame;
import javax.swing.*;
import java.awt.*;
public class WhoStartLabel extends JLabel {
    public static final int SIZE_FONT = 25;

    public WhoStartLabel() {
        super("Start :");
        setFont(new Font("Times New Roman", Font.PLAIN, SIZE_FONT));
    }
}
