package jalau.at18.katas.pokerhands.daniela;

public class Twopairidentifier extends CompareGame {
    private PokerHandAnalizer analizer;

    public Twopairidentifier() {
        this.analizer = new PokerHandAnalizer();
    }

    @Override
    public boolean identify(PokerHand hand) {
        Pairs twopairs = new Pairs();
        return analizer.analize(hand, twopairs);
    }

}
