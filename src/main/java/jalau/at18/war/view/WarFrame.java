package jalau.at18.war.view;

import javax.swing.JFrame;

import jalau.at18.war.controller.WarFrameController;
import jalau.at18.war.model.Game;

public class WarFrame extends JFrame {

    private static final int DEFAULT_POS = 100;
    private static final int DEFAULT_SIZE = 300;

    // UI components
    private RollerButton rollerButton;
    private DiceLabelGroup diceLabelGroup;

    // Controller
    private WarFrameController gameController;

    public WarFrame() {
        // Initialize controller with reference to this ui frame
        // so that controller can update the frame components
        gameController = new WarFrameController(this, new Game());
        initialize();
    }

    public DiceLabelGroup getDiceLabelGroup() {
        return this.diceLabelGroup;
    }

    private void initialize() {
        // Add components
        rollerButton = new RollerButton(gameController);
        diceLabelGroup = new DiceLabelGroup();
        add(rollerButton);
        add(diceLabelGroup);

        // Configure frame
        setBounds(DEFAULT_POS, DEFAULT_POS, DEFAULT_SIZE, DEFAULT_SIZE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
    }
}
