package jalau.at18.katas.pokerhands.sarai;

public class Straight {

    private PokerHandAnalizer analizer;

    public Straight() {
        this.analizer = new PokerHandAnalizer();
    }

    public boolean identify(PokerHand hand) {
        ConsecutiveValues consecutiveValues = new ConsecutiveValues();
        return analizer.analize(hand, consecutiveValues);
    }

}
