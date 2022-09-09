package jalau.at18.katas.pokerhands.alvaro;

public class FullHouseIdentifier {
    private PokerHandAnalizer analizer;
    public FullHouseIdentifier() {
        this.analizer = new PokerHandAnalizer();
    }
    public boolean identify(PokerHand fullHouseHand) {
        FullHouse fullHouse = new FullHouse();
        return analizer.analize(fullHouseHand, fullHouse);

    }
}
