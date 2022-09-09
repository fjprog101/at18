package jalau.at18.katas.pokerhands.rodrigob;

public class RankCardIdentifier {

    private int rankCard;

    public RankCardIdentifier() {
        this.rankCard = 0;
    }

    public int getRankHand(PokerHand hand) {
        handRank(hand);
        return rankCard;
    }

    public void handRank(PokerHand hand) {
        for (HandsValue list: HandsValue.values()) {
            if (pokerHandIdentifier(hand, list.getHandType())) {
                rankCard = list.getHandType().getCardRankedValue(hand);
            }
        }
    }

    public boolean pokerHandIdentifier(PokerHand hand, HandType handType) {
        return handType.identify(hand);
    }

}
