package jalau.at18.katas.pokerhands.rodrigov;

public class SortedCards {
    private PokerHand hand;

    public SortedCards(PokerHand hand) {
        this.hand = hand;
    }

    public StringCards getCount() {
        StringCards cards = new StringCards();
        for (Card card : hand.getCards()) {
            cards.add(card.getValue());
        }
        return cards;
    }
}
