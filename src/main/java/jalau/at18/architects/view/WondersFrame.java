package jalau.at18.architects.view;
import static jalau.at18.architects.view.Constants.WonderFrame.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JTextField;
import jalau.at18.architects.controller.Controller;

public class WondersFrame extends JFrame {
    private StartButton startButton;
    private Controller controller;
    private StartLabel startLabel;
    private ChoiceNumberPlayers choiceNumberPlayers;
    private InputNames inputNames;
    private List<String> playersNames;
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
        setSize(DEFAULT_SIZE, DEFAULT_SIZE2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
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
    public void addNewComponents(int quantity) {
        inputNames = new InputNames(quantity);
        playersNames = new ArrayList<>();
        add(inputNames);
    }
    public void closeWindow() {
        this.dispose();
        new BoardFrame(this.getChoice().getSelectedItem().toString());
    }

    public void getTextField() {
        for (int ind = 0; ind < inputNames.getComponentCount(); ind++) {
            if (inputNames.getComponent(ind).getClass().equals(JTextField.class)) {
                JTextField textField = (JTextField) inputNames.getComponent(ind);
                playersNames.add(textField.getText());
            }
        }
        System.out.println(playersNames);
    }
}
