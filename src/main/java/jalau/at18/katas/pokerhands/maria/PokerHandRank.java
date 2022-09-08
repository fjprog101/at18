package jalau.at18.katas.pokerhands.maria;

public class PokerHandRank {
    private PokerHandType pokerHandType;
    private CardValue cardValue;

    public PokerHandRank(PokerHandType pokerHandType, CardValue cardValue) {
        this.pokerHandType = pokerHandType;
        this.cardValue = cardValue;
    }

    public PokerHandType getPokerHandType() {
        return pokerHandType;
    }

    public CardValue getCardValue() {
        return cardValue;
    }
}
