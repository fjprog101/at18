package jalau.at18.kingoftokyo.controller;

import jalau.at18.kingoftokyo.model.*;
import jalau.at18.kingoftokyo.view.rolldicesection.*;
import java.util.ArrayList;
import java.util.List;

public class RollDiceSectionController {
    private static final int COUNT_ROLL_DICE = 3;
    private static final int QUANTITY_DICES = 6;
    private int countRamdomDiceGenerated = QUANTITY_DICES;
    private int countRollDicePlayer = COUNT_ROLL_DICE;
    private RollDiceSectionUI rollDiceSectionUI;
    private KeepDiceSectionController keepDiceSectionController;
    private List<DiceFace> listRandomDiceFace;

    public RollDiceSectionController(RollDiceSectionUI rollDiceSectionUI,
                                     KeepDiceSectionController keepDiceSectionController) {
        this.rollDiceSectionUI = rollDiceSectionUI;
        this.keepDiceSectionController = keepDiceSectionController;
        rollDiceSectionUI.getRollerDiceButton().addActionListener(e -> rollDices());
        settingMouseEvent();
        listRandomDiceFace = new ArrayList<>();
    }

    private void rollDices() {
        DiceRoller diceRoller = new DiceRoller();
        listRandomDiceFace = diceRoller.randomDice(countRamdomDiceGenerated);
        countRollDicePlayer--;
        int count = 0;
        // this is to set the diceFaceLabel in False
        for (DiceFaceLabel diceFaceLabel : rollDiceSectionUI.getListDiceFaceLabel()) {
            diceFaceLabel.setVisible(false);
        }

        for (DiceFace diceFace : listRandomDiceFace) {
            DiceFaceLabel diceFaceLabel = rollDiceSectionUI.getListDiceFaceLabel().get(count);
            diceFaceLabel.paintDiceFace(diceFace);
            count++;
        }
        if (countRollDicePlayer == 0) {
            rollDiceSectionUI.getRollerDiceButton().setEnabled(false);
        }
    }

    private void settingMouseEvent() {
        for (DiceFaceLabel diceFaceLabel : rollDiceSectionUI.getListDiceFaceLabel()) {
            diceFaceLabel.addMouseListener(new DiceFaceLabelMouseListener(keepDiceSectionController, this));
        }
    }

    public int reduceCountRamdomDiceGenerated() {
        return countRamdomDiceGenerated--;
    }

    public int reduceCountRollDicePlayer() {
        return countRollDicePlayer--;
    }

    public void setCountRamdomDiceGenerated(int countRamdomDiceGeneratedd) {
        this.countRamdomDiceGenerated = countRamdomDiceGeneratedd;
    }

    public RollDiceSectionUI getRollDiceSectionUI() {
        return rollDiceSectionUI;
    }

    public void resetUI() {
        countRamdomDiceGenerated = QUANTITY_DICES;
        countRollDicePlayer = COUNT_ROLL_DICE;
        rollDiceSectionUI.resetUI();
    }
}
