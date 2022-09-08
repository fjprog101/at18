package jalau.at18.katas.pokerhands.daniela;

public class FullHouseidentify extends CompareGame {
    private PokerHandAnalizer analizer;
    private CardValue value1;
    private CardValue value2;

    public FullHouseidentify(CardValue value1, CardValue value2) {
        this.value1 = value1;
        this.value2 = value2;
        this.analizer = new PokerHandAnalizer();
    }

    @Override
    public boolean identify(PokerHand hand) {
        // Analice this class
        FullHouse fullhouse = new FullHouse(value1, value2);
        return analizer.analize(hand, fullhouse);
    }
}
