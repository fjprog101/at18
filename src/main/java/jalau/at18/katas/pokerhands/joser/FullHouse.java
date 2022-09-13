package jalau.at18.katas.pokerhands.joser;

public class FullHouse {
    private PokerHandAnalizer pokerHandAnalizer;

    public FullHouse() {
        this.pokerHandAnalizer = new PokerHandAnalizer();
    }

    public boolean identify(PokerHand hand) {
        System.out.println(hand.toString());
        ThreeKindPattern three = new ThreeKindPattern();
        PairPattern pair = new PairPattern();
        return pokerHandAnalizer.analize(hand, three) && pokerHandAnalizer.analize(hand, pair);
    }
}
