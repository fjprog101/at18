package jalau.at18.kingoftokyo.view.card;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

import java.awt.*;

public class CardButtonsGroupPanel extends JPanel {
    private static final int[] SIZE = {700, 30};
    private static final int[] POS = {750, 410};
    private static final int BUTTONS_SEPARATION = 105;

    public CardButtonsGroupPanel() {
        setBounds(POS[0], POS[1], SIZE[0], SIZE[1]);
        setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
        add(new BuyCardButton());
        add(Box.createRigidArea(new Dimension(BUTTONS_SEPARATION, 0)));
        add(new BuyCardButton());
        add(Box.createRigidArea(new Dimension(BUTTONS_SEPARATION, 0)));
        add(new BuyCardButton());
    }
}
