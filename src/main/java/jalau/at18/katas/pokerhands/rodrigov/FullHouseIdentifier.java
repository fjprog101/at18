package jalau.at18.katas.pokerhands.rodrigov;

public class FullHouseIdentifier {
    private PokerHandAnalizer analizer;
    public FullHouseIdentifier() {
        analizer = new PokerHandAnalizer();
    }

    public boolean indentify(PokerHand hand) {
        FullHouse fullHouse = new FullHouse();
        return analizer.analize(hand, fullHouse);
    }
}
