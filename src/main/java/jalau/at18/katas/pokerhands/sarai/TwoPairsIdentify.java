package jalau.at18.katas.pokerhands.sarai;

public class TwoPairsIdentify {
    public TwoPairsIdentify() {
    }
    public boolean identifyTwoPairs(PokerHand hand) {
        TwoPairs twocards = new TwoPairs();
        return twocards.match(hand);
    }
}
