package jalau.at18.katas.pokerhands.sarai;

public class Winner {
    private PokerHand black;
    private PokerHand white;

    public Winner(PokerHand black, PokerHand white) {
        this.black = black;
        this.white = white;
    }

    public String getWin() {
        IdentifyPattern intify = new IdentifyPattern();
        if (intify.getidentifyPatterns(this.black) < intify.getidentifyPatterns(this.white)) {
            return "black";
        }
        return "white";
    }
}
