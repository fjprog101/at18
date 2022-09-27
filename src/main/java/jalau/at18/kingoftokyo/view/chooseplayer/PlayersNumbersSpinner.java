package jalau.at18.kingoftokyo.view.chooseplayer;

import javax.swing.*;
import java.awt.*;

public class PlayersNumbersSpinner extends JSpinner {
    private static final String FONT_NAME = "Serif";
    private static final int FONT_SIZE = 20;
    private static final int SIZE = 40;
    private static final int MINIMUM = 2;
    private static final int MAXIMUM = 4;
    private static final int ONE = 1;

    public PlayersNumbersSpinner() {
        super(new SpinnerNumberModel(MINIMUM,MINIMUM,MAXIMUM,ONE));
        setFont(new Font(FONT_NAME, Font.BOLD, FONT_SIZE));
        setPreferredSize(new Dimension(SIZE, SIZE));
    }
}
