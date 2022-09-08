package jalau.at18.katas.pokerhands.rodrigov;
public class ThreeOfAKind {
    private boolean flagThreeOfKind;
    private int count = 0;
    private int equalsCount = 0;

    public boolean identifyThreeOfKind() {
        flagThreeOfKind = equalsCount == 2 ? true : false;
        return flagThreeOfKind;
    }

    public int compareCardsThreeofKind(PokerHand hand, CardComparer comparer) {
        for (int index = 0; index < hand.getCards().length - 1; index++) {
            conditionalThreeOfKind(comparer, hand, index);
        }
        return equalsCount;
    }

    public void conditionalThreeOfKind(CardComparer comparer, PokerHand hand, Integer index) {
        if (comparer.haveSameValue(hand.getCards()[index], hand.getCards()[index + 1])) {
            incrementCount();
        } else {
            count = 0;
        }
    }

    public void incrementCount() {
        count++;
        if (count == 2) {
            equalsCount = count;
        }
    }
}