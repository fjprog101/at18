package jalau.at18.katas.pokerhands.mauricio;

public class FullHouseComparer {
    private PokerHandComparer comparer = new PokerHandComparer();
    private FourOfAKindComparer fourOfAKindComparer = new FourOfAKindComparer();

    public Boolean fullHouseCase(PokerHand black, PokerHand white, CardValue value1, CardValue value2) {
        return (comparer.comparer(black, new FullHouseIdentifier(value1, value2))
                && !comparer.comparer(white, new FourOfAKindIdentifier(value1, value2))
                && comparer.comparer(white, new StraightFlushIdentifier())) ? true
                        : fourOfAKindComparer.fourOfAKindCase(black, white, value1, value2);
    }
}
