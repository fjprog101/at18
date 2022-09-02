package jalau.at18.katas.pokerhands.joseg;

public class PokerHand {

    private Card[] cards;
    private CardComparer comparer;

    public PokerHand(Card[] cards) {
        this.cards = cards;
        this.comparer = new CardComparer();
    }

    public Card[] getCards() {
        return cards;
    }

    public boolean hasConsecutiveValues() {
        boolean areConsecutive = true;
        for (int index = 0; areConsecutive && index < cards.length - 1; index++) {
            areConsecutive = comparer.areConsecutive(cards[index], cards[index + 1]);
        }
        return areConsecutive;
    }

    public boolean hasAllCardsSameSuit() {
        boolean areSameSuit = true;
        for (int index = 0; areSameSuit && index < cards.length - 1; index++) {
            areSameSuit = comparer.haveSameSuit(cards[index], cards[index + 1]);
        }
        return areSameSuit;
    }
}
