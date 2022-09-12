package jalau.at18.katas.pokerhands.rodrigov;

public class Game {
    private PokerHand hand;
    private int score = 0;
    private Rank rank;

    public Game(PokerHand hand) {
        this.hand = hand;
        analizePokerHand();
    }

    public void analizePokerHand() {
        for (Rank kind : Rank.values()) {
            if (kind.getIdentifyPokerhand().identify(hand)) {
                rank = kind.getIdentifyPokerhand().identifyRank();
                score = kind.getScore();
            }
        }
    }

    public Rank getidentifyPokerHand() {
        return rank;
    }

    public int getScore() {
        return score;
    }
}
