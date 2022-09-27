package jalau.at18.war.controller;

import jalau.at18.war.model.Player;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RollDiceController implements ActionListener {

    private Player player;

    public RollDiceController(Player player) {
        this.player = player;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        player.rollDice();
    }
}
