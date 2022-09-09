package jalau.at18.katas.pokerhands.rodrigob;

public class FlushIdentifier extends HandType {

    private static final int SIZE_CARD_LIST = 5;
    private PokerHandAnalizer analizer;

    public FlushIdentifier() {
        this.analizer = new PokerHandAnalizer();
    }

    @Override
    public boolean identify(PokerHand hand) {
        AllSameSuit allSameSuit = new AllSameSuit();
        return analizer.analize(hand, allSameSuit);
    }

    @Override
    public int getCardRankedValue(PokerHand hand) {
        return hand.getCards().get(SIZE_CARD_LIST - 1).getValue().getNumericValue();
    }

}
