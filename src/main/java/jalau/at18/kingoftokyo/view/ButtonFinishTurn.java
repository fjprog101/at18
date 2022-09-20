package jalau.at18.kingoftokyo.view;
import javax.swing.*;

public class ButtonFinishTurn extends JButton {
    private static final int BUTTON_POS_X = 900;
    private static final int BUTTON_POS_Y = 600;
    private static final int BUTTON_POS_WIDTH = 120;
    private static final int BUTTON_POS_HEIGHT = 20;

    public ButtonFinishTurn() {
        super("Finish Turn");
        setBounds(BUTTON_POS_X, BUTTON_POS_Y, BUTTON_POS_WIDTH, BUTTON_POS_HEIGHT);
    }

}
