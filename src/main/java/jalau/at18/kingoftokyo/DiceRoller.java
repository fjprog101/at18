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
        // Do not forget that here it will be received the number of randoms to generate to the list
        List<DiceFace> newListDiceFace = new ArrayList<>();
        for (int count = 0; count < countDicesAvailables; count++) {
            DiceFace diceFace = randomDice.generatedRandom();
            newListDiceFace.add(diceFace);
        }
        return newListDiceFace;
    }
}
