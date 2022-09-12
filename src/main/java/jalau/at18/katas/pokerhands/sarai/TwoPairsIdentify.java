package jalau.at18.katas.pokerhands.sarai;

public class TwoPairsIdentify extends Cardhigth {
    public TwoPairsIdentify() {
    }
    @Override
    public Patterns getidentifyOperation() {
        return Patterns.TWOPAIR;
    }
    public boolean identifyTwoPairs(PokerHand hand) {
        TwoPairs twocards = new TwoPairs();
        return twocards.match(hand);
    }
}
