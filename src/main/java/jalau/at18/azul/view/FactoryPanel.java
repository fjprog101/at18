package jalau.at18.azul.view;

import javax.swing.JPanel;
import java.awt.*;

public class FactoryPanel extends JPanel {
    private static final int X_INITIAL_POSITION = 610;
    private static final int Y_INITIAL_POSITION = 20;
    private static final int WIDTH = 300;
    private static final int HEIGHT = 600;
    private static final int NUMBER_OF_FACTORIES = 5;
    private static final int ROWS = 3;
    private static final int COLS = 600;


    public FactoryPanel() {
        setLayout(new GridLayout(ROWS, COLS));
        setBounds(X_INITIAL_POSITION, Y_INITIAL_POSITION, WIDTH, HEIGHT);
        addFactories();
    }

    public void addFactories() {
        for (int index = 0; index < NUMBER_OF_FACTORIES; index++) {
            add(new FactoryDrawing());
        }
    }

}
