package jalau.at18.katas.pokerhands.joser;

public class Game {
    private PokerHand hand1;
    private PokerHand hand2;

    public Game(PokerHand hand1, PokerHand hand2) {
        this.hand1 = hand1;
        this.hand2 = hand2;
    }

    public int getWin() {
        Patterns intify = new Patterns();
        if (intify.whatPatternIs(this.hand1) < intify.whatPatternIs(this.hand2)) {
            return 1;
        }
        return 2;
    }

}
