package jalau.at18.katas.pokerhands.joser;

public class PokerHandAnalizer {

    public boolean analize(PokerHand hand, CardsPattern pattern) {
        return pattern.match(hand);
    }
}
