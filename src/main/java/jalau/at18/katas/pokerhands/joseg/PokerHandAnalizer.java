package jalau.at18.katas.pokerhands.joseg;

public class PokerHandAnalizer {

    public boolean analize(PokerHand hand, CardsPattern pattern) {
        return pattern.match(hand);
    }
}
