package jalau.at18.katas.pokerhands.sarai;

public class FourOfaKindIdentify extends Cardhigth {
    public FourOfaKindIdentify() {

    }
    @Override
    public Patterns getidentifyOperation() {
        return Patterns.FOURPAIR;
    }
    public boolean identifyFourOfaKind(PokerHand hand) {
        Fourofakind fourofaKindcards = new Fourofakind();
        return fourofaKindcards.match(hand);
    }
}
