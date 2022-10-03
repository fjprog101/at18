package jalau.at18.kingoftokyo.view.rolldicesection;

import javax.swing.*;
import javax.swing.border.TitledBorder;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class RollDiceSectionUI extends JPanel {
    private static final int THREE = 3;
    private static final int RED = 176;
    private static final int GREEN = 82;
    private static final int BLUE = 122;
    private static final int RED_BUTTON = 249;
    private static final int GREEN_BUTTON = 156;
    private static final int BLUE_BUTTON = 0;
    private static final int QUANTITY_DICES = 6;
    private JButton rollerDiceButton = new JButton("Roll Dice");
    private List<DiceFaceLabel> listDiceFaceLabel = new ArrayList<>();

    public RollDiceSectionUI() {
        add(rollerDiceButton);
        initializeDice();
        float[] hsb = new float[THREE];
        hsb = Color.RGBtoHSB(RED, GREEN, BLUE, hsb);
        setBackground(Color.getHSBColor(hsb[0], hsb[1], hsb[2]));
        float[] hsbButton = new float[THREE];
        hsbButton = Color.RGBtoHSB(RED_BUTTON, GREEN_BUTTON, BLUE_BUTTON, hsbButton);
        setBorder(BorderFactory.createTitledBorder(null, "", TitledBorder.LEFT, 0, null));
        rollerDiceButton.setBackground(Color.getHSBColor(hsbButton[0], hsbButton[1], hsbButton[2]));
    }

    public void initializeDice() {
        JPanel jPanel = new JPanel();
        add(jPanel);
        // first time to create the 6 labels to DiceFace
        for (int index = 1; index <= QUANTITY_DICES; index++) {
            DiceFaceLabel diceFaceLabel = new DiceFaceLabel();
            jPanel.add(diceFaceLabel);
            listDiceFaceLabel.add(diceFaceLabel);
        }
    }

    public JButton getRollerDiceButton() {
        return rollerDiceButton;
    }

    public List<DiceFaceLabel> getListDiceFaceLabel() {
        return listDiceFaceLabel;
    }

    public void resetUI() {
        rollerDiceButton.setEnabled(true);
        for (DiceFaceLabel diceFaceLabel : listDiceFaceLabel) {
            diceFaceLabel.painQuestionMark();
            diceFaceLabel.setVisible(true);
        }
    }
}
