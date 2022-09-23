package jalau.at18.architects.view;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import static jalau.at18.architects.view.Constants.Label.*;
public class StartLabel extends JPanel {
    private JLabel labelWelcome;
    private JLabel nextJLabel;
    public StartLabel() {
        labelWelcome = new JLabel(MESSAGE);
        setBounds(POS_X_LABEL, POS_Y_LABEL, WIDTH_LABEL, HEIGHT_LABEL);
        labelWelcome.setFont(new Font("Serif", Font.PLAIN, SIZE_FONT));
        add(labelWelcome);
        nextJLabel = new JLabel(MESSAGE2);
        setBounds(POS_X_LABEL2, POS_Y_LABEL2, WIDTH_LABEL, HEIGHT_LABEL);
        nextJLabel.setFont(new Font("Serif", Font.PLAIN, SIZE_FONT_LABEL2));
        add(nextJLabel);
    }
    public void setNextJLabel(String newLabel) {
        nextJLabel.setText(newLabel);
    }
}
