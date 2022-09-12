package jalau.at18.katas.pokerhands.sarai;

public class Straight extends Cardhigth {

    private PokerHandAnalizer analizer;

    public Straight() {
        this.analizer = new PokerHandAnalizer();
    }

    public boolean identify(PokerHand hand) {
        ConsecutiveValues consecutiveValues = new ConsecutiveValues();
        return analizer.analize(hand, consecutiveValues);
    }

    @Override
    Patterns getidentifyOperation() {
        return Patterns.STRAIGHT;
    }
}
