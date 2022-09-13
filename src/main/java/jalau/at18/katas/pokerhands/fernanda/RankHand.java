package jalau.at18.katas.pokerhands.fernanda;

public enum RankHand {

    PAIR(new PairIdentifier(), 1),
    TWOPAIRS(new TwoPairsIdentifier(), 2),
    THREEOFAKIND(new ThreeOfAKindIdentifier(), 3),
    STRAIGHT(new StraightIdentifier(), 4),
    FLUSH(new FlushIdentifier(), 5),
    FOUROFAKIND(new FourOfAKindIdentifier(), 6),
    FULLHOUSE(new FullHouseIdentifier(), 7),
    STRAIGHTFLUSH(new StraightFlushIdentifier(), 8);

    private Identifier hand;
    private int point;

    RankHand(Identifier hand, int point) {
        this.hand = hand;
        this.point = point;
    }

    public Identifier identifyPokerhand() {
        return hand;
    }

    public int getPoint() {
        return point;
    }

}
