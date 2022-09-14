package jalau.at18.kingoftokyo;

import java.util.List;

public class DiceHand {
    private List<Dice> listDices;

    public DiceHand(List<Dice> listDices) {
        this.listDices = listDices;
    }

    public List<Dice> getListDices() {
        return listDices;
    }
}
