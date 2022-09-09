package jalau.at18.katas.pokerhands.rodrigob;

public class WinningPlayer {

    private RankHandIdentifier rankHand;

    public WinningPlayer() {
        this.rankHand = new RankHandIdentifier();

    }

    public String getWinner(Player player1, Player player2) {
        PokerHand winnerHand = compareHands(player1.getPlayerHand(), player2.getPlayerHand());
        return winnerHand.equals(player1.getPlayerHand()) ? player1.getPlayerName() : player2.getPlayerName();
    }

    public PokerHand compareHands(PokerHand hand1, PokerHand hand2) {
        if (rankHand.getRankHand(hand1) > rankHand.getRankHand(hand2)) {
            return hand1;
        }
        return hand2;
    }

    //Class to determine the winner when both players have the same rank hand
    /*public PokerHand equalHands(PokerHand hand1, PokerHand hand2) {

    }*/

}
