package jalau.at18.katas.pokerhands.maria.Identifier;

import jalau.at18.katas.pokerhands.maria.*;

import java.util.List;

public class FourKindIdentifier implements PokerHandIdentifier {
    public static final int CARDS_SAME_VALUE = 4;
    private PokerHandAnalizer analizer;

    public FourKindIdentifier() {
        this.analizer = new PokerHandAnalizer();
    }

    @Override
    public boolean identify(PokerHand hand) {
        CardsWithSameValue cardsWithSameValueThree = new CardsWithSameValue(CARDS_SAME_VALUE);
        return analizer.analize(hand, cardsWithSameValueThree);
    }

    @Override
    public PokerHandRank getRank(PokerHand hand) {
        CardValuesCounter counter = new CardValuesCounter(hand);
        CardValuesCount count = counter.getCount();
        CardValueGroup cardValueGroup = count.getCardValuesGroup();
        List<CardValue> listCardValue = cardValueGroup.getCardValues(CARDS_SAME_VALUE);
        PokerHandRank pokerHandRank = new PokerHandRank(PokerHandType.FOURKIND, listCardValue);
        return pokerHandRank;
    }
}
