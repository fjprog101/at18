package jalau.at18.katas.pokerhands.joseg;

public class PokerHandAnalizer {

    public boolean analize(PokerHand hand, CardsWithSameValue cardsWithSameValue) {
        return cardsWithSameValue.match(hand);
    }

    public boolean analize(PokerHand hand, ConsecutiveValues consecutiveValues) {
        return consecutiveValues.match(hand);
    }

    public boolean analize(PokerHand hand, AllSameSuit allSameSuit) {
        return allSameSuit.match(hand);
    }
}
