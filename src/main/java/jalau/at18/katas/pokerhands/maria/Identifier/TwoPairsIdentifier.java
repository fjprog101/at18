package jalau.at18.katas.pokerhands.maria.Identifier;

import jalau.at18.katas.pokerhands.maria.*;

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
        PokerHandRank pokerHandRank = new PokerHandRank(PokerHandType.TWOPAIRS, CardValue.ACE);
        return pokerHandRank;
    }

}
