package jalau.at18.katas.pokerhands.daniela;

public class ThreeofaKindIdentifier extends CompareGame {
    private PokerHandAnalizer analizer;
    private CardValue value1;
    private CardValue value2;

    public ThreeofaKindIdentifier(CardValue value1, CardValue value2) {
        this.analizer = new PokerHandAnalizer();
        this.value1 = value1;
        this.value2 = value2;
    }

    @Override
    public boolean identify(PokerHand hand) {
        // Analice this class
        ThreeofaKind threecards = new ThreeofaKind(value1, value2);
        return analizer.analize(hand, threecards);
    }
}
