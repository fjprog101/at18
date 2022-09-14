package jalau.at18.kingoftokyo;

import java.util.Random;

public class RandomDice {
    private int randomDice;

    public Dice generatedRandom() {
        randomDice = new Random().nextInt(DiceFace.values().length);
        DiceFace element  =  DiceFace.values()[randomDice];
        Dice dice = new Dice(element);
        return dice;
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
