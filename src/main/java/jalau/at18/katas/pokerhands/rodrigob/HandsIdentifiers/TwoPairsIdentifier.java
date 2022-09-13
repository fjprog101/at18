package jalau.at18.katas.pokerhands.rodrigob.HandsIdentifiers;

import jalau.at18.katas.pokerhands.rodrigob.Cards.Card;
import jalau.at18.katas.pokerhands.rodrigob.CardsPatterns.CardValuesCount;
import jalau.at18.katas.pokerhands.rodrigob.CardsPatterns.CardValuesCounter;
import jalau.at18.katas.pokerhands.rodrigob.CardsPatterns.NumberOfPairs;
import jalau.at18.katas.pokerhands.rodrigob.PokerHands.PokerHand;
import jalau.at18.katas.pokerhands.rodrigob.PokerHands.PokerHandAnalizer;

public class TwoPairsIdentifier extends HandType {

    private static final int NUMBER_PAIR = 2;
    private static final int CARDS_WITH_SAME_VALUE = 2;
    private PokerHandAnalizer analizer;
    private int numericValue;

    public TwoPairsIdentifier() {
        this.analizer = new PokerHandAnalizer();
        this.numericValue = 0;
    }

    @Override
    public boolean identify(PokerHand hand) {
        NumberOfPairs numberOfPairs = new NumberOfPairs(NUMBER_PAIR);
        return analizer.analize(hand, numberOfPairs);
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
