package jalau.at18.kingoftokyo.view.whoStartsTheGame;
import javax.swing.*;
import java.awt.*;
public class ShowResultsLabel extends JLabel {
    public static final int SIZE_FONT = 25;

    public ShowResultsLabel() {
        super("Who start is :");
        setFont(new Font("Times New Roman", Font.PLAIN, SIZE_FONT));
    }
}
