package jalau.at18.katas.pokerhands.adriana;

public class PokerHandAnalizer {

    private HandKind handKind;
    private PokerHand hand;

    public PokerHandAnalizer(PokerHand hand) {
        this.hand = hand;
        analize();
    }

    public HandKind getHandKind() {
        return handKind;
    }

    public void analize() {
        for (HandKind kind : HandKind.values()) {
            if (kind.getIdentifier().identify(hand)) {
                handKind = kind.getIdentifier().getKind();
            }
        }
    }

    public int getHighestCard() {
        return handKind.getIdentifier().getHighest(hand);
    }
}
