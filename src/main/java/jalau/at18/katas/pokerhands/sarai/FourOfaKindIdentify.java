package jalau.at18.katas.pokerhands.sarai;

public class FourOfaKindIdentify {
    public boolean identifyFourOfaKind(PokerHand hand) {
        Fourofakind fourofaKindcards = new Fourofakind();
        return fourofaKindcards.match(hand);
    }
}
