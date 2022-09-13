package jalau.at18.katas.pokerhands.maria.Identifier;

import jalau.at18.katas.pokerhands.maria.*;

import java.util.Arrays;

public class PairIdentifier implements PokerHandIdentifier {
    private PokerHandAnalizer analizer;

    public PairIdentifier() {
        this.analizer = new PokerHandAnalizer();
    }

    @Override
    public boolean identify(PokerHand hand) {
        CardsWithSameValue cardsWithSameValue = new CardsWithSameValue(2);
        return analizer.analize(hand, cardsWithSameValue);
    }

    @Override
    public PokerHandRank getRank(PokerHand hand) {
        CardValuesCounter cardValuesCounter = new CardValuesCounter(hand);
        CardValuesCount cardValuesCount = cardValuesCounter.getCount();
        CardValueGroup cardValueGroup = cardValuesCount.getCardValuesGroup();
        CardValue cardValue = cardValueGroup.getCardValues(2).get(0);
        PokerHandRank pokerHandRank = new PokerHandRank(PokerHandType.PAIR, Arrays.asList(cardValue));
        return pokerHandRank;
    }
}
