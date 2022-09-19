package jalau.at18.azul.view;

import javax.swing.JFrame;

public class AzulFrame extends JFrame {
    private static final int X_INITIAL_POSITION = 200;
    private static final int Y_INITIAL_POSITION = 10;
    private static final int WIDTH = 900;
    private static final int HEIGHT = 600;

    public AzulFrame() {
        add(new FactoryPanel());
        run();
    }

    public void run() {
        setLayout(null);
        setBounds(X_INITIAL_POSITION, Y_INITIAL_POSITION, WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("AZUL GAME");
        setVisible(true);
    }
}
