package jalau.at18.katas.pokerhands.roberto;

public class TwoPairIdentifier {

    public TwoPairIdentifier() {
    }

    public boolean identify(PokerHand hand) {
        CardComparer cardComparer = new CardComparer();
        int count = 0;
        count = getPairFromHand(hand, cardComparer, count);
        return count >= 2;
    }

    private static int getPairFromHand(PokerHand hand, CardComparer cardComparer, int count) {
        for (int index = 0; index < hand.getCards().length - 1; index++) {
            if (cardComparer.haveSameValue(hand.getCards()[index], hand.getCards()[index + 1])) {
                count++;
                index++;
            }
        }
        return count;
    }
}