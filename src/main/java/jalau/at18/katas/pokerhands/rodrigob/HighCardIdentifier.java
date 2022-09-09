package jalau.at18.katas.pokerhands.rodrigob;


public class HighCardIdentifier extends HandType {

    private static final int SIZE_CARD_LIST = 5;

    @Override
    boolean identify(PokerHand hand) {
        return true;
    }

    @Override
    int getCardRankedValue(PokerHand hand) {
        return hand.getCards().get(SIZE_CARD_LIST - 1).getValue().getNumericValue();
    }

}
