package jalau.at18.katas.pokerhands.daniela;

public class Twopairidentifier {
    private PokerHandAnalizer analizer;

    public Twopairidentifier() {
        this.analizer = new PokerHandAnalizer();
    }

    public boolean identify(PokerHand hand) {
        Pairs twopairs = new Pairs();
        return analizer.analize(hand, twopairs);
    }

}
