package jalau.at18.kingoftokyo.view.choosesecondplayer;

import javax.swing.*;
import java.awt.*;

public class CenterPanel extends JPanel {

    private static final int DEFAULT_WIDTH = 100;
    private static final int DEFAULT_HEIGHT = 100;

    public CenterPanel() {
        FieldSetPanel fieldSetPanel = new FieldSetPanel();
        ButtonsPanel buttonsPanel = new ButtonsPanel();
        initialize();
        add(fieldSetPanel, BorderLayout.CENTER);
        add(buttonsPanel, BorderLayout.SOUTH);
    }

    private void initialize() {
        setPreferredSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
        setLayout(new BorderLayout());
    }
}
