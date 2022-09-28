package jalau.at18.architects.view;
import javax.swing.JButton;
import java.awt.event.ActionListener;

public class AddStageButton extends JButton {
    private static final int POSX = 300;
    private static final int POSY = 400;
    private static final int WIDTH = 100;
    private static final int HEIGHT = 20;

    public AddStageButton(ActionListener listener) {
        super("Add stage");
        setBounds(POSX, POSY, WIDTH, HEIGHT);
        addActionListener(listener);

    }
}