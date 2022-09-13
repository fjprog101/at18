package jalau.at18.katas.pokerhands.daniela;

public class HighCardIdentifier extends CompareGame {
    private PokerHandAnalizer analizer;

    public HighCardIdentifier() {
        this.analizer = new PokerHandAnalizer();

    }

    @Override
    public boolean identify(PokerHand hand) {
        HighCard highcard = new HighCard();
        return analizer.analize(hand, highcard);
    }

    @Override
    Rank getidentifyPokerhand() {
        return Rank.HIGHCARD;
    }
}
