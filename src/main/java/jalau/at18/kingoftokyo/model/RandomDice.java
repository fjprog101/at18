package jalau.at18.kingoftokyo.model;

import java.util.Random;

public class RandomDice {
    private int randomDice;

    public DiceFace generatedRandom() {
        randomDice = new Random().nextInt(DiceFace.values().length);
        DiceFace element  =  DiceFace.values()[randomDice];
        return element;
    }
}
