package jalau.at18.katas.pokerhands.daniela;

public class Cardssorted {

    private PokerHand hand;

    public Cardssorted(PokerHand handtoanalize) {
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
