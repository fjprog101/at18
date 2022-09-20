package jalau.at18.war.view;

import javax.swing.JFrame;

public class WarFrame extends JFrame {

    private static final int DEFAULT_POS = 100;
    private static final int DEFAULT_SIZE = 300;

    public WarFrame() {
        add(new RollerButton());
        add(new DieLabel());
        initialize();
    }

    private void initialize() {
        setBounds(DEFAULT_POS, DEFAULT_POS, DEFAULT_SIZE, DEFAULT_SIZE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
    }
}
