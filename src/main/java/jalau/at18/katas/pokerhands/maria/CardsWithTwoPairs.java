package jalau.at18.katas.pokerhands.maria;

public class CardsWithTwoPairs extends CardsPattern {
    public static final int COUNT_PAIRS = 4;

    @Override
    boolean match(PokerHand hand) {
        CardValuesCounter cardValuesCounter = new CardValuesCounter(hand);
        CardValuesCount cardValuesCount = cardValuesCounter.getCount();
        int countPairs = getCountPairs(hand, cardValuesCount);
        return countPairs == COUNT_PAIRS;
    }

    private int getCountPairs(PokerHand hand, CardValuesCount cardValuesCount) {
        int countPairs = 0;
        for (Card card : hand.getCards()) {
            if (cardValuesCount.get(card.getValue()) == 2) {
                countPairs++;
            }
        }
        return countPairs;
    }
}
