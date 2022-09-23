package jalau.at18.war.view;

import javax.swing.JPanel;

import jalau.at18.war.controller.PlayerPanelController;
import jalau.at18.war.model.Game;

public class PlayerPanel extends JPanel {

    private PlayerPanelController controller;
    private DiceLabelGroup diceLabelGroup;

    public PlayerPanel(Game game) {
        controller = new PlayerPanelController(game, this);
        diceLabelGroup = new DiceLabelGroup();
        add(diceLabelGroup);
        add(new RollerButton(controller));
    }

    public DiceLabelGroup getDiceLabelGroup() {
        return diceLabelGroup;
    }

    public PlayerPanelController getController() {
        return controller;
    }
}
