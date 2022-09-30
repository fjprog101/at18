package jalau.at18.kingoftokyo.controller;

import jalau.at18.kingoftokyo.model.*;
import jalau.at18.kingoftokyo.view.TurnPanel;
import jalau.at18.kingoftokyo.view.rolldicesection.DiceFaceLabel;
import jalau.at18.kingoftokyo.view.rolldicesection.KeepDiceSectionUI;

public class KeepDiceSectionController {
    private KeepDiceSectionUI keepDiceSectionUI;
    private RollDiceSectionController rollDiceSectionController;
    private DiceFaceKeeper diceFaceKeeper;
    private DiceFaceTurnResult diceFaceTurnResult;
    private int countDiceFaceSet = 0;
    private TurnPanel turnPanel;

    public KeepDiceSectionController(KeepDiceSectionUI keepDiceSectionUI) {
        this.keepDiceSectionUI = keepDiceSectionUI;
        this.diceFaceKeeper = new DiceFaceKeeper();

        keepDiceSectionUI.getKeepButton().addActionListener(e -> calculateDiceResult());
    }

    public void putDiceFaceLabel(DiceFaceLabel diceFaceLabelMouseClick) {
        for (DiceFaceLabel diceFaceLabel : keepDiceSectionUI.getListKeepDiceFaceLabel()) {
            if (!diceFaceLabel.isInitialize()) {
                diceFaceLabel.paintDiceFace(diceFaceLabelMouseClick.getPaintDiceFace());
                keepDice(diceFaceLabelMouseClick.getPaintDiceFace());
                countDiceFaceSet++;
                break;
            }
        }
    }

    public int getCountDiceFaceSet() {
        return countDiceFaceSet;
    }

    public void keepDice(DiceFace diceFace) {
        diceFaceKeeper.saveDiceFace(diceFace);
    }

    public void calculateDiceResult() {
        DiceFaceKeeperProcess diceFaceKeeperProcess = new DiceFaceKeeperProcess(diceFaceKeeper);
        DiceFaceKeeperResult diceFaceKeeperResult = new DiceFaceKeeperResult(diceFaceKeeperProcess);
        diceFaceTurnResult = diceFaceKeeperResult.resultDiceFaceKeeper();
        int healing = diceFaceTurnResult.getHealingPoint();
        int damage = diceFaceTurnResult.getPunchingPoint();
        int score = diceFaceTurnResult.getScorePoint();
        int energy = diceFaceTurnResult.getEnergyPoint();
        int[] effect = {healing, damage, score, energy};
        countDiceFaceSet = 0;
        keepDiceSectionUI.sendResults(effect); // For change player atributes
        keepDiceSectionUI.resetUI();
        rollDiceSectionController.resetUI();
        diceFaceKeeper = new DiceFaceKeeper();
        turnPanel.getComponent(1).setEnabled(true);
    }

    public KeepDiceSectionUI getKeepDiceSectionUI() {
        return keepDiceSectionUI;
    }

    public void setRollDiceSectionController(RollDiceSectionController rollDiceSectionControllerr) {
        this.rollDiceSectionController = rollDiceSectionControllerr;
    }
    public void addTurnPanel(TurnPanel newTurnPanel) {
        this.turnPanel = newTurnPanel;
    }
}
