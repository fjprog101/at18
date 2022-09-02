package jalau.at18.katas.pokerhands.joseg;

public class PokerHandAnalizer {

    private CardComparer comparer;

    public PokerHandAnalizer() {
        this.comparer = new CardComparer();
    }

    public boolean hasConsecutiveValues(PokerHand hand) {
        boolean areConsecutive = true;
        for (int index = 0; areConsecutive && index < hand.getCards().length - 1; index++) {
            areConsecutive = comparer.areConsecutive(hand.getCards()[index], hand.getCards()[index + 1]);
        }
        return areConsecutive;
    }

    public boolean hasAllCardsSameSuit(PokerHand hand) {
        boolean areSameSuit = true;
        for (int index = 0; areSameSuit && index < hand.getCards().length - 1; index++) {
            areSameSuit = comparer.haveSameSuit(hand.getCards()[index], hand.getCards()[index + 1]);
        }
        return areSameSuit;
    }

    public boolean analize(PokerHand handWith2CardsWithSameValue, CardsWithSameValue cardsWithSameValue) {
        return cardsWithSameValue.match(handWith2CardsWithSameValue);
    }
}
