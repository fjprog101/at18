package jalau.at18.katas.pokerhands.maria;

public class TwoPairsIdentifier {
    private PokerHandAnalizer analizer;

    public TwoPairsIdentifier() {
        this.analizer = new PokerHandAnalizer();
    }

    public boolean identify(PokerHand hand) {
        CardsWithTwoPairs cardsWithTwoPairs = new CardsWithTwoPairs();
        return analizer.analize(hand, cardsWithTwoPairs);
    }

}
