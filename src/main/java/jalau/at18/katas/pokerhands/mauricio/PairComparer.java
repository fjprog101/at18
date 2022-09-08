package jalau.at18.katas.pokerhands.mauricio;

public class PairComparer {
    private TwoPairsComparer twoPairsComparer = new TwoPairsComparer();

    public Boolean pairCase(PokerHand black, PokerHand white, CardValue value1, CardValue value2) {
        return (new PairIdentifier(value1, value2).identify(black)
                && !new TwoPairsIdentifier(value1, value2).identify(white)) ? true
                        : twoPairsComparer.twoPairsCase(black, white, value1, value2);
    }
}
