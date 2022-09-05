package jalau.at18.katas.pokerhands.daniela;

public class PokerHandAnalizer {

    public boolean analize(PokerHand hand, CardsPattern pattern) {
        return pattern.match(hand);
    }
}
