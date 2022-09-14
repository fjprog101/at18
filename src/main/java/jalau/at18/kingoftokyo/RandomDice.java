package jalau.at18.kingoftokyo;

import java.util.Random;

public class RandomDice {
    private int randomDice;

    public Dice generatedRandom() {
        randomDice = new Random().nextInt(DiceFace.values().length) + 1;
        for (DiceFace element : DiceFace.values()) {
            if (element.getRepresentativeValue() == randomDice) {
                Dice dice = new Dice(element);
                return dice;
            }
        }
        return null;
    }

    public boolean verifyRandomValue() {
        Dice dice = generatedRandom();
        for (DiceFace element : DiceFace.values()) {
            if (element.getRepresentativeValue() == dice.getDiceFace().getRepresentativeValue()) {
                return true;
            }
        }
        return false;
    }
}
