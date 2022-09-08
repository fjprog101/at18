package jalau.at18.katas.pokerhands.mauricio;

public class WhoIsTheWinner {
    private PokerHand black;
    private PokerHand white;

    public WhoIsTheWinner(PokerHand black, PokerHand white) {
        this.black = black;
        this.white = white;
    }

    public String whoIsTheWInner(CardValue value1, CardValue value2) {
        String winner = (new PairComparer().pairCase(black, white, value1, value2)) ? "Black is winner"
                : "White is winner";
        return winner;
    }
}
