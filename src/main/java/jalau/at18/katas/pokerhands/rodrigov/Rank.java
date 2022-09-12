package jalau.at18.katas.pokerhands.rodrigov;

public enum Rank {
    HIGHCARD(new HighCardIndetifier(), 1),
    PAIR(new OnePairIdentifier(), 2),
    TWOPAIRS(new TwoPairsIdentifier(), 3),
    THREEOFAKIND(new ThreeOfAKindIdentifier(), 4),
    STRAIGHT(new StraightIdentifier(), 5),
    FLUSH(new FlushIdenfier(), 6),
    FULLHOUSE(new FullHouseIdentifier(), 7),
    FOUROFAKIND(new FourOFKindIndentifier(), 8),
    STRAIGHTFLUSH(new StraightFlushIdentifier(), 9);

    private Identifier comparegame;
    private int score;

    Rank(Identifier comparegame, int score) {
        this.comparegame = comparegame;
        this.score = score;
    }

    public Identifier getIdentifyPokerhand() {
        return comparegame;
    }

    public int getScore() {
        return score;
    }
}
