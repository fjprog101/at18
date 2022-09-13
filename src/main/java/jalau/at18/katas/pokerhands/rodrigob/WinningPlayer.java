package jalau.at18.katas.pokerhands.rodrigob;

import jalau.at18.katas.pokerhands.rodrigob.Ranks.RankComparer;

public class WinningPlayer {

    private RankComparer rankComparer;

    public WinningPlayer() {
        this.rankComparer = new RankComparer();
    }

    public Player getWinner(Player player1, Player player2) {
        if (rankComparer.compareHands(player1, player2) == 0) {
            return new Player(null, "Tie");
        }
        return rankComparer.compareHands(player1, player2) > 0 ? player1 : player2;
    }


}
