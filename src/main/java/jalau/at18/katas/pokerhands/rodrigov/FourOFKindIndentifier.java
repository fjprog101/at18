package jalau.at18.katas.pokerhands.rodrigov;

public class FourOFKindIndentifier extends Identifier {
    private PokerHandAnalizer pokerHandAnalizer;
    public FourOFKindIndentifier() {
        pokerHandAnalizer =  new PokerHandAnalizer();
    }
    @Override
    boolean identify(PokerHand hand) {
        FourOfKind fourOfKind = new FourOfKind();
        return pokerHandAnalizer.analize(hand, fourOfKind);
    }
    @Override
    Rank identifyRank() {
        // TODO Auto-generated method stub
        return null;
    }


}