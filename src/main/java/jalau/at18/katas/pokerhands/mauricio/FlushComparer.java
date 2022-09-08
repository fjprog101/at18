package jalau.at18.katas.pokerhands.mauricio;

public class FlushComparer {
    private FullHouseComparer fullHouseComparer = new FullHouseComparer();

    public Boolean flushCase(PokerHand black, PokerHand white, CardValue value1, CardValue value2) {
        return (new FlushIdentifier().identify(black)
                && !new FullHouseIdentifier(value1, value2).identify(white)) ? true
                        : fullHouseComparer.fullHouseCase(black, white, value1, value2);
    }
}
