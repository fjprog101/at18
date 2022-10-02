package jalau.at18.kingoftokyo.view.rolldicesection;

import jalau.at18.kingoftokyo.controller.PlayerStatusController;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class KeepDiceSectionUI extends JPanel {
    private static final int THREE = 3;
    private static final int RED = 176;
    private static final int GREEN = 82;
    private static final int BLUE = 122;
    private static final int RED_BUTTON = 249;
    private static final int GREEN_BUTTON = 156;
    private static final int BLUE_BUTTON = 0;
    private static final int QUANTITY_DICES = 6;
    private JButton keepButton = new JButton("Keep Dice");

    private List<DiceFaceLabel> listKeepDiceFaceLabel = new ArrayList<>();
    private PlayerStatusController playerController;

    public KeepDiceSectionUI(PlayerStatusController playerController) {
        this.playerController = playerController;
        initializeDice();
        float[] hsb = new float[THREE];
        hsb = Color.RGBtoHSB(RED, GREEN, BLUE, hsb);
        setBackground(Color.getHSBColor(hsb[0], hsb[1], hsb[2]));
        float[] hsbButton = new float[THREE];
        hsbButton = Color.RGBtoHSB(RED_BUTTON, GREEN_BUTTON, BLUE_BUTTON, hsbButton);
        keepButton.setBackground(Color.getHSBColor(hsbButton[0], hsbButton[1], hsbButton[2]));
    }

    public void initializeDice() {
        JPanel panelKeepDice = new JPanel();
        panelKeepDice.setBorder(BorderFactory.createTitledBorder(null, "Keep Dice", TitledBorder.LEFT, 0, null));
        add(panelKeepDice);
        keepButton.setVisible(false);
        float[] hsb = new float[THREE];
        hsb = Color.RGBtoHSB(RED, GREEN, BLUE, hsb);
        panelKeepDice.setBackground(Color.getHSBColor(hsb[0], hsb[1], hsb[2]));
        add(keepButton);
        for (int index = 1; index <= QUANTITY_DICES; index++) {
            DiceFaceLabel diceFaceLabel = new DiceFaceLabel();
            panelKeepDice.add(diceFaceLabel);
            listKeepDiceFaceLabel.add(diceFaceLabel);
        }
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

    public void sendResults(int[] effect) {
        playerController.setPlayersStatus(effect);
    }
}
