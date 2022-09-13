package jalau.at18.katas.pokerhands.mauricio;

public class WhoIsTheWinner {
    private PokerHand black;
    private PokerHand white;

    public WhoIsTheWinner(PokerHand black, PokerHand white) {
        this.black = black;
        this.white = white;
    }

    public String whoIsTheWInnerPerHands(CardValue value1, CardValue value2) {
        String winner = (new PairComparer().blackHandWinnerForPairCase(black, white, value1, value2)) ? "Black is winner"
                : "White is winner";
        return winner;
    }

    public String whoIsTheWInnerPerValue() {
        String winner = (new PokerHandComparer().compareValues(black, white, new HighValue())) ? "Black is winner"
                : "White is winner";
        return winner;
    }
}
