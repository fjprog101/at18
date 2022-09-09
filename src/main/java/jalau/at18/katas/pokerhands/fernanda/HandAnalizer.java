package jalau.at18.katas.pokerhands.fernanda;

public class HandAnalizer {
    private RankHand comparehands;
    private PokerHand hand;
    private int totalpoints;

    public HandAnalizer(PokerHand hand) {
        this.hand = hand;
        analizePokerHand();
    }

    public RankHand identifyPokerhand() {
        return comparehands;
    }

    public int gettotalpoints() {
        return totalpoints;
    }

    public void analizePokerHand() {
        for (RankHand typehand : RankHand.values()) {
            if (typehand.identifyPokerhand().identify(hand)) {
                comparehands = typehand.identifyPokerhand().getTypeofHand();
                totalpoints = typehand.getPoint();
            }
        }
    }
}
