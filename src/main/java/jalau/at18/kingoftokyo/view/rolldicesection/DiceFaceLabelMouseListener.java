package jalau.at18.kingoftokyo.view.rolldicesection;

import jalau.at18.kingoftokyo.controller.KeepDiceSectionController;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DiceFaceLabelMouseListener extends MouseAdapter {
    private KeepDiceSectionController keepDiceSectionController;

    public DiceFaceLabelMouseListener(KeepDiceSectionController keepDiceSectionController) {
        this.keepDiceSectionController = keepDiceSectionController;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //This is where we know which label is selected
        DiceFaceLabel source = (DiceFaceLabel) e.getSource();
        source.painQuestionMark();
        keepDiceSectionController.putDiceFaceLabel(source);

    }
}
