package jalau.at18.katas.pokerhands.hugo;

public class Winner {

    private HandRank playerrank;

    public Winner() {
        this.playerrank = new HandRank();
    }

    public String getWinner(Player white, Player black) {
        PokerHand winnerHand = compareHands(white.getPlayerHand(), black.getPlayerHand());
        return winnerHand.equals(white.getPlayerHand()) ? white.getPlayerName() : black.getPlayerName();
    }

    public PokerHand compareHands(PokerHand hand1, PokerHand hand2) {
        if (playerrank.getRank(hand1) > playerrank.getRank(hand2)) {
            return hand1;
        }
        return hand2;
    }
}
