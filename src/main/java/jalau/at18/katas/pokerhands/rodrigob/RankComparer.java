package jalau.at18.katas.pokerhands.rodrigob;

public class RankComparer {

    private RankHandIdentifier rankHand;
    private RankCardIdentifier rankCard;

    public RankComparer() {
        this.rankHand = new RankHandIdentifier();
        this.rankCard = new RankCardIdentifier();
    }

    public int compareHands(Player player1, Player player2) {
        if (rankHand.getRankHand(player1.getPlayerHand()) == rankHand.getRankHand(player2.getPlayerHand())) {
            return compareRankCards(player1, player2);
        }
        return rankHand.getRankHand(player1.getPlayerHand()) > rankHand.getRankHand(player2.getPlayerHand()) ? 1 : -1;
    }

    public int compareRankCards(Player player1, Player player2) {
        if (rankCard.getRankCard(player1.getPlayerHand()) == rankCard.getRankCard(player2.getPlayerHand())) {
            return 0;
        }
        return rankCard.getRankCard(player1.getPlayerHand()) > rankCard.getRankCard(player2.getPlayerHand()) ? 1 : -1;
    }
}
