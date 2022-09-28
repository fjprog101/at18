package jalau.at18.kingoftokyo.controller;

import jalau.at18.kingoftokyo.model.DiceFace;
import jalau.at18.kingoftokyo.model.DiceFaceKeeper;
import jalau.at18.kingoftokyo.model.DiceFaceKeeperProcess;
import jalau.at18.kingoftokyo.model.DiceFaceKeeperResult;
import jalau.at18.kingoftokyo.model.DiceFaceTurnResult;
import jalau.at18.kingoftokyo.view.rolldicesection.DiceFaceLabel;
import jalau.at18.kingoftokyo.view.rolldicesection.KeepDiceSectionUI;

public class KeepDiceSectionController {
    private KeepDiceSectionUI keepDiceSectionUI;
    private DiceFaceKeeper diceFaceKeeper;
    private DiceFaceKeeperProcess diceFaceKeeperProcess;
    private DiceFaceKeeperResult diceFaceKeeperResult;
    private DiceFaceTurnResult diceFaceTurnResult;

    public KeepDiceSectionController(KeepDiceSectionUI keepDiceSectionUI) {
        this.keepDiceSectionUI = keepDiceSectionUI;
        this.diceFaceKeeper = new DiceFaceKeeper();
        this.diceFaceKeeperProcess = new DiceFaceKeeperProcess(diceFaceKeeper);
        this.diceFaceKeeperResult = new DiceFaceKeeperResult(diceFaceKeeperProcess);
        keepDiceSectionUI.getRollerButton().addActionListener(e -> calculateDiceResult());
    }

    public void putDiceFaceLabel(DiceFaceLabel diceFaceLabelMouseClick) {
        for (DiceFaceLabel diceFaceLabel : keepDiceSectionUI.getListKeepDiceFaceLabel()) {
            if (!diceFaceLabel.isInitialize()) {
                diceFaceLabel.paintDiceFace(diceFaceLabelMouseClick.getPaintDiceFace());
                keepDice(diceFaceLabelMouseClick.getPaintDiceFace());
                break;
            }
        }
    }

    public void keepDice(DiceFace diceFace) {
        diceFaceKeeper.saveDiceFace(diceFace);
    }


    public void calculateDiceResult() {
        diceFaceTurnResult = diceFaceKeeperResult.resultDiceFaceKeeper();
        int healing = diceFaceTurnResult.getHealingPoint();
        int damage = diceFaceTurnResult.getPunchingPoint();
        int score = diceFaceTurnResult.getScorePoint();
        int energy = diceFaceTurnResult.getEnergyPoint();
        int[] effect = {healing, damage, score, energy};
        keepDiceSectionUI.sendResults(effect); //For chenge player atributes

        String result = String.valueOf(healing) + String.valueOf(damage)
                + String.valueOf(score) + String.valueOf(energy);
        keepDiceSectionUI.getDisplayResult().setText(result);
    }
}
