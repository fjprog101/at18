package jalau.at18.kingoftokyo.view.chooseplayer;

import javax.swing.*;
import java.awt.*;

public class FieldSetPanel extends JPanel {

    private static final int DEFAULT_WIDTH = 100;
    private static final int DEFAULT_HEIGHT = 300;

    public FieldSetPanel() {
        add(new PlayersLabel());
        add(new PlayersNumbersSpinner());
        setBackground(Color.RED);
        initialize();
    }

    private void initialize() {
        setBorder(BorderFactory.createTitledBorder("Number of Players"));
        setPreferredSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
    }
}
