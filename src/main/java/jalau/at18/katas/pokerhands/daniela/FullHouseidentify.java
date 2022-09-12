package jalau.at18.katas.pokerhands.daniela;

public class FullHouseidentify extends CompareGame {
    private PokerHandAnalizer analizer;

    public FullHouseidentify() {
        this.analizer = new PokerHandAnalizer();
    }

    @Override
    public boolean identify(PokerHand hand) {
        FullHouse fullhouse = new FullHouse();
        return analizer.analize(hand, fullhouse);
    }

    @Override
    Rank getidentifyPokerhand() {
        return Rank.FULLHOUSE;
    }
}
