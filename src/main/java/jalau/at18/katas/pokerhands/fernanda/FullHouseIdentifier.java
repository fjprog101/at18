package jalau.at18.katas.pokerhands.fernanda;

public class FullHouseIdentifier extends Identifier {
    private PokerHandAnalizer analizer;

    public FullHouseIdentifier() {
        this.analizer = new PokerHandAnalizer();
    }

    public boolean identify(PokerHand hand) {
        TwoValuesinHand twovaluesinhand = new TwoValuesinHand();
        ThreeOFAKind threeofakind = new ThreeOFAKind();
        return analizer.analize(hand, threeofakind) && analizer.analize(hand, twovaluesinhand);
    }


}
