package jalau.at18.architects.view;
import static jalau.at18.architects.Constants.Button.*;
import javax.swing.JButton;
import java.awt.event.ActionListener;

public class StartButton extends JButton {

    public StartButton(ActionListener listener) {
        super(MESSAGE);
        setBounds(DEFAULT_POSX, DEFAULT_POSY, DEFAULT_WIDTH, DEFAULT_HEIGHT);
        addActionListener(listener);
    }
}
