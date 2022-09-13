package jalau.at18.katas.pokerhands.rodrigov;

public class FullHouseIdentifier extends Identifier {
    private PokerHandAnalizer analizer;
    public FullHouseIdentifier() {
        analizer = new PokerHandAnalizer();
    }

    @Override
    boolean identify(PokerHand hand) {
        FullHouse fullHouse = new FullHouse();
        return analizer.analize(hand, fullHouse);
    }

    @Override
    Rank identifyRank() {
        return Rank.FULLHOUSE;
    }
}
