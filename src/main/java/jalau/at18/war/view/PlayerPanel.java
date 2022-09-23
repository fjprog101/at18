package jalau.at18.war.view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import jalau.at18.war.controller.PlayerPanelController;
import jalau.at18.war.model.Game;

public class PlayerPanel extends JPanel {

    private PlayerPanelController controller;
    private DiceLabelGroup diceLabelGroup;

    public PlayerPanel(Game game) {
        controller = new PlayerPanelController(game, this);
        diceLabelGroup = new DiceLabelGroup();
        init();
    }

    public DiceLabelGroup getDiceLabelGroup() {
        return diceLabelGroup;
    }

    public PlayerPanelController getController() {
        return controller;
    }

    private void init() {
        add(new RollerButton(controller));
        add(diceLabelGroup);
        add(new JButton("Attack!"));
        add(new JComboBox<String>(new String[]{"p1", "p2", "p3"}));
    }
}
