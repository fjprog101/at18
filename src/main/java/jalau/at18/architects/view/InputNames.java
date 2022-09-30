package jalau.at18.architects.view;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InputNames extends JPanel {
    private int quantity;
    private JLabel message;
    public static final int POSX = 300;
    public static final int POSY = 400;
    public static final int WIDTH = 200;
    public static final int HEIGHT = 100;
    public InputNames(int quantity) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.quantity = quantity;
        message = new JLabel("Enter player names");
        setBounds(POSX, POSY, WIDTH, HEIGHT);
        add(message);
        generateTextInputFields();
    }
    public void generateTextInputFields() {
        for (int ind = 0; ind < quantity; ind++) {
            String name = "Player Name " + (ind + 1);
            add(new JTextField(name));
        }
    }
}
