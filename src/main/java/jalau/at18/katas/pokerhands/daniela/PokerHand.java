package jalau.at18.katas.pokerhands.daniela;

public class PokerHand {

    private Card[] cards;

    public PokerHand(Card[] cards) {
        CardsSort sorter = new CardsSort();
        this.cards = sorter.sortCards(cards);
    }

    public Card[] getCards() {
        return cards;
    }
}
