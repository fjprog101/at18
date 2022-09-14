package jalau.at18.kingoftokyo;

import java.util.ArrayList;
import java.util.List;

public class DiceRoller {
    private static final int COUNT_DICE = 6;
    private RandomDice randomDice;

    public DiceRoller() {
        this.randomDice = new RandomDice();
    }

    //This method generated the list with random values.
    public List<DiceFace> randomDice() { // No olvidar que aqui recibira la cantidad de randoms a generar a la lista
        List<DiceFace> newListDiceFace = new ArrayList<>();
        for (int count = 0; count < COUNT_DICE; count++) {
            DiceFace diceFace = randomDice.generatedRandom();
            newListDiceFace.add(diceFace);
        }
        return newListDiceFace;
    }
}
