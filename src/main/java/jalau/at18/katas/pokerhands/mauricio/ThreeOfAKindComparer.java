package jalau.at18.katas.pokerhands.mauricio;

public class ThreeOfAKindComparer {
    private StraightComparer straightComparer = new StraightComparer();

    public Boolean threeOfAKindCase(PokerHand black, PokerHand white, CardValue value1, CardValue value2) {
        return (new ThreeOfKindIdentifier(value1, value2).identify(black)
                && !new StraightIdentifier().identify(white)) ? true
                        : straightComparer.straightCase(black, white, value1, value2);
    }
}
