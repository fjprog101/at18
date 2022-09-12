package jalau.at18.katas.pokerhands.hugo;

public class HandRank {

    private int rank;

    public HandRank() {
        this.rank = 0;
    }

    public int getRank(PokerHand hand) {
        for (HandRanks list : HandRanks.values()) {
            if (handIdentifier(hand, list.getHandType())) {
                rank = list.getHandRank();
            }
        }
        return rank;
    }

    public boolean handIdentifier(PokerHand hand, HandIdentifier handTypes) {
        return handTypes.identify(hand);
    }
}
