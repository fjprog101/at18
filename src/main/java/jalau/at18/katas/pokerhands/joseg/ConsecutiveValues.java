package jalau.at18.katas.pokerhands.joseg;

public class ConsecutiveValues {

    private CardComparer comparer;

    public ConsecutiveValues() {
        this.comparer = new CardComparer();
    }

    public boolean match(PokerHand hand) {
        boolean areConsecutive = true;
        for (int index = 0; areConsecutive && index < hand.getCards().length - 1; index++) {
            areConsecutive = comparer.areConsecutive(hand.getCards()[index], hand.getCards()[index + 1]);
        }
        return areConsecutive;
    }

}
