package jalau.at18.katas.pokerhands.sergio;

public enum ListPatterns {
    STRAIGHTFLUSH(10, new StraightFlushIdentifier()),
    POKER(9, new PokerIdentifier()),
    FULLHOUSE(8, new FullHouseIdentifier()),
    FLUSH(7, new FlushIdentifier()),
    STRAIGHT(6, new StraightIdentifier()),
    THREEOFKIND(5, new ThreeOfKindIdentifier()),
    TWOPAIRS(4, new TwoPairsIdentifier()),
    PAIR(2, new OnePairIdentifier());
    private int score;
    private CardsPattern cardsPattern;

    ListPatterns(int score, CardsPattern cardsPattern) {
        this.score = score;
        this.cardsPattern = cardsPattern;
    }

    public int patternScore() {
        return score;
    }
    public CardsPattern identifyCardsPattern() {
        return cardsPattern;
    }


}
