package jalau.at18.kingoftokyo.controller;

import jalau.at18.kingoftokyo.*;
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
        String result = String.valueOf(diceFaceTurnResult.getScorePoint())
                + String.valueOf(diceFaceTurnResult.getEnergyPoint())
                + String.valueOf(diceFaceTurnResult.getHealingPoint())
                + String.valueOf(diceFaceTurnResult.getPunchingPoint());
        keepDiceSectionUI.getDisplayResult().setText(result);
    }
}
