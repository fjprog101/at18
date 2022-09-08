package jalau.at18.katas.pokerhands.daniela;

public enum Rank {
    HIGHCARD(new HighCardIdentifier(), 1),
    PAIR(new OnePairIdentifier(), 2),
    TWOPAIRS(new Twopairidentifier(), 3),
    THREEOFAKIND(new ThreeofaKindIdentifier(), 4),
    STRAIGHT(new Straightidentify(), 5),
    FLUSH(new Flush(), 6),
    FULLHOUSE(new FullHouseidentify(), 7),
    FOUROFAKIND(new FourodaKindIdentifier(), 8),
    STRAIGHTFLUSH(new StraightFlushIdentifier(), 9);

    private CompareGame comparegame;
    private int score;

    Rank(CompareGame comparegame, int score) {
        this.comparegame = comparegame;
        this.score = score;
    }

    public CompareGame getidentifyPokerhand() {
        return comparegame;
    }

    public int getScore() {
        return score;
    }

}
