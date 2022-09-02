package jalau.at18.katas.pokerhands.joseg;

public class PokerHand {

    private Card[] cards;

    public PokerHand(Card[] cards) {
        this.cards = cards;
    }

    public Card[] getCards() {
        return cards;
    }

    public boolean hasConsecutiveValues() {
        boolean areConsecutive = true;
        for (int index = 0; areConsecutive && index < cards.length - 1; index++) {
            areConsecutive = cards[index].getValue().next() == cards[index + 1].getValue();
        }
        return areConsecutive;
    }
}
