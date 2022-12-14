package jalau.at18.katas.pokerhands.carlos;

public class ThreeOfAKind {
    private static int count = 0;
    public ThreeOfAKind() {
    }

    public boolean identifyThreeOfAKind(PokerHand hand) {
        boolean threeKindIndentifier = false;
        CardComparer comparer = new CardComparer();
        count = threeKindCounter(hand, comparer);
        if (count == 1) {
            threeKindIndentifier = true;
        }
        return threeKindIndentifier;
    }

    private static int threeKindCounter(PokerHand hand, CardComparer comparer) {
        for (int index = 0; index < hand.getCards().length - 2; index++) {
            if (comparer.haveSameValue(hand.getCards()[index], hand.getCards()[index + 1])) {
                if (comparer.haveSameValue(hand.getCards()[index], hand.getCards()[index + 2])) {
                    count++;
                    index = index + 2;
                }
            }
        }
        return count;
    }
}
