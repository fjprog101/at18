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
        startButton = new StartButton(controller);
        choiceNumberPlayers = new ChoiceNumberPlayers(controller);
        startLabel = new StartLabel();
        add(startButton);
        add(choiceNumberPlayers);
        add(startLabel);
        setTitle(WINDOW_NAME);
        setBounds(DEFAULT_POS_Y, DEFAULT_POS_Y, DEFAULT_SIZE, DEFAULT_SIZE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
    }
    public void setLabels(String label) {
        startLabel.setNextJLabel(label);
    }
    public ChoiceNumberPlayers getChoice() {
        return choiceNumberPlayers;
    }
    public StartButton getButton() {
        return startButton;
    }
    public void addNewComponents() {
        add(new WonderStructure());
    }
}
