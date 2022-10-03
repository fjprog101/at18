package jalau.at18.architects.view;

import java.awt.*;

import javax.swing.JPanel;

public class ResourcePanel extends JPanel {
    private static final int RESOURCE_POSITION_X = 80;
    private static final int RESOURCE_POSITION_Y = 500;
    private static final int RESOURCE_WIDTH = 400;
    private static final int RESOURCE_HEIGHT = 80;
    private static final int SIX = 6;

    public ResourcePanel() {
        initComponets();
    }

    private void initComponets() {
        setOpaque(false);
        setBounds(RESOURCE_POSITION_X, RESOURCE_POSITION_Y, RESOURCE_WIDTH, RESOURCE_HEIGHT);
        setBackground(Color.WHITE);
        setLayout(new GridLayout(1, SIX));
    }

    public void loadCards(ElementLabel elementLabel) {
        add(elementLabel);
        setVisible(true);
    }
}
