package jalau.at18.kingoftokyo.view.chooseplayer;

import javax.swing.*;
import java.awt.*;

public class FieldSetPanel extends JPanel {

    public FieldSetPanel() {
        add(new PlayersLabel());
        add(new PlayersNumbersSpinner());
        setBackground(Color.RED);
        initialize();
    }

    private void initialize() {
        setBorder(BorderFactory.createTitledBorder("Number of Players"));
        setPreferredSize(new Dimension(100,300));
    }
}
