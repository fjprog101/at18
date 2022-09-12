package jalau.at18.katas.pokerhands.hugo;

public class HandRank {

    private int rank;

    public HandRank() {
        this.rank = 0;
    }

    public int getRankHand(PokerHand hand) {
        for (HandRanks list : HandRanks.values()) {
            if (pokerHandIdentifier(hand, list.getHandType())) {
                rank = list.getHandRank();
            }
        }
        return rank;
    }

    public boolean pokerHandIdentifier(PokerHand hand, HandIdentifier handType) {
        return handType.identify(hand);
    }
}
