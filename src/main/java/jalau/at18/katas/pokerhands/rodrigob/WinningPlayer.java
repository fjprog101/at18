package jalau.at18.katas.pokerhands.rodrigob;

import jalau.at18.katas.pokerhands.rodrigob.Ranks.RankComparer;

public class WinningPlayer {

    private RankComparer rankComparer;

    public WinningPlayer() {
        this.rankComparer = new RankComparer();
    }

    public String getWinner(Player player1, Player player2) {
        if (rankComparer.compareHands(player1, player2) == 0) {
            return "Tie";
        }
        return rankComparer.compareHands(player1, player2) > 0 ? player1.getPlayerName() : player2.getPlayerName();
    }
}
