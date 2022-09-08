package jalau.at18.katas.pokerhands.mauricio;

public class TwoPairsComparer {
    private ThreeOfAKindComparer threeOfAKindComparer = new ThreeOfAKindComparer();

    public Boolean twoPairsCase(PokerHand black, PokerHand white, CardValue value1, CardValue value2) {
        return (new TwoPairsIdentifier(value1, value2).identify(black)
                && !new ThreeOfKindIdentifier(value1, value2).identify(white)) ? true
                        : threeOfAKindComparer.threeOfAKindCase(black, white, value1, value2);
    }
}
