package jalau.at18.kingoftokyo.controller;

import jalau.at18.kingoftokyo.model.DiceFace;
import jalau.at18.kingoftokyo.model.DiceRoller;
import jalau.at18.kingoftokyo.view.rolldicesection.DiceFaceLabel;
import jalau.at18.kingoftokyo.view.rolldicesection.DiceFaceLabelMouseListener;
import jalau.at18.kingoftokyo.view.rolldicesection.RollDiceSectionUI;

import java.util.ArrayList;
import java.util.List;

public class RollDiceSectionController {
    private static final int QUANTITY_DICES = 6;
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
        listRandomDiceFace = diceRoller.randomDice(QUANTITY_DICES);
        int count = 0;
        for (DiceFaceLabel diceFaceLabel : rollDiceSectionUI.getListDiceFaceLabel()) {
            diceFaceLabel.paintDiceFace(listRandomDiceFace.get(count));
            count++;
        }
    }

    private void settingMouseEvent() {
        for (DiceFaceLabel diceFaceLabel : rollDiceSectionUI.getListDiceFaceLabel()) {
            diceFaceLabel.addMouseListener(new DiceFaceLabelMouseListener(keepDiceSectionController));
        }
    }

    public List<DiceFace> getListRandomDiceFace() {
        return listRandomDiceFace;
    }
}
