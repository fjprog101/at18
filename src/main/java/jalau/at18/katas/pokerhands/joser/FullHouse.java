package jalau.at18.katas.pokerhands.joser;

public class FullHouse {
    private PokerHandAnalizer pokerHandAnalizer;

    public FullHouse() {
        this.pokerHandAnalizer = new PokerHandAnalizer();
    }

    public boolean identify(PokerHand hand) {
        FullHousePattern full = new FullHousePattern();
        return pokerHandAnalizer.analize(hand, full);
    }
}
