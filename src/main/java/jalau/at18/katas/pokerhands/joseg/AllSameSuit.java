package jalau.at18.katas.pokerhands.joseg;

public class AllSameSuit {

    private CardComparer comparer;

    public AllSameSuit() {
        this.comparer = new CardComparer();
    }

    public boolean match(PokerHand hand) {
        boolean areSameSuit = true;
        for (int index = 0; areSameSuit && index < hand.getCards().length - 1; index++) {
            areSameSuit = comparer.haveSameSuit(hand.getCards()[index], hand.getCards()[index + 1]);
        }
        return areSameSuit;
    }

}
