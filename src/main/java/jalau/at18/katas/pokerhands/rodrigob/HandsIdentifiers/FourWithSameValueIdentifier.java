package jalau.at18.katas.pokerhands.rodrigob.HandsIdentifiers;

import jalau.at18.katas.pokerhands.rodrigob.Cards.Card;
import jalau.at18.katas.pokerhands.rodrigob.CardsPatterns.CardValuesCount;
import jalau.at18.katas.pokerhands.rodrigob.CardsPatterns.CardValuesCounter;
import jalau.at18.katas.pokerhands.rodrigob.CardsPatterns.CardsWithSameValue;
import jalau.at18.katas.pokerhands.rodrigob.PokerHands.PokerHand;
import jalau.at18.katas.pokerhands.rodrigob.PokerHands.PokerHandAnalizer;

public class FourWithSameValueIdentifier extends HandType {

    private static final int CARDS_WITH_SAME_VALUE = 4;
    private PokerHandAnalizer analizer;
    private int numericValue;

    public FourWithSameValueIdentifier() {
        this.analizer = new PokerHandAnalizer();
        this.numericValue = 0;
    }

    @Override
    public boolean identify(PokerHand hand) {
        CardsWithSameValue cardsWithSameValue = new CardsWithSameValue(CARDS_WITH_SAME_VALUE);
        return analizer.analize(hand, cardsWithSameValue);
    }

    @Override
    public int getCardRankedValue(PokerHand hand) {
        CardValuesCounter counter = new CardValuesCounter(hand);
        CardValuesCount count = counter.getCount();
        maximumValue(hand, count);
        return numericValue;
    }

    public void maximumValue(PokerHand hand, CardValuesCount count) {
        for (Card card : hand.getCards()) {
            if (count.get(card.getValue()) == CARDS_WITH_SAME_VALUE) {
                numericValue = card.getValue().getNumericValue();
            }
        }
    }

}
