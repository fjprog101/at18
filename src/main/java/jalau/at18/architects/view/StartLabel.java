package jalau.at18.architects.view;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Font;
import static jalau.at18.architects.Constants.Label.*;
public class StartLabel extends JPanel {
    public static final int WIDTH = 500;
    public static final int HEIGHT = 100;
    private JLabel labelWelcome;
    private JLabel nextJLabel;
    public StartLabel() {
        labelWelcome = new JLabel(MESSAGE);
        setBounds(POS_X, POS_Y, WIDTH, HEIGHT);
        labelWelcome.setFont(new Font("Serif", Font.PLAIN, SIZE_FONT));
        add(labelWelcome);
        nextJLabel = new JLabel(MESSAGE2);
        setBounds(POS_X_LABEL2, POS_Y_LABEL2, WIDTH, HEIGHT);
        nextJLabel.setFont(new Font("Serif", Font.PLAIN, SIZE_FONT_LABEL2));
        add(nextJLabel);
    }

}
