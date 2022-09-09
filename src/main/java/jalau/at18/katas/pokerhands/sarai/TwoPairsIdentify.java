package jalau.at18.katas.pokerhands.sarai;

public class TwoPairsIdentify extends Cardhigth {
    public TwoPairsIdentify() {
    }
    @Override
    public Higth getidentifyOperation() {
        return Higth.TWOPAIR;
    }
    public boolean identifyTwoPairs(PokerHand hand) {
        TwoPairs twocards = new TwoPairs();
        return twocards.match(hand);
    }
}
