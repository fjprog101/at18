package jalau.at18.kingoftokyo.view.chooseplayer;

import jalau.at18.kingoftokyo.view.chooseplayer.ButtonsPanel;
import jalau.at18.kingoftokyo.view.chooseplayer.FieldSetPanel;

import javax.swing.*;
import java.awt.*;

public class CenterPanel extends JPanel {

    public CenterPanel() {
        FieldSetPanel fieldSetPanel = new FieldSetPanel();
        ButtonsPanel buttonsPanel = new ButtonsPanel();
        initialize();
        add(fieldSetPanel, BorderLayout.CENTER);
        add(buttonsPanel, BorderLayout.SOUTH);
    }

    private void initialize() {
        setPreferredSize(new Dimension(100,100));
        setLayout(new BorderLayout());
    }
}
