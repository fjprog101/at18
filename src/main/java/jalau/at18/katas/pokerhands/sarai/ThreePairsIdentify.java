package jalau.at18.katas.pokerhands.sarai;

public class ThreePairsIdentify extends Cardhigth {
    public ThreePairsIdentify() {

    }
    @Override
    public Patterns getidentifyOperation() {
        return Patterns.THREEPAIR;
    }
    public boolean identifyThreePairs(PokerHand hand) {
        ThreePairs threecards = new ThreePairs();
        return threecards.match(hand);
    }
}
