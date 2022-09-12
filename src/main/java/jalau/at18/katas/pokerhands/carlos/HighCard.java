package jalau.at18.katas.pokerhands.carlos;

public class HighCard {
    public int identifyHighCard(PokerHand hand) {
        int count = hand.getCards()[0].getValue().ordinal();
        for (int index = 1; index < hand.getCards().length; index++) {
            if (hand.getCards()[index].getValue().ordinal() < count) {
                count = hand.getCards()[index].getValue().ordinal();
            }
        }
        return count;
    }
}
