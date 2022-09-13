package jalau.at18.katas.pokerhands.joser;

public class High {
    private PokerHandAnalizer pokerHandAnalizer;
    public High() {
        this.pokerHandAnalizer = new PokerHandAnalizer();
    }

    public boolean identify(PokerHand hand) {
        HighPattern pair = new HighPattern();
        return pokerHandAnalizer.analize(hand, pair);
    }
}
