package jalau.at18.katas.pokerhands.mauricio;

public class TwoPairsComparer {
    private PokerHandComparer comparer = new PokerHandComparer();
    private ThreeOfAKindComparer threeOfAKindComparer = new ThreeOfAKindComparer();

    public Boolean twoPairsCase(PokerHand black, PokerHand white, CardValue value1, CardValue value2) {
        return (comparer.comparer(black, new TwoPairsIdentifier(value1, value2))
                && !comparer.comparer(white, new ThreeOfKindIdentifier(value1, value2))
                && !comparer.comparer(white, new StraightIdentifier())) ? true
                        : threeOfAKindComparer.threeOfAKindCase(black, white, value1, value2);
    }
}
