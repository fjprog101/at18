package jalau.at18.kingoftokyo;

import java.util.ArrayList;
import java.util.List;

public class DiceRoller {
    private RandomDice randomDice;

    public DiceRoller() {
        this.randomDice = new RandomDice();
    }

    //This method generated the list with random values.
    public List<DiceFace> randomDice(int countDicesAvailables) {
        List<DiceFace> newListDiceFace = new ArrayList<>();
        for (int count = 0; count < countDicesAvailables; count++) {
            DiceFace diceFace = randomDice.generatedRandom();
            newListDiceFace.add(diceFace);
        }
        return newListDiceFace;
    }
}
