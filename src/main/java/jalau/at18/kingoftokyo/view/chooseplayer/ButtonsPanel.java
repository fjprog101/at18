package jalau.at18.kingoftokyo.view.chooseplayer;

import jalau.at18.kingoftokyo.controller.ChoosePlayerController;
import jalau.at18.kingoftokyo.view.general.ExitButton;

import javax.swing.*;
import java.awt.*;

public class ButtonsPanel extends JPanel {

    private static final int ONE_HUNDRED = 100;
    private static final int THREE = 3;
    private static final int RED = 176;
    private static final int GREEN = 82;
    private static final int BLUE = 122;
    private ChoosePlayerController choosePlayerController;

    public ButtonsPanel(ChoosePlayersFrame frame, PlayersNumbersSpinner spinner) {
        setLayout(new FlowLayout());
        choosePlayerController = new ChoosePlayerController(frame, spinner);
        add(Box.createRigidArea(new Dimension(0, ONE_HUNDRED)));
        add(new ExitButton());
        add(Box.createRigidArea(new Dimension(ONE_HUNDRED, 0)));
        add(new NextButton(choosePlayerController));
        add(Box.createRigidArea(new Dimension(0, ONE_HUNDRED)));
        float[] hsb = new float[THREE];
        hsb = Color.RGBtoHSB(RED, GREEN, BLUE, hsb);
        setBackground(Color.getHSBColor(hsb[0], hsb[1], hsb[2]));
    }

}
