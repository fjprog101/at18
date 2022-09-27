package jalau.at18.kingoftokyo.model;

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
