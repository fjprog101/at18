package jalau.at18.kingoftokyo.view.whoStartsTheGame;

import javax.swing.*;
import java.awt.event.ActionListener;
public class ResultsButton extends JButton {

    public ResultsButton(ActionListener listener) {
        super("???");
        addActionListener(listener);
    }
}