package jalau.at18.katas.pokerhands.adriana;

public class StraightFlushIdentifier extends HandIdentifier {

    public StraightFlushIdentifier() {
    }

    @Override
    public boolean identify(PokerHand hand) {
        AllSameSuit allSameSuit = new AllSameSuit();
        ConsecutiveValues consecutiveValues = new ConsecutiveValues();
        return allSameSuit.match(hand) && consecutiveValues.match(hand);
    }
    @Override
    public HandKind getKind() {
        return HandKind.STRAIGHT_FLUSH;
    }
}
