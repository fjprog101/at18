package jalau.at18.katas.pokerhands.rodrigob.HandsIdentifiers;

import jalau.at18.katas.pokerhands.rodrigob.CardsPatterns.ConsecutiveValues;
import jalau.at18.katas.pokerhands.rodrigob.PokerHands.PokerHand;
import jalau.at18.katas.pokerhands.rodrigob.PokerHands.PokerHandAnalizer;

public class StraightIdentifier extends HandType {

    private static final int SIZE_CARD_LIST = 5;
    private PokerHandAnalizer analizer;

    public StraightIdentifier() {
        this.analizer = new PokerHandAnalizer();
    }

    @Override
    public boolean identify(PokerHand hand) {
        ConsecutiveValues consecutiveValues = new ConsecutiveValues();
        return analizer.analize(hand, consecutiveValues);
    }

    @Override
    public int getCardRankedValue(PokerHand hand) {
        return hand.getCards().get(SIZE_CARD_LIST - 1).getValue().getNumericValue();
    }
}
