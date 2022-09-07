package jalau.at18.katas.pokerhands.maria;

public class FullHouseIdentifier {
    public static final int CARDS_SAME_VALUE = 3;
    private PokerHandAnalizer analizer;

    public FullHouseIdentifier() {
        this.analizer = new PokerHandAnalizer();
    }

    public boolean identify(PokerHand hand) {
        CardsWithSameValue cardsWithSameValueThree = new CardsWithSameValue(CARDS_SAME_VALUE);
        CardsWithSameValue cardsWithSameValueTwo = new CardsWithSameValue(2);

        return analizer.analize(hand, cardsWithSameValueThree) && analizer.analize(hand, cardsWithSameValueTwo);
    }
}
