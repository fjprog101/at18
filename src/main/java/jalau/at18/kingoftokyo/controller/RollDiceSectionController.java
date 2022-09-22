package jalau.at18.kingoftokyo.controller;

import jalau.at18.kingoftokyo.DiceFace;
import jalau.at18.kingoftokyo.DiceRoller;
import jalau.at18.kingoftokyo.view.DiceFaceLabel;
import jalau.at18.kingoftokyo.view.RollDiceSectionUI;

import java.util.List;

public class RollDiceSectionController {
    private static final int QUANTITY_DICES = 6;
    private RollDiceSectionUI rollDiceSectionUI;

    public RollDiceSectionController(RollDiceSectionUI rollDiceSectionUI) {
        this.rollDiceSectionUI = rollDiceSectionUI;
        rollDiceSectionUI.getRollerDiceButton().addActionListener(e -> rollDices());
    }

    private void rollDices() {
        DiceRoller diceRoller = new DiceRoller();
        List<DiceFace> diceFaces = diceRoller.randomDice(QUANTITY_DICES);
        int count = 0;
        for (DiceFaceLabel diceFaceLabel : rollDiceSectionUI.getListDiceFaceLabel()) {
            diceFaceLabel.setDiceFaceImage(diceFaces.get(count).getRepresentativeValue());
            count++;
        }
    }

}
