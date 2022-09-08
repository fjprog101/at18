package jalau.at18.katas.pokerhands.daniela;

public class ThreeofaKindIdentifier extends CompareGame {
    private PokerHandAnalizer analizer;

    public ThreeofaKindIdentifier() {
        this.analizer = new PokerHandAnalizer();
    }

    @Override
    public boolean identify(PokerHand hand) {
        // Analice this class
        ThreeofaKind threecards = new ThreeofaKind();
        return analizer.analize(hand, threecards);
    }

    @Override
    Rank getidentifyPokerhand() {
        return Rank.THREEOFAKIND;
    }
}
