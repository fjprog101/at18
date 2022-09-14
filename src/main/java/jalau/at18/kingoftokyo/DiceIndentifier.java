package jalau.at18.kingoftokyo;

import java.util.HashMap;
import java.util.List;

public class DiceIndentifier {
    private DiceRoller diceRoller;
    private HashMap<DiceFace, Integer> diceCount;

    public DiceIndentifier() {
        this.diceRoller = new DiceRoller();
        this.diceCount = new HashMap<DiceFace, Integer>();
    }

    public HashMap<DiceFace, Integer> countDice() { //agarra la lista del ramdom y cuenta la cantidad caras del dado repetidos
        List<DiceFace> listRandomDice = diceRoller.randomDice();
        for (DiceFace randomDiceFace : listRandomDice) {
            addDiceWithCount(randomDiceFace);
        }
        return getDiceFaceCount();
    }

    public void addDiceWithCount(DiceFace diceFace) {
        int existingCount = 0;
        if (diceCount.containsKey(diceFace)) {
            existingCount = getDiceHashMap(diceFace);
        }
        diceCount.put(diceFace, existingCount + 1);
    }

    public int getDiceHashMap(DiceFace diceFace) {
        return diceCount.get(diceFace);
    }

    public HashMap<DiceFace, Integer> getDiceFaceCount() {
        return diceCount;
    }
}
