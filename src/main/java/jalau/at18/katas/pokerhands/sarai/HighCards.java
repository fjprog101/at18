package jalau.at18.katas.pokerhands.sarai;

public class HighCards extends CardsPattern {

    private int existingCount = 0;
    private final int pairsnumbers = 5;
    private boolean ifTwoPairs = false;

    @Override
    public boolean match(PokerHand hand) {
        CardValuesCounter counter = new CardValuesCounter(hand);
        CardValuesCount count = counter.getCount();
        for (int index = 0; index < hand.getCards().length; index++) {
            pairs(hand, count, index);
        }
        return ifTwoPairs;
    }
    public void pairs(PokerHand hand, CardValuesCount count, int index) {
        if (count.get(hand.getCards()[index].getValue()) == 1) {
            existingCount += 1;
        }
        if (existingCount == pairsnumbers) {
            ifTwoPairs = true;
        }
    }
}
