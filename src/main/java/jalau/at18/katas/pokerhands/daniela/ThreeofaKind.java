package jalau.at18.katas.pokerhands.daniela;

public class ThreeofaKind extends CardsPattern {
    private final int threecards = 3;
    private final int othercard = 1;

    public ThreeofaKind() {

    }

    @Override
    public boolean match(PokerHand handWith3SimilarCards) {
        return threeKind(handWith3SimilarCards);
    }

    public boolean threeKind(PokerHand hand) {
        CardValuesCounter cardValuesCounter = new CardValuesCounter(hand);
        CardValuesCount count = cardValuesCounter.getCount();
        return count.exists(threecards) && count.exists(othercard);
    }
}
