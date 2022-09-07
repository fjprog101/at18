package jalau.at18.katas.pokerhands.adriana;

public class PokerHandAnalizer {

    public boolean analize(PokerHand hand, CardsPattern pattern) {
        return pattern.match(hand);
    }
}
