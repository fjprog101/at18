package jalau.at18.war.view;

import javax.swing.JButton;

public class RollerButton extends JButton {

    public static final int DEFAULT_POSX = 50;
    public static final int DEFAULT_POSY = 50;
    public static final int DEFAULT_WIDTH = 75;
    public static final int DEFAULT_HEIGHT = 20;

    public RollerButton() {
        super("Roll!");
        setBounds(DEFAULT_POSX, DEFAULT_POSY, DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}
