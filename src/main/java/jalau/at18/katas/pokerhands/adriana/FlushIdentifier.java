package jalau.at18.katas.pokerhands.adriana;

public class FlushIdentifier extends HandIdentifier {

    public FlushIdentifier() {
    }

    @Override
    public boolean identify(PokerHand hand) {
        AllSameSuit allSameSuit = new AllSameSuit();
        ConsecutiveValues consecutiveValues = new ConsecutiveValues();
        return allSameSuit.match(hand) && !consecutiveValues.match(hand);
    }

    @Override
    HandKind getKind() {
        return HandKind.FLUSH;
    }
}
