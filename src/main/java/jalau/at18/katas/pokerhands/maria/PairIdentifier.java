package jalau.at18.katas.pokerhands.maria;

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
        return null;
    }
}
