package jalau.at18.katas.pokerhands.sarai;

public class ThreePairsIdentify {
    public ThreePairsIdentify() {

    }
    public boolean identifyThreePairs(PokerHand hand) {
        ThreePairs threecards = new ThreePairs();
        return threecards.match(hand);
    }
}
