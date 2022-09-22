package jalau.at18.kingoftokyo.view.whoStartsTheGame;

import javax.swing.*;
import java.awt.*;

public class DiceFaceLabel extends JLabel {
    public static final int SIZE_FONT = 25;

    public DiceFaceLabel(String text, int posX, int posY, int width, int height) {
        super(text);
        setBounds(posX, posY, width, height);
        setFont(new Font("Times New Roman", Font.PLAIN, SIZE_FONT));
    }
}
