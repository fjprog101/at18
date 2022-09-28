package jalau.at18.kingoftokyo.view.rolldicesection;

import jalau.at18.kingoftokyo.controller.PlayerStatusController;
import jalau.at18.kingoftokyo.view.RollerButton;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class KeepDiceSectionUI extends JPanel {
    private static final int QUANTITY_DICES = 6;
    private JLabel displayResult = new JLabel();
    private RollerButton rollerButton;
    private List<DiceFaceLabel> listKeepDiceFaceLabel = new ArrayList<>();
    private PlayerStatusController playerController;

    public KeepDiceSectionUI(PlayerStatusController playerController) {
        this.playerController = playerController;
        initializeDice();
        setBorder(new LineBorder(Color.GREEN, 1));
    }

    public void initializeDice() {
        JPanel panelKeepDice = new JPanel();
        add(panelKeepDice);
        rollerButton = new RollerButton();
        add(rollerButton);
        //first time to create the 6 labels to KeepFace
        for (int index = 1; index <= QUANTITY_DICES; index++) {
            DiceFaceLabel diceFaceLabel = new DiceFaceLabel();
            panelKeepDice.add(diceFaceLabel);
            listKeepDiceFaceLabel.add(diceFaceLabel);
        }
        add(displayResult);
    }

    public RollerButton getRollerButton() {
        return rollerButton;
    }

    public JLabel getDisplayResult() {
        return displayResult;
    }

    public List<DiceFaceLabel> getListKeepDiceFaceLabel() {
        return listKeepDiceFaceLabel;
    }

    public void sendResults(int[] effect) {
        playerController.setPlayersStatus(effect);
    }
}
