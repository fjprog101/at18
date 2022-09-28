package jalau.at18.kingoftokyo.view.rolldicesection;

import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class RollDiceSectionUI extends JPanel {
    private static final int QUANTITY_DICES = 6;
    private JButton rollerDiceButton = new JButton("Roll Dice");

    private List<DiceFaceLabel> listDiceFaceLabel = new ArrayList<>();

    public RollDiceSectionUI() {
        add(rollerDiceButton);
        initializeDice();
        setBorder(new LineBorder(Color.BLUE, 1));
    }

    public void initializeDice() {
        JPanel jPanel = new JPanel();
        add(jPanel);
        //first time to create the 6 labels to DiceFace
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
