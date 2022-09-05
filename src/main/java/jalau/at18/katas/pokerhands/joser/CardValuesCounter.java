package jalau.at18.katas.pokerhands.joser;

public class CardValuesCounter {

    private PokerHand hand;

    public CardValuesCounter(PokerHand handWith1CardPerValue) {
        this.hand = handWith1CardPerValue;
    }

    public CardValuesCount getCount() {
        CardValuesCount count = new CardValuesCount();
        for (Card card : hand.getCards()) {
            count.add(card.getValue());
        }
        return count;
    }

}
