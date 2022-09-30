package jalau.at18.kingoftokyo.view;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

import jalau.at18.kingoftokyo.view.chooseplayer.ChoosePlayersFrame;

import java.awt.Component;
import java.awt.Dimension;

public class ButtonsPanel extends JPanel {
    private static final int DEFAULT_POSY = 100;
    private static final int DEFAULT_WIDTH = 600;
    private static final int DEFAULT_HEIGHT = 100;
    private static final int EDGE_SPACE = 100;

    public ButtonsPanel() {
        setAlignmentX(Component.CENTER_ALIGNMENT);
        setBounds(0, DEFAULT_POSY, DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
        JButton playAgainButton = new JButton(" Play again ");
        JButton exitButton = new JButton("   Exit   ");
        add(Box.createRigidArea(new Dimension(EDGE_SPACE, 0)));
        add(playAgainButton);
        add(Box.createRigidArea(new Dimension(EDGE_SPACE, 0)));
        add(exitButton);
        playAgainButton.addActionListener(e -> playAgain());
        exitButton.addActionListener(e -> exitGame());
    }

    private void exitGame() {
        System.exit(0);
    }

    private void playAgain() {
        new ChoosePlayersFrame();
    }

}
