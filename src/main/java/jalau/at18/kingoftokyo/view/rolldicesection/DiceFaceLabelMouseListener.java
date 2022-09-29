package jalau.at18.kingoftokyo.view.rolldicesection;

import jalau.at18.kingoftokyo.controller.KeepDiceSectionController;
import jalau.at18.kingoftokyo.controller.RollDiceSectionController;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DiceFaceLabelMouseListener extends MouseAdapter {
    private KeepDiceSectionController keepDiceSectionController;
    private RollDiceSectionController rollDiceSectionController;
    public static final int MAX_DICEFACE_SET = 6;

    public DiceFaceLabelMouseListener(KeepDiceSectionController keepDiceSectionController,
                                      RollDiceSectionController rollDiceSectionController) {
        this.keepDiceSectionController = keepDiceSectionController;
        this.rollDiceSectionController = rollDiceSectionController;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //This is where we know which label is selected
        DiceFaceLabel source = (DiceFaceLabel) e.getSource();
        if (!source.isInitialize()) {
            return;
        }
        keepDiceSectionController.putDiceFaceLabel(source);
        int countRamdomDiceGenerated = rollDiceSectionController.reduceCountRamdomDiceGenerated();
        source.setVisible(false);
        System.out.println("countRamdomDiceGenerated:" + countRamdomDiceGenerated);

        if (countRamdomDiceGenerated == 1) {
            rollDiceSectionController.getRollDiceSectionUI().getRollerDiceButton().setEnabled(false);
        }

        if (keepDiceSectionController.getCountDiceFaceSet() == MAX_DICEFACE_SET) {
            keepDiceSectionController.getKeepDiceSectionUI().getKeepButton().setVisible(true);
        }
    }
}
