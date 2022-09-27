package jalau.at18.kingoftokyo.view.chooseplayer;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class FieldSetPanel extends JPanel {

    private static final String TITLE = "Number of Players";
    private static final String NAME = "Serif";
    private static final int SIZE = 22;

    public FieldSetPanel() {
        initialize();
        setLayout(new FlowLayout());
        add(new PlayersLabel());
        add(new PlayersNumbersSpinner());
        setBackground(Color.RED);
    }

    private void initialize() {
        Font font = new Font(NAME, Font.BOLD, SIZE);
        setBorder(BorderFactory.createTitledBorder(null,TITLE, TitledBorder.LEFT,0, font));
    }
}
