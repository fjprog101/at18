package jalau.at18.azul.view;
import javax.swing.*;
import static jalau.at18.azul.view.Dimensions.AzulFrame.*;

public class AzulFrame extends JFrame {
    private StackButtonGroup stack;
    private PlayerPanel player1;
    private PlayerPanel player2;

    public AzulFrame() {
        stack = new StackButtonGroup(INITIAL_POSITION_AZUL_FRAME);
        player1 = new PlayerPanel(PLAYER1_AZUL_FRAME, PLAYER1_Y_POSITION_AZUL_FRAME, stack);
        player2 = new PlayerPanel(PLAYER2_AZUL_FRAME, PLAYER2_Y_POSITION_AZUL_FRAME, stack);
        initialize();
    }

    public void initialize() {
        add(player1);
        add(player2);
        add(stack);
        add(new FactoryPanel(stack, player1, player2));
        setLayout(null);
        setBounds(INITIAL_POSITION_AZUL_FRAME, INITIAL_POSITION_AZUL_FRAME, WIDTH_AZUL_FRAME, HEIGHT_AZUL_FRAME);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("AZUL GAME");
        setVisible(true);
    }
}
