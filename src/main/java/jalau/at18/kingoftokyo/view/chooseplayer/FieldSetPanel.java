package jalau.at18.kingoftokyo.view.chooseplayer;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class FieldSetPanel extends JPanel {

    private static final String TITLE = "Number of Players";
    private static final String NAME = "Serif";
    private static final int SIZE = 22;
    private static final int THREE = 3;
    private static final int RED = 176;
    private static final int GREEN = 82;
    private static final int BLUE = 122;
    private PlayersNumbersSpinner spinner;

    public FieldSetPanel() {
        initialize();
        setLayout(new FlowLayout());
        add(new PlayersLabel());
        spinner = new PlayersNumbersSpinner();
        add(spinner);
        float[] hsb = new float[THREE];
        hsb = Color.RGBtoHSB(RED, GREEN, BLUE, hsb);
        setBackground(Color.getHSBColor(hsb[0], hsb[1], hsb[2]));
    }

    private void initialize() {
        Font font = new Font(NAME, Font.BOLD, SIZE);
        setBorder(BorderFactory.createTitledBorder(null, TITLE, TitledBorder.LEFT, 0, font));
    }

    public PlayersNumbersSpinner getSpinner() {
        return spinner;
    }
}
