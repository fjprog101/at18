package jalau.at18.kingoftokyo;

import java.util.List;

public class HandDice {
    private List<Dice> listDices;

    public HandDice(List<Dice> listDices) {
        this.listDices = listDices;
    }

    public List<Dice> getListDices() {
        return listDices;
    }
}
