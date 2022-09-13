package jalau.at18.katas.pokerhands.hugo;

public class Winner {

    private HandRank playerrank;
    private boolean noTie;

    public Winner() {
        this.playerrank = new HandRank();
        noTie = true;
    }

    public String getWinner(Player white, Player black) {

        PokerHand winnerHand = compareHands(white.getPlayerHand(), black.getPlayerHand());
        if (noTie) {
            return winnerHand.equals(white.getPlayerHand()) ? white.getPlayerName() : black.getPlayerName();
        } else {
            return "Tie";
        }
    }

    public PokerHand compareHands(PokerHand hand1, PokerHand hand2) {
        if (playerrank.getRank(hand1) != playerrank.getRank(hand2)) {
            if (playerrank.getRank(hand1) > playerrank.getRank(hand2)) {
                return hand1;
            } else {
                return hand2;
            }
        } else {
            noTie = false;
            return hand1;
        }
    }
}
