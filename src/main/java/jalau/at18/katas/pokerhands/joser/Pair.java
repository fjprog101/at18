package jalau.at18.katas.pokerhands.joser;

public class Pair {
    private PokerHandAnalizer pokerHandAnalizer;
    public Pair() {
        this.pokerHandAnalizer = new PokerHandAnalizer();
    }

    public boolean identify(PokerHand hand) {
        System.out.println(hand.toString());
        PairPattern pair = new PairPattern();
        return pokerHandAnalizer.analize(hand, pair);
    }
}
