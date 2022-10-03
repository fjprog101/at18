package jalau.at18.kingoftokyo.view.whostart;
import javax.swing.*;
import java.awt.*;
public class PlayerTitleLabel extends JLabel {

    private static final int DEFAULT_LABEL_WIDTH = 1000;
    private static final int DEFAULT_LABEL_HEIGHT = 80;

    public static final int SIZE_FONT = 15;

    public PlayerTitleLabel() {
        super("                                                                                                          ");
        setFont(new Font("Times New Roman", Font.BOLD, SIZE_FONT));
        setPreferredSize(new Dimension(DEFAULT_LABEL_WIDTH, DEFAULT_LABEL_HEIGHT));
        setAlignmentX(Component.LEFT_ALIGNMENT);
    }
}