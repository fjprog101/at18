package jalau.at18.katas.pokerhands.rodrigov;

public class TwoPairs extends CardsPattern {
    private final int twoPairs = 2;

    @Override
    public boolean match(PokerHand hand) {
        PairsCounter pairsCounter = new PairsCounter(hand);
        return pairsCounter.getArraySize() == twoPairs;
    }

}
