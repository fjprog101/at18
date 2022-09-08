package jalau.at18.katas.pokerhands.daniela;

public class GameAnalizer {

    private Rank comparegame;
    private PokerHand hand;
    private char finalscore;

    public GameAnalizer(PokerHand hand) {
        this.hand = hand;
        analizePokerHand();
    }

    public Rank getidentifyPokerhand() {
        return comparegame;
    }

    public char getscore() {
        return finalscore;
    }

    public void analizePokerHand() {
        for (Rank kind : Rank.values()) {
            if (kind.getidentifyPokerhand().identify(hand)) {
                comparegame = kind.getidentifyPokerhand().getidentifyPokerhand();
                finalscore = kind.getScore();
            }
        }
    }

}
