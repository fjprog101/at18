package jalau.at18.katas.pokerhands.mauricio;

public class FullHouseComparer {
    private FourOfAKindComparer fourOfAKindComparer = new FourOfAKindComparer();


    public Boolean fullHouseCase(PokerHand black, PokerHand white, CardValue value1, CardValue value2) {
        return (new FullHouseIdentifier(value1, value2).identify(black)
                && !new FourOfAKindIdentifier(value1, value2).identify(white)) ? true
                        : fourOfAKindComparer.fourOfAKindCase(black, white, value1, value2);
    }
}
