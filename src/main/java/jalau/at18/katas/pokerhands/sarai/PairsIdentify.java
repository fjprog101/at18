package jalau.at18.katas.pokerhands.sarai;

public class PairsIdentify extends Cardhigth {
    public PairsIdentify() {

    }

    public boolean identifyPairs(PokerHand hand) {
        Pairs pairscards = new Pairs();
        return pairscards.match(hand);
    }

    @Override
    Higth getidentifyOperation() {
        return Higth.PAIR;
    }
}
