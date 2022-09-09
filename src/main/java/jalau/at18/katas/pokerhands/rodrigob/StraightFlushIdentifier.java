package jalau.at18.katas.pokerhands.rodrigob;

public class StraightFlushIdentifier extends HandType {

    private static final int SIZE_CARD_LIST = 5;

    private PokerHandAnalizer analizer;

    public StraightFlushIdentifier() {
        this.analizer = new PokerHandAnalizer();
    }

    @Override
    public boolean identify(PokerHand hand) {
        AllSameSuit allSameSuit = new AllSameSuit();
        ConsecutiveValues consecutiveValues = new ConsecutiveValues();
        return analizer.analize(hand, allSameSuit) && analizer.analize(hand, consecutiveValues);
    }

    @Override
    public int getCardRankedValue(PokerHand hand) {
        return hand.getCards().get(SIZE_CARD_LIST - 1).getValue().getNumericValue();
    }
}
