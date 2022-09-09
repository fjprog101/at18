package jalau.at18.katas.pokerhands.sarai;

public class PairsIdentify {
    public boolean identifyPairs(PokerHand hand) {
        Pairs pairscards = new Pairs();
        return pairscards.match(hand);
    }
}
