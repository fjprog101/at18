package jalau.at18.architects.view;

import java.awt.*;
import javax.swing.JPanel;

public class SciencePanel extends JPanel {
    private static final int SIENCE_POSITION_X = 80;
    private static final int SIENCE_POSITION_Y = 600;
    private static final int SIENCE_WIDTH = 400;
    private static final int SIENCE_HEIGHT = 80;
    private static final int SIX = 6;

    public SciencePanel() {
        initComponets();
    }

    private void initComponets() {
        setOpaque(false);
        setBounds(SIENCE_POSITION_X, SIENCE_POSITION_Y, SIENCE_WIDTH, SIENCE_HEIGHT);
        setBackground(Color.WHITE);
        setLayout(new GridLayout(1, SIX));
    }

    public void loadCards(ElementLabel elementLabel) {
        add(elementLabel);
        setVisible(true);
    }
}
