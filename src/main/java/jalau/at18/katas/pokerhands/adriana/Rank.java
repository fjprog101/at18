package jalau.at18.katas.pokerhands.adriana;

public class Rank {

    public int getRank(PokerHand hand) {
        PokerHandAnalizer analizer = new PokerHandAnalizer(hand);
        return analizer.getHandKind().ordinal();
    }
}
