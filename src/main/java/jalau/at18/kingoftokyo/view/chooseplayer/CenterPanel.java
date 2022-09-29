package jalau.at18.kingoftokyo.view.chooseplayer;

import javax.swing.*;
import java.awt.*;

public class CenterPanel extends JPanel {

    public CenterPanel(ChoosePlayersFrame frame) {
        FieldSetPanel fieldSetPanel = new FieldSetPanel();
        ButtonsPanel buttonsPanel = new ButtonsPanel(frame, fieldSetPanel.getSpinner());
        initialize();
        add(fieldSetPanel, BorderLayout.CENTER);
        add(buttonsPanel, BorderLayout.SOUTH);
    }

    private void initialize() {
        setLayout(new BorderLayout());
    }
}
