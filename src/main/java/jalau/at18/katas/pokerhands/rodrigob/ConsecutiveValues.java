package jalau.at18.katas.pokerhands.rodrigob;

public class ConsecutiveValues extends CardsPattern {

    private CardComparer comparer;

    public ConsecutiveValues() {
        this.comparer = new CardComparer();
    }

    @Override
    public boolean match(PokerHand hand) {
        boolean areConsecutive = true;
        for (int index = 0; areConsecutive && index < hand.getCards().size() - 1; index++) {
            areConsecutive = comparer.areConsecutive(hand.getCards().get(index), hand.getCards().get(index + 1));
        }
        return areConsecutive;
    }

}
