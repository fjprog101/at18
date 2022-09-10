package jalau.at18.katas.pokerhands.maria.Identifier;

import jalau.at18.katas.pokerhands.maria.*;

import java.util.Collections;
import java.util.List;

public class TwoPairsIdentifier implements PokerHandIdentifier {
    private PokerHandAnalizer analizer;

    public TwoPairsIdentifier() {
        this.analizer = new PokerHandAnalizer();
    }

    @Override
    public boolean identify(PokerHand hand) {
        CardsWithTwoPairs cardsWithTwoPairs = new CardsWithTwoPairs();
        return analizer.analize(hand, cardsWithTwoPairs);
    }

    @Override
    public PokerHandRank getRank(PokerHand hand) {
        CardValuesCounter cardValuesCounter = new CardValuesCounter(hand);
        CardValuesCount cardValuesCount = cardValuesCounter.getCount();
        CardValueGroup cardValueGroup = cardValuesCount.getCardValuesGroup();
        List<CardValue> listCardValue = cardValueGroup.getCardValues(2);
        Collections.sort(listCardValue);
        PokerHandRank pokerHandRank = new PokerHandRank(PokerHandType.TWOPAIRS, listCardValue.get(0));
        return pokerHandRank;
    }

}
