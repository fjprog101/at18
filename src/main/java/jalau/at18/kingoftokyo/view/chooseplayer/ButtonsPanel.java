package jalau.at18.kingoftokyo.view.chooseplayer;

import jalau.at18.kingoftokyo.controller.ChoosePlayerController;
import jalau.at18.kingoftokyo.view.general.ExitButton;

import javax.swing.*;
import java.awt.*;

public class ButtonsPanel extends JPanel {

    private static final int ONE_HUNDRED = 100;
    private ChoosePlayerController choosePlayerController;
    public ButtonsPanel(ChoosePlayersFrame frame, PlayersNumbersSpinner spinner) {
        setLayout(new FlowLayout());
        choosePlayerController = new ChoosePlayerController(frame, spinner);
        add(Box.createRigidArea(new Dimension(0, ONE_HUNDRED)));
        add(new ExitButton());
        add(Box.createRigidArea(new Dimension(ONE_HUNDRED, 0)));
        add(new NextButton(choosePlayerController));
        add(Box.createRigidArea(new Dimension(0, ONE_HUNDRED)));
        setBackground(Color.BLUE);
    }

}
