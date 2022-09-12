package jalau.at18.katas.pokerhands.daniela;

public class CardSorted {
    private PokerHand hand;

    public CardSorted(PokerHand handtoanalize) {
        this.hand = handtoanalize;
    }

    public CardstoString getCount() {
        CardstoString cards = new CardstoString();
        for (Card card : hand.getCards()) {
            cards.add(card.getValue());
        }
        return cards;
    }
}
