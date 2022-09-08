package jalau.at18.katas.pokerhands.maria;

public class PokerHandRank {
    private PokerHandValue pokerHandValue;
    private CardValue cardValue;

    public PokerHandRank(PokerHandValue pokerHandValue, CardValue cardValue) {
        this.pokerHandValue = pokerHandValue;
        this.cardValue = cardValue;
    }

    public PokerHandValue getPokerHandValue() {
        return pokerHandValue;
    }

    public CardValue getCardValue() {
        return cardValue;
    }
}
