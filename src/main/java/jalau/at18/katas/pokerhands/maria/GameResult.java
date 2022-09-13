package jalau.at18.katas.pokerhands.maria;

public class GameResult {
    private PokerHandRank pokerHandRank;
    private String winnerPlayer;

    public GameResult(PokerHandRank pokerHandRank, String winnerPlayer) {
        this.pokerHandRank = pokerHandRank;
        this.winnerPlayer = winnerPlayer;
    }

    public PokerHandRank getPokerHandRank() {
        return pokerHandRank;
    }

    public String getWinnerPlayer() {
        return winnerPlayer;
    }
}
