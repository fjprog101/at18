package jalau.at18.katas.pokerhands.rodrigob;

public class AllSameSuit extends CardsPattern {

    private CardComparer comparer;

    public AllSameSuit() {
        this.comparer = new CardComparer();
    }

    @Override
    public boolean match(PokerHand hand) {
        boolean areSameSuit = true;
        for (int index = 0; areSameSuit && index < hand.getCards().size() - 1; index++) {
            areSameSuit = comparer.haveSameSuit(hand.getCards().get(index), hand.getCards().get(index + 1));
        }
        return areSameSuit;
    }

}
