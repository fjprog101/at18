package jalau.at18.katas.pokerhands.carlos;

public class FourOfAKind extends CardsPattern {
    private int count = 0;
    public static final int indexCard = 3;
    public FourOfAKind() {
    }

    private int fourKindCounter(PokerHand hand, CardComparer comparer) {
        for (int index = 0; index < hand.getCards().length - 2; index++) {
            if (comparer.haveSameValue(hand.getCards()[index], hand.getCards()[index + 2])) {
                if (comparer.haveSameValue(hand.getCards()[index + 1], hand.getCards()[index + indexCard])) {
                    count++;
                    index = index + indexCard;
                }
            }
        }
        return count;
    }

    @Override
    boolean match(PokerHand hand) {
        boolean fourKindIndentifier = false;
        CardComparer comparer = new CardComparer();
        count = fourKindCounter(hand, comparer);
        if (count == 1) {
            fourKindIndentifier = true;
        }
        return fourKindIndentifier;
    }
}
