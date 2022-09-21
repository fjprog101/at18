package jalau.at18.kingoftokyo.view.choosesecondplayer;

import javax.swing.*;
import java.awt.event.ActionListener;

public class StartGameButton extends JButton {

    public StartGameButton(ActionListener listener) {
        super("Start");
        addActionListener(listener);
    }
}
