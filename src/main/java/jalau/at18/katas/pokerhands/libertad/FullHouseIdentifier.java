package jalau.at18.katas.pokerhands.libertad;

public class FullHouseIdentifier implements Identifier {
    private PokerHandAnalizer analizer;
    FullHouseIdentifier() {
        analizer = new PokerHandAnalizer();
    }
    @Override
    public boolean identify(PokerHand hand) {
        FullHouse fullHouse = new FullHouse();
        return analizer.analize(hand, fullHouse);
    }
}
