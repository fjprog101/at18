package jalau.at18.katas.pokerhands.daniela;

public class Straightidentify extends CompareGame {
    private PokerHandAnalizer analizer;

    public Straightidentify() {
        this.analizer = new PokerHandAnalizer();
    }

    @Override
    public boolean identify(PokerHand hand) {
        ConsecutiveValues consecutiveValues = new ConsecutiveValues();
        return analizer.analize(hand, consecutiveValues);
    }

    @Override
    Rank getidentifyPokerhand() {
        return Rank.STRAIGHT;
    }
}
