package jalau.at18.katas.pokerhands.sarai;

public class ThreePairsIdentify extends Cardhigth {
    public ThreePairsIdentify() {

    }
    @Override
    public Higth getidentifyOperation() {
        return Higth.THREEPAIR;
    }
    public boolean identifyThreePairs(PokerHand hand) {
        ThreePairs threecards = new ThreePairs();
        return threecards.match(hand);
    }
}
