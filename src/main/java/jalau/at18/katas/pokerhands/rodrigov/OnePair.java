package jalau.at18.katas.pokerhands.rodrigov;

public class OnePair extends CardsPattern {
    private final int onePair = 1;

    @Override
    boolean match(PokerHand hand) {
        PairsCounter pairsCounter = new PairsCounter(hand);
        return pairsCounter.getArraySize() == onePair;
    }
}
