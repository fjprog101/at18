package jalau.at18.katas.pokerhands.alvaro;

public enum TypesOfHands {
    HIGHCARD(new HighCardIdentifier(), 1),
    PAIR(new PairIdentifier(), 2),
    TWOPAIR(new TwoPairIdentifier(), 3),
    THREEOFAKIND(new ThreeOfAKindIdentifier(), 4),
    STRAIGHT(new StraightIdentifier(), 5),
    FLUSH(new FlushIdentifier(), 6),
    FULLHOUSE(new FullHouseIdentifier(), 7),
    FOUROFAKIND(new FourOfAKindIdentifier(), 8),
    STRAIGHTFLUSH(new StraightFlushIdentifier(), 9);

    private Identifiers identifiers;
    private int rankValue;
    TypesOfHands(Identifiers identifiers, int rankValue) {
        this.identifiers = identifiers;
        this.rankValue = rankValue;
    }
    public Identifiers getTypeHand() {
        return identifiers;
    }
    public int getRankValue() {
        return rankValue;
    }
}
