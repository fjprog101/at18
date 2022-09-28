package jalau.at18.kingoftokyo.view.general;

import javax.swing.*;
import java.awt.*;

public class MonsterLabel extends JLabel {
    private static final String FONT_NAME = "Serif";
    private static final int FONT_SIZE = 18;
    public MonsterLabel() {
        super("Monster: ");
        setFont(new Font(FONT_NAME, Font.BOLD, FONT_SIZE));
    }
}

