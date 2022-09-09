package jalau.at18.katas.pokerhands.rodrigov;

public class OrderCards {
    //private CardValue cardValues;
    private PokerHand hand;
    public OrderCards(PokerHand hand) {
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
