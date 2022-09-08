package jalau.at18.katas.pokerhands.libertad;

public class HighCardIdentifier implements Identifier {
    private PokerHandAnalizer pokerHandAnalizer;

    public HighCardIdentifier() {
        pokerHandAnalizer = new PokerHandAnalizer();
    }
    @Override
    public boolean identify(PokerHand hand) {
        AllDiferentsCards diferentsCards = new AllDiferentsCards();
        return pokerHandAnalizer.analize(hand, diferentsCards);
    }
}
