package jalau.at18.katas.pokerhands.daniela;

public class FourodaKindIdentifier extends CompareGame {
    private PokerHandAnalizer analizer;

    public FourodaKindIdentifier() {
        this.analizer = new PokerHandAnalizer();

    }

    @Override
    public boolean identify(PokerHand hand) {
        FourofaKind fourcards = new FourofaKind();
        return analizer.analize(hand, fourcards);
    }

    @Override
    Rank getidentifyPokerhand() {
        return Rank.FOUROFAKIND;
    }
}
