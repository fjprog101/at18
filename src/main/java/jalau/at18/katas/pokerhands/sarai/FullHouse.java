package jalau.at18.katas.pokerhands.sarai;

public class FullHouse extends CardsPattern {
    private int existingCount = 0;
    private int existingCountTwo = 0;
    private final int pairsnumbersthree = 3;
    private final int pairsnumberstwo = 2;
    private boolean ifFullHouse = false;
    private boolean ifFullHouseTwo = false;

    @Override
    public boolean match(PokerHand hand) {
        CardValuesCounter counter = new CardValuesCounter(hand);
        CardValuesCount count = counter.getCount();
        for (int index = 0; index < hand.getCards().length; index++) {
            pairs(hand, count, index);
        }
        comparer(count);
        return ifFullHouse == ifFullHouseTwo;
    }
    public void pairs(PokerHand hand, CardValuesCount count, int index) {
        if (count.get(hand.getCards()[index].getValue()) == pairsnumbersthree && count.get(hand.getCards()[index].getValue()) == pairsnumberstwo) {
            existingCount += 1;
            existingCountTwo += 1;
        }
    }
    public void comparer(CardValuesCount count) {
        if (count.exists(pairsnumbersthree)) {
            ifFullHouse = true;
        }
        if (count.exists(pairsnumberstwo)) {
            ifFullHouseTwo = true;
        }
    }
}

