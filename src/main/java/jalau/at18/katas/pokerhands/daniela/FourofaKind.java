package jalau.at18.katas.pokerhands.daniela;

public class FourofaKind extends CardsPattern {
    private final int four = 4;
    private final int othercard = 1;

    public FourofaKind() {
    }

    @Override
    public boolean match(PokerHand handWith4SimilarCards) {
        return fourKind(handWith4SimilarCards);
    }

    public boolean fourKind(PokerHand hand) {
        CardValuesCounter cardValuesCounter = new CardValuesCounter(hand);
        CardValuesCount count = cardValuesCounter.getCount();
        return count.exists(four) && count.exists(othercard);
    }
}
