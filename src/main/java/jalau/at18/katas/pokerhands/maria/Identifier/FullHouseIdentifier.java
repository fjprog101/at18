package jalau.at18.katas.pokerhands.maria.Identifier;

import jalau.at18.katas.pokerhands.maria.*;

import java.util.List;

public class FullHouseIdentifier implements PokerHandIdentifier {
    public static final int CARDS_SAME_VALUE = 3;
    private PokerHandAnalizer analizer;

    public FullHouseIdentifier() {
        this.analizer = new PokerHandAnalizer();
    }

    @Override
    public boolean identify(PokerHand hand) {
        CardsWithSameValue cardsWithSameValueThree = new CardsWithSameValue(CARDS_SAME_VALUE);
        CardsWithSameValue cardsWithSameValueTwo = new CardsWithSameValue(2);

        return analizer.analize(hand, cardsWithSameValueThree) && analizer.analize(hand, cardsWithSameValueTwo);
    }

    @Override
    public PokerHandRank getRank(PokerHand hand) {
        CardValuesCounter cardValuesCounter = new CardValuesCounter(hand);
        CardValuesCount cardValuesCount = cardValuesCounter.getCount();
        CardValueGroup cardValueGroup = cardValuesCount.getCardValuesGroup();
        List<CardValue> listCardValue = cardValueGroup.getCardValues(CARDS_SAME_VALUE);
        PokerHandRank pokerHandRank = new PokerHandRank(PokerHandType.FULLHOUSE, listCardValue);
        return pokerHandRank;
    }
}
