package jalau.at18.kingoftokyo.view.gameover;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

import jalau.at18.kingoftokyo.view.chooseplayer.ChoosePlayersFrame;

import java.awt.*;

public class ButtonsPanel extends JPanel {
    private static final int DEFAULT_POSY = 100;
    private static final int DEFAULT_WIDTH = 600;
    private static final int DEFAULT_HEIGHT = 100;
    private static final int EDGE_SPACE = 130;
    private static final int THREE = 3;
    private static final int RED = 176;
    private static final int GREEN = 82;
    private static final int BLUE = 122;
    private static final int RED_BUTTON = 249;
    private static final int GREEN_BUTTON = 156;
    private static final int BLUE_BUTTON = 0;

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
        float[] hsb = new float[THREE];
        hsb = Color.RGBtoHSB(RED, GREEN, BLUE, hsb);
        setBackground(Color.getHSBColor(hsb[0], hsb[1], hsb[2]));
        float[] hsbButton = new float[THREE];
        hsbButton = Color.RGBtoHSB(RED_BUTTON, GREEN_BUTTON, BLUE_BUTTON, hsbButton);
        playAgainButton.setBackground(Color.getHSBColor(hsbButton[0], hsbButton[1], hsbButton[2]));
        exitButton.setBackground(Color.getHSBColor(hsbButton[0], hsbButton[1], hsbButton[2]));
    }

    private void exitGame() {
        System.exit(0);
    }

    private void playAgain() {
        new ChoosePlayersFrame();
    }

}
