package jalau.at18.kingoftokyo.controller;

import jalau.at18.kingoftokyo.model.*;
import jalau.at18.kingoftokyo.view.rolldicesection.*;
import java.util.ArrayList;
import java.util.List;

public class RollDiceSectionController {
    private static final int QUANTITY_DICES = 6;
    private int countRamdomDiceGenerated = QUANTITY_DICES;
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
        int count = 0;
        for (DiceFaceLabel diceFaceLabel : rollDiceSectionUI.getListDiceFaceLabel()) {
            diceFaceLabel.setVisible(false);
        }

        for (DiceFace diceFace : listRandomDiceFace) {
            DiceFaceLabel diceFaceLabel = rollDiceSectionUI.getListDiceFaceLabel().get(count);
            diceFaceLabel.paintDiceFace(diceFace);
            count++;
        }
    }

    private void settingMouseEvent() {
        for (DiceFaceLabel diceFaceLabel : rollDiceSectionUI.getListDiceFaceLabel()) {
            diceFaceLabel.addMouseListener(new DiceFaceLabelMouseListener(keepDiceSectionController, this));
        }
    }

    public List<DiceFace> getListRandomDiceFace() {
        return listRandomDiceFace;
    }

    public int reduceCountRamdomDiceGenerated() {
        return countRamdomDiceGenerated--;
    }

    public RollDiceSectionUI getRollDiceSectionUI() {
        return rollDiceSectionUI;
    }
}
