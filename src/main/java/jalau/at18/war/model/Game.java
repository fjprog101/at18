package jalau.at18.war.model;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private List<Die> dice;

    public Game() {
        dice = new ArrayList<Die>();
        dice.add(new Die(DieFace.ONE));
        dice.add(new Die(DieFace.TWO));
        dice.add(new Die(DieFace.THREE));
    }

    public List<Die> rollDice() {
        for (Die die: dice) {
            die.setFace(rollNewRandomFace());
        }
        return dice;
    }

    private DieFace rollNewRandomFace() {
        int randomIndex = (int) (Math.random() * DieFace.values().length);
        return DieFace.values()[randomIndex];
    }
}
