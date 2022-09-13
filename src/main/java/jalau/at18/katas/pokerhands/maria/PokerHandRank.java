package jalau.at18.katas.pokerhands.maria;

import java.util.List;

public class PokerHandRank {
    private PokerHandType pokerHandType;
    private List<CardValue> listCardValue;

    public PokerHandRank(PokerHandType pokerHandType, List<CardValue> listCardValue) {
        this.pokerHandType = pokerHandType;
        this.listCardValue = listCardValue;
    }

    public PokerHandType getPokerHandType() {
        return pokerHandType;
    }

    public List<CardValue> getListCardValue() {
        return listCardValue;
    }
}
