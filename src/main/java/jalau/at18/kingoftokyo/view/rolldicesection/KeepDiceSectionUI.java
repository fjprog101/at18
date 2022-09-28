package jalau.at18.kingoftokyo.view.rolldicesection;

import jalau.at18.kingoftokyo.controller.PlayerStatusController;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class KeepDiceSectionUI extends JPanel {
    private static final int QUANTITY_DICES = 6;
    private JLabel displayResult = new JLabel();
    private JButton keepButton = new JButton("Keep Dice");

    private List<DiceFaceLabel> listKeepDiceFaceLabel = new ArrayList<>();
    private PlayerStatusController playerController;

    public KeepDiceSectionUI(PlayerStatusController playerController) {
        this.playerController = playerController;
        initializeDice();
        setBorder(new LineBorder(Color.GREEN, 1));
    }

    public void initializeDice() {
        TitledBorder title = BorderFactory.createTitledBorder("Keep Dice");
        JPanel panelKeepDice = new JPanel();
        panelKeepDice.setBorder(title);
        add(panelKeepDice);
        keepButton.setVisible(false);
        add(keepButton);
        //first time to create the 6 labels to KeepFace
        for (int index = 1; index <= QUANTITY_DICES; index++) {
            DiceFaceLabel diceFaceLabel = new DiceFaceLabel();
            panelKeepDice.add(diceFaceLabel);
            listKeepDiceFaceLabel.add(diceFaceLabel);
        }
        add(displayResult);
    }

    public void resetUI() {
        keepButton.setVisible(false);
        for (DiceFaceLabel diceFaceLabel : listKeepDiceFaceLabel) {
            diceFaceLabel.painQuestionMark();
        }
    }

    public JButton getKeepButton() {
        return keepButton;
    }

    public List<DiceFaceLabel> getListKeepDiceFaceLabel() {
        return listKeepDiceFaceLabel;
    }

    public JLabel getDisplayResult() {
        return displayResult;
    }

    public void sendResults(int[] effect) {
        playerController.setPlayersStatus(effect);
    }
}
