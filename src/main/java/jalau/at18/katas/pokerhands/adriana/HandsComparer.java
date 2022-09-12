package jalau.at18.katas.pokerhands.adriana;

public class HandsComparer {
    private PokerHand playerA;
    private PokerHand playerB;

    public HandsComparer(PokerHand playerA, PokerHand playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
    }
    public String getWinner() {
        Rank rank = new Rank();
        String winner = rank.getRank(playerA) != rank.getRank(playerB) ? handWithHighestRank() : handWithHighestCard();
        return winner;
    }
    public String handWithHighestRank() {
        Rank rank = new Rank();
        String winner = rank.getRank(playerA) > rank.getRank(playerB) ? playerA.getPlayer() : playerB.getPlayer();
        return winner;
    }
    public String handWithHighestCard() {
        Rank rank = new Rank();
        String winner = rank.getCardRank(playerA) != rank.getCardRank(playerB) ? handWithHighestRankCard() : handWithHighestSum();
        return winner;
    }
    public String handWithHighestRankCard() {
        Rank rank = new Rank();
        String winner = rank.getCardRank(playerA) > rank.getCardRank(playerB) ? playerA.getPlayer() : playerB.getPlayer();
        return winner;
    }
    public String handWithHighestSum() {
        Rank rank = new Rank();
        String winner = rank.sumOfCards(playerA) > rank.sumOfCards(playerB) ? playerA.getPlayer() : playerB.getPlayer();
        return winner;
    }
}
