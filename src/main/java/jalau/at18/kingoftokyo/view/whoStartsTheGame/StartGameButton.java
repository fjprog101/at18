package jalau.at18.kingoftokyo.view.whoStartsTheGame;
import javax.swing.*;
import java.awt.event.ActionListener;

public class StartGameButton extends JButton {

    public StartGameButton(ActionListener listener) {
        super("Start Game");
        addActionListener(listener);
    }
}