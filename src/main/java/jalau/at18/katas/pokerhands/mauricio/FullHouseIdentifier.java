package jalau.at18.katas.pokerhands.mauricio;

public class FullHouseIdentifier implements IndetifyHand {
    private PokerHandAnalizer analizer;
    private CardValue value1;
    private CardValue value2;

    public FullHouseIdentifier(CardValue value1, CardValue value2) {
        this.analizer = new PokerHandAnalizer();
        this.value1 = value1;
        this.value2 = value2;
    }

    public boolean identify(PokerHand hand) {
        AllSameSuit allSameSuit = new AllSameSuit();
        FullHouse fullHouse = new FullHouse(value1, value2);
        return analizer.analize(hand, fullHouse) && !analizer.analize(hand, allSameSuit);
    }
}
