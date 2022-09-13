package jalau.at18.katas.pokerhands.maria.Identifier;

import jalau.at18.katas.pokerhands.maria.*;

import java.util.List;

public class ThreeKindIdentifier implements PokerHandIdentifier {
    public static final int CARDS_SAME_VALUE = 3;
    private PokerHandAnalizer analizer;

    public ThreeKindIdentifier() {
        this.analizer = new PokerHandAnalizer();
    }

    @Override
    public boolean identify(PokerHand hand) {
        CardsWithSameValue cardsWithSameValue = new CardsWithSameValue(CARDS_SAME_VALUE);
        return analizer.analize(hand, cardsWithSameValue);
    }

    @Override
    public PokerHandRank getRank(PokerHand hand) {
        CardValuesCounter cardValuesCounter = new CardValuesCounter(hand);
        CardValuesCount cardValuesCount = cardValuesCounter.getCount();
        CardValueGroup cardValueGroup = cardValuesCount.getCardValuesGroup();
        List<CardValue> cardValue = cardValueGroup.getCardValues(CARDS_SAME_VALUE);
        PokerHandRank pokerHandRank = new PokerHandRank(PokerHandType.THREEKIND, cardValue);
        return pokerHandRank;
    }
}
