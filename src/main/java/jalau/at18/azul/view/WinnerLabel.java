package jalau.at18.azul.view;
import javax.swing.JLabel;
public class WinnerLabel extends JLabel {
    public WinnerLabel(int player) {
        super("The winner is: " + player);
    }

    public void updateLabel(int player) {
        this.setText("The winner is: " + player);
    }
}
