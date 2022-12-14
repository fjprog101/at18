package jalau.at18.kingoftokyo.controller;
import jalau.at18.kingoftokyo.model.DiceFace;
import jalau.at18.kingoftokyo.model.DiceRoller;
import jalau.at18.kingoftokyo.view.rolldicesection.DiceFaceLabel;
import jalau.at18.kingoftokyo.view.rolldicesection.RollDiceSectionUI;
import java.util.ArrayList;
import java.util.List;

public class RollDiceButtonController {
    private static final int QUANTITY_DICES = 6;
    private RollDiceSectionUI rollDiceSectionUI;
    private List<DiceFace> listRandomDiceFace;
    public RollDiceButtonController(RollDiceSectionUI rollDiceSectionUI) {

        this.rollDiceSectionUI = rollDiceSectionUI;
        rollDiceSectionUI.getRollerDiceButton().addActionListener(e -> rollDices());
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

    public List<DiceFace> getListRandomDiceFace() {
        return listRandomDiceFace;
    }
}