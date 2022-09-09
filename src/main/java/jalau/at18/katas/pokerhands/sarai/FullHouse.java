package jalau.at18.katas.pokerhands.sarai;

public class FullHouse extends CardsPattern {

    private final int pairsnumbersthree = 3;
    private final int pairsnumberstwo = 2;
    private boolean ifFullHouse = false;

    @Override
    public boolean match(PokerHand hand) {
        CardValuesCounter counter = new CardValuesCounter(hand);
        CardValuesCount count = counter.getCount();
        comparer(count);
        return ifFullHouse;
    }
    public void comparer(CardValuesCount count) {
        if (count.exists(pairsnumbersthree) && count.exists(pairsnumberstwo)) {
            ifFullHouse = true;
        }
    }
    Higth getidentifyOptions() {
        return Higth.FULLHOUSE;
    }
}

