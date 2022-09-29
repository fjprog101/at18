package jalau.at18.war.view;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

import jalau.at18.war.controller.RollDiceController;
import jalau.at18.war.model.Die;
import jalau.at18.war.model.DieFace;
import jalau.at18.war.model.DieRoller;
import jalau.at18.war.model.Game;
import jalau.at18.war.model.Player;

public class PlayerPanel extends JPanel {

    public PlayerPanel() {
        Player player = new Player(new DieRoller());
        Game.INSTANCE.addPlayer(player);
        init(player);
    }

    private void init(Player player) {
        DiceLabelGroup diceLabelGroup = new DiceLabelGroup();
        add(new RollerButton(new RollDiceController(player)));
        add(diceLabelGroup);
        add(new JButton("Attack!"));
        add(new JComboBox<String>(new String[]{"p1", "p2", "p3"}));
        wire(player, diceLabelGroup);
    }

    private void wire(Player player, DiceLabelGroup diceLabelGroup) {
        for (Component dieLabel: diceLabelGroup.getComponents()) {
            Die die = new Die(DieFace.ONE);
            die.addObserver((DieLabel) dieLabel);
            player.addDie(die);
        }
    }
}
