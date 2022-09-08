package jalau.at18.katas.pokerhands.fernanda;

public class PokerHandAnalizer {
    private RankHand rankhand;

    public boolean analize(PokerHand hand, CardsPattern pattern) {
        return pattern.match(hand);
    }

    public RankHand getRankHand() {
        return rankhand;
    }
}
