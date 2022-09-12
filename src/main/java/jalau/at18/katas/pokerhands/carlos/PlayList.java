package jalau.at18.katas.pokerhands.carlos;

public enum PlayList {
    STRAIGHTFLUSH(10, new StraightFlushIdentifier()),
    POKER(9, new FourOfAKind()),
    FULLHOUSE(8, new FullHouse()),
    FLUSH(7, new FlushIdentifier()),
    STRAIGHT(6, new StraightIdentifier()),
    THREEOFKIND(5, new ThreeOfAKind()),
    TWOPAIRS(4, new Pairs());
    private int score;
    private CardsPattern cardsPattern;

    PlayList(int score, CardsPattern cardsPattern) {
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

