package jalau.at18.katas.pokerhands.rodrigob.Ranks;

import jalau.at18.katas.pokerhands.rodrigob.HandsIdentifiers.HandType;
import jalau.at18.katas.pokerhands.rodrigob.HandsIdentifiers.HandsValue;
import jalau.at18.katas.pokerhands.rodrigob.PokerHands.PokerHand;

public class RankCardIdentifier {

    private int rankCard;

    public RankCardIdentifier() {
        this.rankCard = 0;
    }

    public int getRankCard(PokerHand hand) {
        cardRank(hand);
        return rankCard;
    }

    public void cardRank(PokerHand hand) {
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
