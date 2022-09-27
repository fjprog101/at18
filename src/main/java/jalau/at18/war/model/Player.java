package jalau.at18.war.model;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private DieRoller roller;
    private List<Die> dice;

    public Player(DieRoller roller) {
        this.roller = roller;
        this.dice = new ArrayList<Die>();
    }

    public void addDie(Die die) {
        dice.add(die);
    }

    public List<Die> rollDice() {
        for (Die die: dice) {
            die.setFace(roller.roll());
        }
        return this.dice;
    }
}
