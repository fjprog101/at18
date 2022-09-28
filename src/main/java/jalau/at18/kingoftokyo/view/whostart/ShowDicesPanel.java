package jalau.at18.kingoftokyo.view.whostart;

import javax.swing.*;
import jalau.at18.kingoftokyo.controller.WhoStartRollDiceController;
import jalau.at18.kingoftokyo.model.Player;
import jalau.at18.kingoftokyo.view.rolldicesection.RollDiceSectionUI;


public class ShowDicesPanel extends JPanel {
    private static final int DEFAULT_LABEL_POSX = 100;
    private static final int DEFAULT_LABEL_POSY = 90;
    private static final int DEFAULT_LABEL_WIDTH = 500;
    private static final int DEFAULT_LABEL_HEIGHT = 200;
    private WhoStartRollDiceController whoStartRollDiceController;
    private RollDiceSectionUI rollDiceSectionUI;
    public ShowDicesPanel(Player player) {
        rollDiceSectionUI = new RollDiceSectionUI();
        add(rollDiceSectionUI);
        setBounds(DEFAULT_LABEL_POSX, DEFAULT_LABEL_POSY, DEFAULT_LABEL_WIDTH, DEFAULT_LABEL_HEIGHT);
    }

    public WhoStartRollDiceController getWhoStartRollDiceController() {
        return whoStartRollDiceController;
    }

    public RollDiceSectionUI getRolldiceSeccionUI() {
        return rollDiceSectionUI;
    }
}