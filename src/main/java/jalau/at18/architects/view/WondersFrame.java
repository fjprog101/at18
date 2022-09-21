package jalau.at18.architects.view;
import static jalau.at18.architects.Constants.WonderFrame.*;
import javax.swing.JFrame;

public class WondersFrame extends JFrame {

    public WondersFrame() {

        initialize();
    }
    private void initialize() {
        setBounds(DEFAULT_POS, DEFAULT_POS, DEFAULT_SIZE, DEFAULT_SIZE);
        setTitle(WINDOW_NAME);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
    }
}
