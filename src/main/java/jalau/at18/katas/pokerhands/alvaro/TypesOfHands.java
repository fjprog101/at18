package jalau.at18.katas.pokerhands.alvaro;

public enum TypesOfHands {
    HIGHCARD(new HighCardIdentifier(), 1, "HighCard"),
    PAIR(new PairIdentifier(), 2, "Pair"),
    TWOPAIR(new TwoPairIdentifier(), 3, "TwoPair"),
    THREEOFAKIND(new ThreeOfAKindIdentifier(), 4, "Three Of a Kind"),
    STRAIGHT(new StraightIdentifier(), 5, "Straight"),
    FLUSH(new FlushIdentifier(), 6, "Flush"),
    FULLHOUSE(new FullHouseIdentifier(), 7, "Full House"),
    FOUROFAKIND(new FourOfAKindIdentifier(), 8, "Four of a Kind"),
    STRAIGHTFLUSH(new StraightFlushIdentifier(), 9, "Straight Flush");

    private Identifiers identifiers;
    private int rankValue;
    private String typeOfHand;
    TypesOfHands(Identifiers identifiers, int rankValue, String typeOfHand) {
        this.identifiers = identifiers;
        this.rankValue = rankValue;
        this.typeOfHand = typeOfHand;
    }
    public Identifiers getTypeHand() {
        return identifiers;
    }
    public int getRankValue() {
        return rankValue;
    }
    public String getHand() {
        return typeOfHand;
    }
}
