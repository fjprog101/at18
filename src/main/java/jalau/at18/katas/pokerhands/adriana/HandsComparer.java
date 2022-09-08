package jalau.at18.katas.pokerhands.adriana;

public class HandsComparer {
    private PokerHand playerA;
    private PokerHand playerB;

    public HandsComparer(PokerHand playerA, PokerHand playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
    }

    public String getWinner() {
        String winner = rankHandsEquals() ? handWithHighestCard() : handWithHighestRank();
        return winner;
    }
    public boolean rankHandsEquals() {
        Rank rank = new Rank();
        return rank.getRank(playerA) == rank.getRank(playerB);
    }
    public String handWithHighestRank() {
        Rank rank = new Rank();
        String winner = rank.getRank(playerA) > rank.getRank(playerB) ? playerA.getPlayer() : playerB.getPlayer();
        return winner;
    }
    public String handWithHighestCard() {
        Rank rank = new Rank();
        String winner = rank.getHighestCard(playerA) > rank.getHighestCard(playerB) ? playerA.getPlayer() : playerB.getPlayer();
        return winner;
    }
}
