package jalau.at18.architects.view;
import static jalau.at18.architects.Constants.WonderFrame.*;
import javax.swing.JFrame;
import jalau.at18.architects.controller.Controller;

public class WondersFrame extends JFrame {
    private StartButton startButton;
    private Controller controller;
    private StartLabel startLabel;
    private ChoiceNumberPlayers choiceNumberPlayers;
    public WondersFrame() {
        controller = new Controller(this);
        initialize();
    }
    private void initialize() {
        startLabel = new StartLabel();
        startButton = new StartButton(controller);
        choiceNumberPlayers = new ChoiceNumberPlayers();
        add(startButton);
        add(startLabel);
        add(choiceNumberPlayers);
        setTitle(WINDOW_NAME);
        setBounds(DEFAULT_POS, DEFAULT_POS, DEFAULT_SIZE, DEFAULT_SIZE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
    }
}
