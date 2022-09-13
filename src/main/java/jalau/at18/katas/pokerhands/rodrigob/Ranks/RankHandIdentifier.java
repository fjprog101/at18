package jalau.at18.katas.pokerhands.rodrigob.Ranks;

import jalau.at18.katas.pokerhands.rodrigob.HandsIdentifiers.HandType;
import jalau.at18.katas.pokerhands.rodrigob.HandsIdentifiers.HandsValue;
import jalau.at18.katas.pokerhands.rodrigob.PokerHands.PokerHand;

public class RankHandIdentifier {

    private int rankHand;

    public RankHandIdentifier() {
        this.rankHand = 0;
    }

    public int getRankHand(PokerHand hand) {
        handRank(hand);
        return rankHand;
    }

    public void handRank(PokerHand hand) {
        for (HandsValue list: HandsValue.values()) {
            if (pokerHandIdentifier(hand, list.getHandType())) {
                rankHand = list.getRank();
            }
        }
    }

    public boolean pokerHandIdentifier(PokerHand hand, HandType handType) {
        return handType.identify(hand);
    }

}
