package jalau.at18.kingoftokyo;

import java.util.ArrayList;
import java.util.List;

public class DiceKeeper {
    private List<Dice> keepListDices;

    public DiceKeeper() {
        this.keepListDices = new ArrayList<>();
    }

    public List<Dice> keepListDice(List<Dice> savePlayerListDices) {
        keepListDices.addAll(savePlayerListDices);
        return keepListDices;
    }

}
